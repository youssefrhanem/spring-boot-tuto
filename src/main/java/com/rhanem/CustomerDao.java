package com.rhanem;

import com.rhanem.model.Customer;

import java.util.List;
import java.util.Optional;

public interface CustomerDao {

    List<Customer> selectAllCustomers();

    Optional<Customer> SelectCustomerById(Integer id);
}
