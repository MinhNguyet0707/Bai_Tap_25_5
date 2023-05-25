package com.example.ontap22_5.controller;

import com.example.ontap22_5.entity.Customer;
import com.example.ontap22_5.repository.CustomerRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RequestMapping("/api/")
@RestController
public class CustomerController {
    @Autowired
    CustomerRepo customerRepo;

    @PostMapping("/customer")
    public Customer inssertCus(@RequestBody Customer customer){
      return  customerRepo.save(customer);
    }
}
