package com.tushar.onlinebookstore.service;

import java.util.Collection;
import java.util.List;
import java.util.Set;

import com.tushar.onlinebookstore.entity.Book;
import com.tushar.onlinebookstore.entity.Customer;
import com.tushar.onlinebookstore.entity.ShoppingCart;

public interface ShoppingCartService {

	public Set<ShoppingCart> getAllItems(Customer customer);
		
	public String addItem(Customer customer, Book book);

	public String increaseItem(Customer customer, Book book, int count);
	
	public String removeItem(Customer customer, Book book);

	String decreaseItem(Customer customer, Book book, int count);

	public Set<ShoppingCart> getByUsername(Customer customer);
	
}
