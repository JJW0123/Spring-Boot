package service;

import org.springframework.web.bind.annotation.RestController;

@RestController
public class Service {

    public static String greeting() {
        return "Please, Hot dog World~";
    }   
}