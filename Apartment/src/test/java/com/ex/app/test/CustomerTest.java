package com.ex.app.test;

import static org.junit.Assert.*;

import org.apache.log4j.Logger;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import com.ex.app.domain.Customer;
import com.ex.app.services.CustomerService;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = { "/test.xml" })
public class CustomerTest {

	private static Logger logger = Logger.getLogger(CustomerTest.class);
	
	@Autowired
	@Qualifier("registerServiceImpl")
	private CustomerService registService;
	
	private Customer cus;
	
	@Before
	public void setUp(){
		
		cus = new Customer();
		cus.setFirstName("Korakrit");
		cus.setLastName("Pankaew");
		cus.setEmail("takor_kai@hotmail.com");
		cus.setPhone("4158239215");
		
	}
	
	
	@Test
	public void testStoreCustomer(){
		Customer cTest;
		cTest = registService.storeCustomer(cus);
		logger.debug(cus);
		
		assertEquals("Korakrit",cTest.getFirstName());
	}
	
	@Test
	public void testFindCustomer(){
		int id = 1;
		Customer cus = registService.findCustomerById(id);
		logger.debug(cus);
		assertEquals("Korakrit",cus.getFirstName());
		
	}
	
}
