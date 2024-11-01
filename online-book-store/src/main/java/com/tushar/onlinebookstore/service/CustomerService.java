package com.tushar.onlinebookstore.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.tushar.onlinebookstore.entity.Customer;
import com.tushar.onlinebookstore.entity.User;
import com.tushar.onlinebookstore.forms.entity.ChangePassword;
import com.tushar.onlinebookstore.forms.entity.CustomerData;

public interface CustomerService {

	public List<Customer> getAllCustomers();
	
	public Customer getCustomer(String username);
		
	public String saveCustomer(Customer theCustomer);
	
	public String updateCustomer(Customer theCustomer);
	
	public String removeCustomer(Customer theCustomer);
	
	public String registerCustomer(CustomerData data);

	public CustomerData getCustomerData(String username);

	public String updateCustomer(CustomerData customerData);
	
	public String updatePassword(ChangePassword changePassword);
	
}
