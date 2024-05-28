package com.secuirty.spring_security_integration;

import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class APIs {
    @GetMapping("hiAll")
    public String User(){
        return "Hello Everyone! Welcome to spring authentication class";
    }
    @GetMapping("hiAdmin")
    @PreAuthorize("hasAuthority('ROLE_ADMIN')")
    public String helloAdmin(){
        return "Hi Admin, your have been authenticated , welcome Admin";
    }
    @GetMapping("hiUser")
    @PreAuthorize("hasAuthority('ROLE_USER')")
    public String helloUser(){
        return "Hi user , u have been authenticated , welcome user";
    }
}
