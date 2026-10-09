package com.example.banking.model;

public class Account{
    private Long id;
    private String accountNumber;
    private double balance;
    private  String status;
    private Customer customer;

    public Account(){}

    public Account(Long id, String accountNumber, double balance, String status, Customer customer){
        this.id = id;
        this.accountNumber = accountNumber;
        this.balance = balance;
        this.status = status;
        this.customer = customer;
    }
    public Long getId(){
        return id;
    }
    public String getAccountNumber(){
        return accountNumber;
    }
    public double getBalance(){
        return balance;
    }
    public String getStatus(){
        return status;
    }
    public Customer getCustomer(){
        return customer;
    }
    public void setAccountNumber(String accountNumber){
        this.accountNumber = accountNumber;
    }
    public void setBalance(double balance){
        this.balance = balance;
    }
    public void setStatus(String status){
        this.status = status;
    }
    public void setCustomer(Customer customer){
        this.customer = customer;
    }
}