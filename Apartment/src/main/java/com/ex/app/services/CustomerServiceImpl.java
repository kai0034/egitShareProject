package com.ex.app.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.ex.app.dao.CustomerDao;
import com.ex.app.domain.Customer;

@Transactional
@Service("registerServiceImpl")
public class CustomerServiceImpl implements CustomerService{

	@Autowired
	@Qualifier("customerRegisterDaoImpl")
	private CustomerDao cusDao;
	
	@Override
	public Customer storeCustomer(Customer cus) {
		// TODO Auto-generated method stub
		return cusDao.storeCustomer(cus);
	}

	@Override
	public Customer findCustomerById(int id) {
		// TODO Auto-generated method stub
		return cusDao.findCustomerById(id);
	}

}
