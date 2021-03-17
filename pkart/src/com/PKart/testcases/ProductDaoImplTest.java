package com.PKart.testcases;

import static org.junit.Assert.assertNotEquals;
import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import com.PKart.dao.ProductDaoImpl;
import com.PKart.model.Product;

class ProductDaoImplTest {
	private ProductDaoImpl productDao;

	@BeforeEach
	void setUp() throws Exception {
		productDao = new ProductDaoImpl(); 
	}

	@AfterEach
	void tearDown() throws Exception {
		productDao = null;
	}
	@Test
	void testViewProduct() {
		Product p1 = new Product(1, "pikachu", 12, 1, "12-02-2020", "09-08-2021");
		productDao.addProduct(p1);
		Product p2 = productDao.viewProduct(1);
		assertEquals(p1.getId(), p2.getId());
		System.out.println("yeah!!!!!");
	}
	@Test
	void testViewProductNotValid() {
		Product p1 = new Product(1, "pikachu", 12, 1, "12-02-2020", "09-08-2021");
		productDao.addProduct(p1);
		Product p2 = productDao.viewProduct(2);
		assertNotEquals("Nahh",p1, p2);
		System.out.println("Naahhh!!!!!");
	}

}
