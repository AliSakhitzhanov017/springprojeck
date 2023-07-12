package com.example.springprojeck.controllers;

import com.example.springprojeck.customer.Customer;
import com.example.springprojeck.services.CustomerService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

@Controller@RequiredArgsConstructor
@RequestMapping(path = "api/customers/")
public class CustomerController {
    private final CustomerService customerService;

    @GetMapping
    public String getCustomers(Model model) {
        model.addAttribute("customerList", customerService.getCustomers());
        return "customers";
    }

    @GetMapping("/{customerId}")
    public String getCustomerById(@PathVariable("customerId") Integer id, Model model) {
        model.addAttribute("customer", customerService.getCustomerById(id));
        return "customer-info";
    }

    @PostMapping
    public String addNewCustomer(Customer customer) {
        customerService.addNewCustomer(customer);
        return "redirect:/api/customers/";
    }

    @PostMapping(path = "/delete/{customerId}")
    public String deleteCustomer(@PathVariable("customerId") Integer id) {
        customerService.deleteCustomer(id);
        return "redirect:/api/customers/";
    }

    @PostMapping(path = "/update/{customerId}")
    public String updateCustomer(@PathVariable("customerId") Integer id, Customer customer) {
        customerService.updateCustomer(id, customer);
        return "redirect:/api/customers/{customerId}";
    }

    @GetMapping(path = "/new")
    public String getCustomerByName(@RequestParam(name = "name") String name, Model model) {
        model.addAttribute("customerName", customerService.getCustomerByName(name));
        model.addAttribute("customerList", customerService.getCustomers());
        return "customers";
    }

}