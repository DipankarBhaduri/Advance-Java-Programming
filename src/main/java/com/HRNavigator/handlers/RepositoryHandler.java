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

    public List<Object> findAllDocuments(Class<?> clazz) {
        return Collections.singletonList(genericRepository.findAll(clazz));
    }

    public void saveAllDocuments(Class<?> clazz, List<Object> documents) {
        documents.forEach(document -> genericRepository.save(document));
    }

    public void saveDocument(Class<?> clazz, Object document) {
        genericRepository.save(document);
    }

    public Object findDocumentById(Class<?> clazz, String id) {
        return genericRepository.findById(clazz, id);
    }

    public List findDocumentByFieldName(Class<?> clazz, String fieldName, String fieldValue) {
        return genericRepository.findByField(clazz, fieldName, fieldValue);
    }
}
