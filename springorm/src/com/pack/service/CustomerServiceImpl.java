package com.pack.service;
//bean class
import java.util.List;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.pack.dao.CustomerDao;
import com.pack.form.Customer;
@Service //indicates a service class
public class CustomerServiceImpl implements CustomerService {
	
	private CustomerDao customerDao;
	@Transactional //for AOP transaction
	public void addCustomer(Customer c) {
		// TODO Auto-generated method stub
		customerDao.addCustomer(c);
	}

	public void setCustomerDao(CustomerDao customerDao) {
		this.customerDao = customerDao;
	}

	@Transactional
	public void updateCustomer(Customer c) {
		// TODO Auto-generated method stub
		customerDao.updateCustomer(c);
	}

	@Transactional
	public Customer getCustomerById(int customerid) {
		// TODO Auto-generated method stub
		
		return customerDao.getCustomerById(customerid);
	}

	@Transactional
	public List<Customer> listCustomer() {
		// TODO Auto-generated method stub
		List<Customer> l=customerDao.listCustomer();
		
		return l;
	}

	@Transactional
	public void removeCustomer(int id) {
		// TODO Auto-generated method stub
		customerDao.removeCustomer(id);
	}

}
