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

    @Autowired
    public GenericRepository(MongoTemplate mongoTemplate) {
        this.mongoTemplate = mongoTemplate;
    }

    public <T> T save(T entity) {
        mongoTemplate.save(entity);
        return entity;
    }

    public <T> T findById(Class<T> clazz, String id) {
        return mongoTemplate.findById(id, clazz);
    }

    public <T> void delete(T entity) {
        mongoTemplate.remove(entity);
    }

    public <T> List<T> findAll(Class<T> clazz) {
        return mongoTemplate.findAll(clazz);
    }

    public <T> List<T> findByField(Class<T> clazz, String fieldName, Object value) {
        Query query = new Query(Criteria.where(fieldName).is(value));
        return mongoTemplate.find(query, clazz);
    }
}
