package com.ex.app.dao.hibernate;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.ex.app.dao.CustomerDao;
import com.ex.app.domain.Customer;

@Repository("customerRegisterDaoImpl")
@Transactional(readOnly=true)
public class CustomerDaoImpl implements CustomerDao{
	
	@Autowired
	private SessionFactory sessionFactory;

	@Override
	public Customer storeCustomer(Customer cus) {
		Session session = sessionFactory.getCurrentSession();
		session.saveOrUpdate(cus);
		return cus;
	}

	@Override
	public Customer findCustomerById(int id) {
		// TODO Auto-generated method stub
		Session session = sessionFactory.getCurrentSession();
		Customer cus = (Customer) session.get(Customer.class,id);
		
		return cus;
	}

	@Override
	public void deleteCustomerById(int id) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public List<Customer> findAllCustomer() {
		// TODO Auto-generated method stub
		return null;
	}

}
