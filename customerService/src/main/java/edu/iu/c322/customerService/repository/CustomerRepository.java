package edu.iu.c322.customerService.repository;

import edu.iu.c322.customerService.model.Customer;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository

public interface CustomerRepository extends JpaRepository<Customer,Integer> {

}
