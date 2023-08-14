package com.rhanem.repository.impl;

import com.rhanem.model.Customer;
import com.rhanem.CustomerDao;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;




@Repository
public class CustomerIDaoService implements CustomerDao {

    private static List<Customer> customers;

    static {
        customers = new ArrayList<>();

        Customer alex = new Customer(1, "Alex", "A@gmail", 21);
        customers.add(alex);

        Customer jamila = new Customer(2, "jamila", "jamila@gmail", 21);
        customers.add(jamila);
    }

    @Override
    public List<Customer> selectAllCustomers() {
        return customers;
    }

    @Override
    public Optional<Customer> SelectCustomerById(Integer id) {
        return  customers.stream()
                .filter(customer -> customer.getId().equals(id))
                .findFirst();

    }
}
