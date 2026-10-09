package com.example.banking.service;

import org.springframework.stereotype.Service;
//

@Service
public class BankingService{

    public String getCustomerName(){
        return "Customer: John";
    }

    public double getBalance(){
        return 50000.00;
    }

    public String deposit(double amount){
        if(amount <= 0){
            return "Deposit amount must be greater than zero";
        }
        return "Deposit successful: " + amount;
    }


    public String getHomePage(){
        return """
                <html>
                <head>
                <titlte>Spring Bank</title>
                </head>

                <body>
                </body>
                <h1>Spring Bank is running!</h1>
                <div>
                <pre>
                **         **
                **         **
                **         **
                **   **    **
                ** **   ** **
                **         ** 
                </pre>
                </div>
                </html>
               """;
    }

    public String getAbout(){
        return "Spring Bank Banking API";
    }

    public String getStatus(){
        return "Banking System is operational";
    }

}