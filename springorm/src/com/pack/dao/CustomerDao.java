package com.pack.dao;

import java.util.List;

import com.pack.form.Customer;

public interface CustomerDao {
	public void addCustomer(Customer c) ;
		// TODO Auto-generated method stub
		
	
	public void updateCustomer(Customer c);
	public Customer getCustomerById(int customerid);
	public List<Customer> listCustomer();
	public void removeCustomer(int id);
}
