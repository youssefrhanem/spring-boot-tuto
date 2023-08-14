package com.rhanem.service;

import com.rhanem.CustomerDao;
import com.rhanem.exception.ResourceNotFound;
import com.rhanem.model.Customer;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;


@AllArgsConstructor
@Service
public class CustomerService {

    private final CustomerDao customerDao;

    public List<Customer> getAllCustomer(){
        return customerDao.selectAllCustomers();
    }

    public Customer getCustomerById(Integer id){
        return (customerDao.SelectCustomerById(id)
                .orElseThrow(() -> new ResourceNotFound(
                        "Customer with ID [%s] not found".formatted(id)
                        )));
    }
}
