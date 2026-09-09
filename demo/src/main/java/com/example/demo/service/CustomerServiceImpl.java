package com.example.demo.service;

import com.example.demo.model.Customer;
import com.example.demo.respository.CustomerRepository;
import org.springframework.stereotype.Service;

@Service
public class CustomerServiceImpl implements CustomerService {

    private final CustomerRepository customerRepository;

    public CustomerServiceImpl(CustomerRepository customerRepository) {
        this.customerRepository = customerRepository;
    }

    @Override
    public void createCustomer(Customer customer) {
        System.out.println("in the servic eimple class");

        if(customer.getFirstName() == null) {
            throw new IllegalArgumentException("not good");
        }
        customerRepository.save(customer);
    }



}
