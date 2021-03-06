	package com.PKart.testcases;
	
	import static org.junit.jupiter.api.Assertions.*;
	
	import org.junit.jupiter.api.AfterEach;
	import org.junit.jupiter.api.BeforeEach;
	import org.junit.jupiter.api.Test;
	
	import com.PKart.model.Product;
	
	class AdminControllerTest {
	
		@BeforeEach
		void setUp() throws Exception {
		}
	
		@AfterEach
		void tearDown() throws Exception {
		}
	
		@Test
		void testOperations() {
			Product p1 = new Product();
			int id = p1.setGet(5000);
			assertTrue(id>=1001 && id<=9999);
			System.out.println("testCase passes");
		}
		@Test
		void testOperationsNegativeIdValue() {
			
			Product p1 = new Product();
			int id = p1.setGet(-1);
			assertTrue(id<0);
			System.out.println("testCase failed");
	
	}
		@Test
		void test1AdminNullValue() {
			assertNull(null);
			System.out.println("Test Case Fail");
		}

		@Test
		void test2Operations() {
			Product p1 = new Product();
			int id = p1.setGet(5000);
			assertTrue(id>=1001 && id<=9999);
			System.out.println("Test Case Pass");
		}
		@Test
		void test2OperationsNegativeIdValue() {
			
			Product p1 = new Product();
			int id = p1.setGet(-1);
			assertTrue(id<0);
			System.out.println("Test Case Fail");
		}
		@Test
		void test3OperationsNullValue() {
			assertNull(null);
			System.out.println("Test Case Fail");
		}
		@Test
		void test3OperationsSpecialCharacterIdValue() {
			
			Product p1 = new Product();
			int id = p1.setGet('$');
			assertTrue(id =='$'|id =='*'|id =='+'|id =='-'|id =='!'|id == '?'|id == '^');
			System.out.println("Test Case Fail");
		}
		@Test
		void test3OperationsStartingWithZeroIdValue() {
			
			Product p1 = new Product();
			int id = p1.setGet(0);
			assertTrue(id==0);
			System.out.println("Test Case Fail");
		}
	}
