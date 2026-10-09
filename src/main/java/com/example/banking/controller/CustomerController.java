package com.example.banking.controller;

import com.example.banking.service.CustomerService;
import com.example.banking.dto.CustomerRequest;
import com.example.banking.model.Customer;
import org.springframework.web.bind.annotation.*; 
import java.util.List;

@RestController
@RequestMapping("/api/customers")
public class CustomerController {

  private final CustomerService customerService;
 
  public CustomerController(CustomerService customerService){
    this.customerService = customerService;
  }

  @GetMapping
  public List<Customer> getAllCustomers(){
    return customerService.getAllCustomers();
  }

  @GetMapping("/{id}")
  public Customer getCustomerById(@PathVariable Long id){
    return customerService.getCustomerById(id);
  }

  @PostMapping
  public Customer createCustomer(@RequestBody CustomerRequest request){
    return customerService.createCustomer(request);
  }

  @PutMapping("/{id}")
  public Customer updateCustomer(@PathVariable Long id, @RequestBody CustomerRequest request){
    return customerService.updateCustomer(id, request);
  }

  @DeleteMapping("/{id}")
  public void deleteCustomer(@PathVariable Long id){
    customerService.deleteCustomer(id);
  }

}