package com.example.demo.service;

import com.example.demo.model.Customer;
import com.example.demo.respository.CustomerRepository;
import org.apache.commons.lang3.StringUtils;
import org.springframework.stereotype.Service;

@Service
public class CustomerServiceImpl implements CustomerService {
//actual impl of customerservice which has create customer and is a customerrepo
    private final CustomerRepository customerRepository;

    public CustomerServiceImpl(CustomerRepository customerRepository) {
        this.customerRepository = customerRepository;
    }

    @Override
    public void createCustomer(Customer customer) {
        System.out.println("in the servic eimple class");

        if(StringUtils.isEmpty(customer.getFirstName())) {
            throw new IllegalArgumentException("not good");
        }
        customerRepository.save(customer);
    }

    @Override
    public Customer getCustomerDetails(Integer id) {
        return customerRepository.findById(id).orElse(null);
    }
}
