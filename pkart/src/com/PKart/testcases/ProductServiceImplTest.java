package com.PKart.testcases;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.Assert;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import com.PKart.model.Product;
import com.PKart.service.ProductServiceImpl;

class ProductServiceImplTest {
	private ProductServiceImpl productServiceImpl;
	@BeforeEach
	void setUp() throws Exception {
		productServiceImpl = new ProductServiceImpl();
	}

	@AfterEach
	void tearDown() throws Exception {
		productServiceImpl = null;
	}

	@Test
	void testAddProduct() {
		Product product = new Product(1,"oil", 1, 1, "2022-01-12", "2023-01-12");
		boolean result = productServiceImpl.addProduct(product);
		assertEquals(true, result);
	}

}
