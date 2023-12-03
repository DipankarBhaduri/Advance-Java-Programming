package com.HRNavigator.repository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.mongodb.core.MongoTemplate;
import org.springframework.data.mongodb.core.query.Criteria;
import org.springframework.data.mongodb.core.query.Query;
import org.springframework.stereotype.Repository;
import java.util.List;

@Repository
public class GenericRepository {

    private final MongoTemplate mongoTemplate;

    /**
     * Constructs a GenericRepository with the provided MongoTemplate.
     *
     * @param mongoTemplate The MongoTemplate used for database interactions.
     */
    @Autowired
    public GenericRepository(MongoTemplate mongoTemplate) {
        this.mongoTemplate = mongoTemplate;
    }

    /**
     * Saves the provided entity to the database.
     *
     * @param entity The entity to save.
     * @param <T>    The type of the entity.
     * @return The saved entity.
     */
    public <T> T save(T entity) {
        mongoTemplate.save(entity);
        return entity;
    }

    /**
     * Finds and returns an entity by its unique identifier (ID) and class.
     *
     * @param clazz The Class object representing the type of entity to retrieve.
     * @param id    The unique identifier (ID) of the entity to find.
     * @param <T>   The type of the entity.
     * @return The found entity or null if not found.
     */
    public <T> T findById(Class<T> clazz, String id) {
        return mongoTemplate.findById(id, clazz);
    }

    /**
     * Deletes the provided entity from the database.
     *
     * @param entity The entity to delete.
     * @param <T>    The type of the entity.
     */
    public <T> void delete(T entity) {
        mongoTemplate.remove(entity);
    }

    /**
     * Finds and returns all entities of the specified class.
     *
     * @param clazz The Class object representing the type of entities to retrieve.
     * @param <T>   The type of the entities.
     * @return List of entities of the specified class.
     */
    public <T> List<T> findAll(Class<T> clazz) {
        return mongoTemplate.findAll(clazz);
    }

    /**
     * Finds and returns entities of the specified class based on a specific field value.
     *
     * @param clazz      The Class object representing the type of entities to retrieve.
     * @param fieldName  The name of the field to search for.
     * @param value      The value to match in the specified field.
     * @param <T>        The type of the entities.
     * @return List of entities matching the specified field and value.
     */
    public <T> List<T> findByField(Class<T> clazz, String fieldName, Object value) {
        Query query = new Query(Criteria.where(fieldName).is(value));
        return mongoTemplate.find(query, clazz);
    }
}
