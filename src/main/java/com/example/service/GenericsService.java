package com.example.service;

public interface GenericsService<T,U> {

	public void genericsUsingInterface(T text);

	void genericsUsingInterface(String text);

	public void genericsUsingInterface(T t ,U u);
}
