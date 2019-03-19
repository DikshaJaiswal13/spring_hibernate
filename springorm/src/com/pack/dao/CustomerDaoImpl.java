package com.pack.dao;
//bean class
import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
//here we will communicate with the database
import org.springframework.stereotype.Repository;

import com.pack.form.Customer;
@Repository //indicates a dao class
public class CustomerDaoImpl implements CustomerDao {

	@Override
	public void addCustomer(Customer c) {
		// TODO Auto-generated method stub
		sessionFactory.getCurrentSession().save(c);
	}

	@Override
	public void updateCustomer(Customer c) {
		// TODO Auto-generated method stub
		sessionFactory.getCurrentSession().update(c);
	}

	@Override
	public Customer getCustomerById(int customerid) {
		// TODO Auto-generated method stub
		Session s=sessionFactory.getCurrentSession();
		Customer c=(Customer)s.get(Customer.class, customerid);
		
		return c;
	}

	@Override
	public List<Customer> listCustomer() {
		// TODO Auto-generated method stub
		
		return sessionFactory.getCurrentSession().createQuery("from Customer").list();
	}

	@Override
	public void removeCustomer(int id) {
		// TODO Auto-generated method stub
		Session s=sessionFactory.getCurrentSession();
		Customer c=(Customer)s.get(Customer.class, id); //Customer c will contain 1 object
		if(c!=null){
			s.delete(c);
		}
	}

		private SessionFactory sessionFactory;

		public void setSessionFactory(SessionFactory sessionFactory) {
			this.sessionFactory = sessionFactory;
		}
}
