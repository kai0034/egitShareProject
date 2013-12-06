package com.ex.app.dao;

import java.util.List;

import com.ex.app.domain.Customer;

public interface CustomerDao {
	public Customer storeCustomer(Customer cus);
	public Customer findCustomerById(int id);
	public void deleteCustomerById(int id);
	public List<Customer> findAllCustomer();

}
