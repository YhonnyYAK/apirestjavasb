package com.microservicio.servicio.repository;

import com.microservicio.servicio.entity.Customer;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CustomerRepository extends JpaRepository<Customer, Long> {

    Customer findByDni (String dni);
    Customer findByEmail (String email);
}
