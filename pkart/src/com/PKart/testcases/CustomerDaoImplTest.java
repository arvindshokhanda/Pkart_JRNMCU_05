	package com.PKart.testcases;
	
	import static org.junit.Assert.assertNotEquals;
import static org.junit.jupiter.api.Assertions.*;
	
	import org.junit.jupiter.api.AfterEach;
	import org.junit.jupiter.api.BeforeEach;
	import org.junit.jupiter.api.Test;

import com.PKart.dao.CustomerDaoImpl;
import com.PKart.model.Customer;
	import com.PKart.model.Product;
	
	class CustomerDaoImplTest {
		private CustomerDaoImpl customerDao;
		@BeforeEach
		void setUp() throws Exception {
			customerDao = new CustomerDaoImpl();
		}
	
		@AfterEach
		void tearDown() throws Exception {
			customerDao = null;
		}
	
		@Test
		void testViewCustomer() {
			Customer customer = new Customer(1, "hunky","tanm@gmail.com","123654789", "Chor Bazar Puraani delhi Lal kila k picche" );
			customerDao.addCustomer(customer);
			Customer c = customerDao.viewCustomer(1);
			assertEquals(customer.getId(), c.getId());
			System.out.println("yeah!!!!!");
			
		}@Test
		void testViewCustomerNotValid() {
			Customer customer = new Customer(1, "hunky","tanm@gmail.com","123654789", "Chor Bazar Puraani delhi Lal kila k picche" );
			customerDao.addCustomer(customer);
			Customer c = customerDao.viewCustomer(2);
			assertNotEquals("Naah!!",customer, c);
			System.out.println("Naah!!!!");
			
			
		}
	
	}
