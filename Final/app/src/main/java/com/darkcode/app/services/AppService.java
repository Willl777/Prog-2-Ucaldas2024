package com.darkcode.app.services;

import java.util.List;

public interface AppService<T> {
	void create(T entity);
	T edit(Long id);
	List<T> findAll(); 
}
