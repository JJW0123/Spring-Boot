package web;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import service.Service;

@RestController
public class Controller {
    String result;
    
    @GetMapping("/greeting")
    public String greeting() {
        result = GreetingService.greeting();
        return result;
    }
}