package com.rhanem;

import com.rhanem.model.Customer;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.util.AbstractList;
import java.util.ArrayList;
import java.util.List;

@SpringBootApplication
public class SchoolApplication {
	private static List<Customer> customers;

	static {
		customers = new ArrayList<>();

		Customer alex = new Customer(1, "Alex", "A@gmail", 21);
		customers.add(alex);

		Customer jamila = new Customer(2, "jamila", "jamila@gmail", 21);
		customers.add(jamila);
	}

	public static void main(String[] args) {

		SpringApplication.run(SchoolApplication.class, args);
	}

}
