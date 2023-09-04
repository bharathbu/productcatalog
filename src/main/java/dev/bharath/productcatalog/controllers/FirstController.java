package dev.bharath.productcatalog.controllers;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class FirstController {

    @GetMapping("/hi")
    public String sayHi(){
        return "Hello, Folks, How are you doing? ";
    }
}
