package com.ex.app.services;

import com.ex.app.domain.Customer;

public interface CustomerService {

	public Customer storeCustomer(Customer cus);
	public Customer findCustomerById(int id);
}
