package com.example.springprojeck.repositories;
import com.example.springprojeck.customer.Customer;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface CustomerRepository extends JpaRepository<Customer, Integer> {

    List<Customer> findByName(String name);
    List<Customer> findByNameContainingIgnoreCase(String name);
}