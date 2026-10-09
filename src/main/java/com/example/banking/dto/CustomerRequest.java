package com.example.banking.dto;

import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Size;

public class CustomerRequest {
    @NotBlank(message = "Name is required")
    @Size(max = 100, message = "Name must be exceeded 100 characters")
    private String name;

    @NotBlank(message = "Name is required")
    @Email(message = "Email is required")
    private String email;

    public CustomerRequest(){

    }
    
    public String getName(){
        return name;
    }

    public String getEmail(){
        return email;
    }

    public void setName(String name){
        this.name = name;
    }

    public void setEmail(String email){
        this.email = email;
    }

}