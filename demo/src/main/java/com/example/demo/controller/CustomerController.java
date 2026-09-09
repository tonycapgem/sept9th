package com.example.demo.controller;

import com.example.demo.model.Customer;
import com.example.demo.service.CustomerService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/v1")
public class CustomerController {

    //  http://localhost:8080/api/v1/customer

    public final CustomerService customerservice ;

    // constructor injection   setter injection/ field injection
    public CustomerController(CustomerService customerservice) {
        this.customerservice = customerservice;
    }


    @PostMapping("/createCustomer")
    public void createCustomer(@RequestBody Customer customer){

        this.customerservice.createCustomer(customer);
        System.out.println("In Customer Controller");
    }

    @GetMapping("/customer")
    public void getCustomerDetails(){
        System.out.println("In Customer Controller");
    }


}
