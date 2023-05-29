package com.mattiabonardi;

import java.util.Iterator;

/**
 * 
 * @author mattia.bonardi
 *
 */

/*
 * The generic interface of Daos in the application
 * 
 * @param <T>
 */
public interface Dao<T> {

	public T getById(String id);

	public Iterator<T> getAll();

	public void save(T t);

	public void update(T t);

	public void deleteById(String id);
}
