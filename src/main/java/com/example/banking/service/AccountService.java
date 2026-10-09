package com.example.banking.service;

import com.example.banking.model.Account;
import com.example.banking.model.Customer;
import org.springframework.stereotype.Service;

@Service
public class AccountService {

    public Account getAccount(){
        return new Account(
            1L,
            "1234567890",
            108000.00,
            "Active",
            new Customer( 
                1L,
                "John",
                "John@gmail.com"
            )
        );  
    }
}