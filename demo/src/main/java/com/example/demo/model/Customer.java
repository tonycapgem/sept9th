package com.example.demo.model;


import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Data;

@Data
@Entity
@Table(name = "customer")
public class Customer {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "customer_id")
    private Integer customerID;

@Column(name = "firstname")
private String firstName;
    @Column(name = "lastname")
private String lastName;
    @Column(name = "email")
    private String email;
    @Column(name = "ssn")
    private String ssn;
    @Column(name = "address")
    private String address;
}
