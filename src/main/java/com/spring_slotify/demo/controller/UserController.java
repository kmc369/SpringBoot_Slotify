package com.spring_slotify.demo.controller;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.GetMapping;

@RestController
@RequestMapping(path="/hello")
public class UserController {


    @GetMapping
    public String helloStudents(){
        return "hello";
    }

}