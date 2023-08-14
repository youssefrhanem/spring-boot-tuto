package com.rhanem.controller;

import com.rhanem.model.Customer;
import com.rhanem.service.CustomerService;
import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;


@RestController
@AllArgsConstructor
public class CustomerController {


    private final CustomerService customerService;

    @GetMapping(path = "api/v1/customers")
    public  List<Customer> getCustomers() {
        return customerService.getAllCustomer();
    }

    @GetMapping(path = "api/v1/customers/{id}")
    public  Customer getCustomer(@PathVariable("id") Integer id) {
        return customerService.getCustomerById(id);
    }
}
