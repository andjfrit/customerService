package edu.iu.c322.customerService.contorller;

import edu.iu.c322.customerService.model.Customer;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/customers")
public class CustomerController {
    //Get localhost:8080/customers
    @GetMapping()

    public List<Customer> findAll(){
        return null;


    }
    @PostMapping
    public int create(@RequestBody Customer customer){
        return 0;
    }
    public String greeting(){
        return "hello Customer";
    }




}
