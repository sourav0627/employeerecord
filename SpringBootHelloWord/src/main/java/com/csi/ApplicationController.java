package com.csi;


import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api")
public class ApplicationController {

    @GetMapping
    public String sayHello(){

        return "welcome to full stack developer";
    }

    @GetMapping("/services")
    public String sayServices(){

        return  "WEB DEVELOPER";
    }

    @GetMapping("/address")
    public String sayAddress(){

        return  "pune |satara ";
    }
}
