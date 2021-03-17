package com.PKart.controller;

import java.text.ParseException;
import java.util.Scanner;

import com.PKart.util.InputUtil;
public class MainController {

	public static void main(String[] args) {

		runApplication();

	}

	 static void runApplication()  {

		Scanner scanner = InputUtil.getScanner();
		System.out.println("------WELCOME TO PKart-------");
		System.out.println("1. Customer \n 2.Admin \n   3.Exit");

		System.out.println("Enter your choice:");
		int choice = scanner.nextInt();

		switch (choice) {

		case 1:
			CustomerController customerController = new CustomerController();
			customerController.operations();					// calling Customer Controller
			break;

		case 2:
			AdminController adminController = new AdminController();
			adminController.operations();	//Calling Admin Controller
			break;
		case 3:
			System.out.println("logout..!");
			System.exit(1);
			

		}

	}
}
