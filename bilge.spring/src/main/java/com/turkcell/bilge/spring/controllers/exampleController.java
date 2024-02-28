package com.turkcell.bilge.spring.controllers;

import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/example")
public class exampleController {
    @GetMapping
    public String get(@RequestParam String name){
        return "Merhaba" + name;
    }

    @GetMapping("{yeniEndpoint}")
    public String get2(@PathVariable String name){
        return "age: " + name;
    }

    @GetMapping("yepyeniEndpoint")
    public String get3(@PathVariable String name){
        return "age: " + name;
    }

    @GetMapping("yepisyeniEndpoint")
    public String get4(@PathVariable int number){
        return "age: " + number;
    }
}
