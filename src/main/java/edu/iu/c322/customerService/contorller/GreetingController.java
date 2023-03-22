package edu.iu.c322.customerService.contorller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping

public class GreetingController {
    //get https:localhost:8080
    @GetMapping
    public String greeting(){
        return "HIya! How r u?";
    }
}
