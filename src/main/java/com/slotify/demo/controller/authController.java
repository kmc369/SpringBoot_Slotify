package com.slotify.demo.controller;

import org.springframework.http.ResponseEntity;
import com.slotify.demo.model.User;
import org.springframework.web.bind.annotation.*;
import com.slotify.demo.service.UserService;
import org.springframework.http.HttpStatus;
import org.springframework.beans.factory.annotation.Autowired;



@RestController
@RequestMapping("/auth")
public class authController {

    /*This class is all of the authentification method */
    @Autowire
    private UserService userService;



    @PostMapping("/login")
    public ResponseEntity<?> login(@RequestBody User user){

        String email = user.getEmail();
        String password = user.getPassword();



         boolean loginSuccessful = userService.login(email, password);

        if (loginSuccessful) {
            return ResponseEntity.status(HttpStatus.OK).body("Login successful");
        } else {
            return ResponseEntity.status(HttpStatus.UNAUTHORIZED).body("Invalid login credentials");
        }

    }
   

}
