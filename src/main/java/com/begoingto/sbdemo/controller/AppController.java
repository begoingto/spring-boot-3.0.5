package com.begoingto.sbdemo.controller;

import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api")
public class AppController {

    @GetMapping("/home/{name}")
    String homePage(@PathVariable String name, @RequestParam String school){
        return "Welcome " + name.toUpperCase() + " to Home page. your school "+ school.toUpperCase();
    }

    @GetMapping("/about")
    String aboutPage(){
        return "About page";
    }
}
