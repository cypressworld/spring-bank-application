package com.example.banking.controller;

import com.example.banking.service.BankingService;
import com.example.banking.service.AccountService;
import com.example.banking.service.CustomerService;
import com.example.banking.model.Account;
import com.example.banking.model.Customer;
import org.springframework.web.bind.annotation.*; 
import java.util.List;

@RestController
@RequestMapping("api")
public class BankingController {

  private final BankingService bankingService;
  private final CustomerService customerService;
  private final AccountService accountService;

  public BankingController(BankingService bankingService, CustomerService customerService, AccountService accountService){
    this.bankingService = bankingService;
    this.customerService = customerService;
    this.accountService = accountService;
  }

  	@GetMapping("/home")
	public String home(){
        return bankingService.getHomePage();
    }

    @GetMapping("/customer")
    public Customer customer(){
      return customerService.getCustomer();
    }

    @GetMapping("/customers")
    public List<Customer> customers(){
         return customerService.getCustomers();
    }

    @GetMapping("/account")
    public Account account(){
      return accountService.getAccount();
 }

  @GetMapping("/about")
  public String about(){
    return bankingService.getAbout();
  }

  @GetMapping("/status")
  public String status(){
   return bankingService.getStatus();
}

@GetMapping("/customer_name")
public String customer_name(){
  return bankingService.getCustomerName();
}

@GetMapping("/balance")
public double balance(){
  return bankingService.getBalance();
}

@GetMapping("/deposit/{amount}")
public String deposit(@PathVariable double amount){
  return bankingService.deposit(amount);
}

@GetMapping("/save_customer/{name}/{email}")
public String saveCustomer(@PathVariable String name, @PathVariable String email){
  Customer customer = new Customer(null, name, email);
  return customerService.saveCustomer(customer);
  }
}