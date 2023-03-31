package edu.iu.c322.customerService.contorller;

import edu.iu.c322.customerService.model.Customer;
import edu.iu.c322.customerService.repository.CustomerRepository;
import edu.iu.c322.customerService.repository.InMemoryCustomerRepository;
import jakarta.validation.Valid;
import org.springframework.web.bind.annotation.*;
import org.springframework.stereotype.Repository;


import java.util.List;

@RestController
@RequestMapping("/customers")
public class CustomerController {

    private CustomerRepository repository;

    public CustomerController(CustomerRepository repository){
        this.repository = repository;
    }

    //Get localhost:8080/customers
    @GetMapping
    public List<Customer> findAll(){
        return repository.findAll();
    }
    @PostMapping
    public int create(@Valid @RequestBody Customer customer){
        Customer newCustomer =  repository.save(customer);
        return newCustomer.getId();
    }
    //PUT localhost:8080/customers
    @PutMapping("/{id}")
    public void update(@Valid @RequestBody Customer customer, int id){
        customer.setId(id);
        repository.save(customer);
    }
    @DeleteMapping("/{id}")
    public void delete(@PathVariable int id){
        Customer customer = new Customer();
        customer.setId(id);

        repository.delete(customer);
    }
    public String greeting(){
        return "hello Customer";
    }
}

