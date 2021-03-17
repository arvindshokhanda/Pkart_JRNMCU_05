package com.PKart.testcases;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import com.PKart.model.Customer;
import com.PKart.service.CustomerServiceImpl;

class CustomerServiceImplTest {
	private CustomerServiceImpl customerServiceImpl;

	@BeforeEach
	void setUp() throws Exception {
		customerServiceImpl = new CustomerServiceImpl();
	}

	@AfterEach
	void tearDown() throws Exception {
		customerServiceImpl = null;
	}

	@Test
	void testAddCustomer() {

		Customer customer = new Customer(1, "hunky","tanm@gmail.com","123654789", "Chor Bazar Puraani delhi Lal kila k picche" );
		boolean result = customerServiceImpl.addCustomer(customer);
		assertEquals(true, result);
	}

}
