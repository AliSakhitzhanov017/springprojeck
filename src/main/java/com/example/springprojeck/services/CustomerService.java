package com.example.springprojeck.services;
import com.example.springprojeck.customer.Customer;
import com.example.springprojeck.repositories.CustomerRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import java.util.List;
@Service
@RequiredArgsConstructor
public class CustomerService {
    private final CustomerRepository customerRepository;
    public List<Customer> getCustomers(){

        return customerRepository.findAll();
    }
    public void addNewCustomer(Customer customer) {

        customerRepository.save(customer);
    }
    public Customer getCustomerById(Integer id) {

        return customerRepository.findById(id).orElse(null);
    }

    public void deleteCustomer(Integer id) {
        customerRepository.deleteById(id);
    }
    public void updateCustomer(Integer id, Customer customer) {

        customer.setID(id);
        customerRepository.save(customer);
    }
    // public List<Customer> getCustomerByName(String name) {
     //   return customerRepository.findByName(name);
    public List<Customer> getCustomerByName(String name) {
        return customerRepository.findByNameContainingIgnoreCase(name);
    }

}