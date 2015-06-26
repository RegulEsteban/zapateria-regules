package org.zapateria.toluca.config;

import java.io.Serializable;
import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;

import org.springframework.cassandra.core.util.CollectionUtils;
import org.springframework.data.cassandra.core.CassandraOperations;
import org.springframework.data.repository.CrudRepository;

public abstract class GenericCassandraRepository<T, ID extends Serializable> implements CrudRepository<T, ID> {
	 
    private Class<T> persistentClass;
    private CassandraOperations operations;
 
    @SuppressWarnings("unchecked")
	public GenericCassandraRepository(CassandraOperations operations) {
        Type type = getClass().getGenericSuperclass();
        if (type instanceof ParameterizedType) {
            ParameterizedType parameterizedType = (ParameterizedType) type;
            setPersistentClass((Class<T>) parameterizedType.getActualTypeArguments()[0]);
        } else {
            System.out.println("Not an instance of parameterized type: " + type);
        }
 
        setOperations(operations);
    }
 
    public Class<T> getPersistentClass() {
        return persistentClass;
    }
 
    public void setPersistentClass(Class<T> persistentClass) {
        this.persistentClass = persistentClass;
    }
 
    public CassandraOperations getOperations() {
        return operations;
    }
 
    public void setOperations(CassandraOperations operations) {
        this.operations = operations;
    }
 
    @Override
    public <S extends T> S save(S entity) {
        return getOperations().insert(entity);
    }
 
    @Override
    public <S extends T> Iterable<S> save(Iterable<S> entities) {
        return getOperations().insert(CollectionUtils.toList(entities));
    }
 
    @Override
    public T findOne(ID id) {
        return getOperations().selectOneById(getPersistentClass(), id);
    }
 
    @Override
    public boolean exists(ID id) {
        return getOperations().exists(getPersistentClass(), id);
    }
 
    @Override
    public Iterable<T> findAll() {
        return getOperations().selectAll(getPersistentClass());
    }
 
    @Override
    public Iterable<T> findAll(Iterable<ID> entities) {
        return getOperations().selectBySimpleIds(getPersistentClass(), entities);
    }
 
    @Override
    public long count() {
        return getOperations().count(getPersistentClass());
    }
 
    @Override
    public void delete(ID id) {
        getOperations().deleteById(getPersistentClass(), id);
    }
 
    @Override
    public void delete(T entity) {
        getOperations().delete(entity);
    }
 
    @Override
    public void delete(Iterable<? extends T> entities) {
        getOperations().delete(CollectionUtils.toList(entities));
    }
 
    @Override
    public void deleteAll() {
        getOperations().deleteAll(getPersistentClass());
    }
}