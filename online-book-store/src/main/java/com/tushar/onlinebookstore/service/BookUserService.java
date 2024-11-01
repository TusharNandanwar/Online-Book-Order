package com.tushar.onlinebookstore.service;

import java.util.Set;

import com.tushar.onlinebookstore.entity.Book;
import com.tushar.onlinebookstore.entity.Customer;

public interface BookUserService {

	Set<Book> getBooksPurchasedBy(Customer customer);

}
