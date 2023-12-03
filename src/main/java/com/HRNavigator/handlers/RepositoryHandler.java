package com.HRNavigator.handlers;

import com.HRNavigator.repository.GenericRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.Collections;
import java.util.List;

@Service
public class RepositoryHandler {
    @Autowired
    private GenericRepository genericRepository;

    /**
     * Finds and returns all documents of the specified class.
     *
     * @param clazz The Class object representing the type of documents to retrieve.
     * @return List of objects representing all documents of the specified class.
     */
    public List<Object> findAllDocuments(Class<?> clazz) {
        return Collections.singletonList(genericRepository.findAll(clazz));
    }

    /**
     * Saves all documents in the provided list for the specified class.
     *
     * @param clazz     The Class object representing the type of documents to save.
     * @param documents List of documents to save.
     */
    public void saveAllDocuments(Class<?> clazz, List<Object> documents) {
        documents.forEach(document -> genericRepository.save(document));
    }

    /**
     * Saves the provided document for the specified class.
     *
     * @param clazz    The Class object representing the type of document to save.
     * @param document The document to save.
     */
    public void saveDocument(Class<?> clazz, Object document) {
        genericRepository.save(document);
    }

    /**
     * Finds and returns a document by its unique identifier (ID) for the specified class.
     *
     * @param clazz The Class object representing the type of document to retrieve.
     * @param id    The unique identifier (ID) of the document to find.
     * @return Object representing the found document or null if not found.
     */
    public Object findDocumentById(Class<?> clazz, String id) {
        return genericRepository.findById(clazz, id);
    }

    /**
     * Finds and returns documents of the specified class based on a specific field value.
     *
     * @param clazz      The Class object representing the type of documents to retrieve.
     * @param fieldName  The name of the field to search for.
     * @param fieldValue The value to match in the specified field.
     * @return List of documents matching the specified field and value.
     */
    public List findDocumentByFieldName(Class<?> clazz, String fieldName, String fieldValue) {
        return genericRepository.findByField(clazz, fieldName, fieldValue);
    }
}
