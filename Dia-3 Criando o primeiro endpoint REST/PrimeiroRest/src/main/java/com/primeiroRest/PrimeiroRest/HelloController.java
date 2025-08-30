package com.primeiroRest.PrimeiroRest;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
@RestController
public class HelloController {

    @GetMapping("/hello") //define o endpoint
    public String hello(){
        return "Ola mundo! esse e o nosso exemplo de endpoint REST em spring Boot";
    }


}
