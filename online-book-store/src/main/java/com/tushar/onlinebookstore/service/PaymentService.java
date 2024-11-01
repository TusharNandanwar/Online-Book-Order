package com.tushar.onlinebookstore.service;

import java.util.Set;

import com.tushar.onlinebookstore.entity.Customer;
import com.tushar.onlinebookstore.entity.PurchaseDetail;
import com.tushar.onlinebookstore.entity.PurchaseHistory;

public interface PaymentService {

	String createTransaction(Customer customer);
	
	Set<PurchaseHistory> getPurchaseHistories(Customer customer);
	
	Set<PurchaseDetail> getPurchaseDetails(PurchaseHistory purchaseHistory);

	PurchaseHistory getPurchaseHistory(Customer customer, String transId);
}
