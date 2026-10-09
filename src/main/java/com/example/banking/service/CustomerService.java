package com.example.banking.service;

import java.util.List;

import org.springframework.stereotype.Service;
import com.example.banking.dto.CustomerRequest;
import java.util.ArrayList;
import com.example.banking.model.Customer;

@Service
public class CustomerService {

  private final List<Customer> customers = new ArrayList<>();
  private Long nextId = 1L;

  public List<Customer> getAllCustomers(){
    return customers;
  }

  public Customer getCustomerById(Long id){
    return customers.stream()
      .filter(customer -> customer.getId().equals(id))
      .findFirst()
      .orElseThrow(() -> new RuntimeException("Customer not found with id: " + id));    
  }

  public Customer createCustomer(CustomerRequest request){
    Customer customer = new Customer(
       nextId++,
       request.getName(),
       request.getEmail()
    );
    customers.add(customer);
    return customer;
  } 

  public Customer updateCustomer(Long id, CustomerRequest request){
    Customer customer = getCustomerById(id);
    customer.setName(request.getName());
    customer.setEmail(request.getEmail());
    return customer;
  }   

  public void deleteCustomer(Long id){  
    Customer customer = getCustomerById(id);
    customers.remove(customer);
  } 



    public Customer getCustomer() {
         return new Customer(
            1L, 
            "John",
            "John@gmail.com"

        );
    }

    public List<Customer> getCustomers(){
        return List.of(
            new Customer(
              1L,
              "John",
              "John@gmail.com"
            ),

            new Customer(
              2L,
              "Mary",
              "Mary@gmail.com"
            ),

            new Customer(
              3L,
              "Peter",
              "Peter@gmail.com"
            ),

            new Customer(
              4L,
              "Stephen",
              "Stephen@gmail.com"
            ),

            new Customer(
              5L,
              "Olar",
              "Olar@yahoo.com"
            ),

            new Customer(
              1L,
              "Louis",
              "lo@gmail.com"
            ),

            new Customer(
              2L,
              "Grace",
              "grace@gmail.com"
            ),

            new Customer(
              3L,
              "Treasure",
              "t@gmail.com"
            ),

            new Customer(
              4L,
              "Michelle",
              "mich@gmail.com"
            ),

            new Customer(
              5L,
              "Olar",
              "Olar@yahoo.com"
            ),

            new Customer(
              1L,
              "John",
              "John@gmail.com"
            ),

            new Customer(
              2L,
              "Mary",
              "Mary@gmail.com"
            ),

            new Customer(
              3L,
              "Peter",
              "Peter@gmail.com"
            ),

            new Customer(
              4L,
              "Stephen",
              "Stephen@gmail.com"
            ),

            new Customer(
              5L,
              "Olar",
              "Olar@yahoo.com"
            ),
            
            new Customer(
              1L,
              "John",
              "John@gmail.com"
            ),

            new Customer(
              2L,
              "Mary",
              "Mary@gmail.com"
            ),

            new Customer(
              3L,
              "Peter",
              "Peter@gmail.com"
            ),

            new Customer(
              4L,
              "Stephen",
              "Stephen@gmail.com"
            ),

            new Customer(
              5L,
              "Olar",
              "Olar@yahoo.com"
            )

         );
    }

    public String saveCustomer(Customer customer){
        if(customer.getName() == null || customer.getEmail() == null){
            return "Customer name and email cannot be null";
        }
        return "Customer saved successfully: " + customer.getName();
    }
}