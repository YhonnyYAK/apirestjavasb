package com.microservicio.servicio.controllers;

import com.microservicio.servicio.entity.Message;
import com.microservicio.servicio.services.CustomerService;
import com.microservicio.servicio.entity.Customer;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

import static org.springframework.web.bind.annotation.RequestMethod.POST;

@RestController
@RequestMapping(path = "app/v1/customers")
public class CustomersController {

    @Autowired
    private CustomerService customerService;

    @GetMapping
    public List<Customer> getAll(){
        return  customerService.getCustomers();
    }

    @PostMapping
    public Message saveUpdate(@RequestBody Customer customer){
       return customerService.saveOrUpdate(customer);
    }

    @GetMapping("/dni/{dni}")
    public Customer getDni(@PathVariable("dni") String dni){
        return customerService.getCustomerDni(dni);
    }

    @GetMapping("/email/{email}")
    public Customer getEmail(@PathVariable("email") String email){
        return customerService.getCustomerEmail(email);
    }

}
