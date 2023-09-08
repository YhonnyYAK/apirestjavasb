package com.microservicio.servicio.services;

import com.microservicio.servicio.entity.Customer;
import com.microservicio.servicio.entity.Message;
import com.microservicio.servicio.repository.CustomerRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CustomerService {

    @Autowired
    CustomerRepository customerRepository;

    public List<Customer> getCustomers(){
        return customerRepository.findAll();
    }

    public Message saveOrUpdate(Customer customer){
        Message message = new Message();
        customerRepository.save(customer);
        message.setCodigo(200);
        message.setMensaje("Cliente Registrado");
        return  message;
    }

    public Customer getCustomerDni(String dni){
        return customerRepository.findByDni(dni);
    }

    public Customer getCustomerEmail(String email){
        return customerRepository.findByEmail(email);
    }
}
