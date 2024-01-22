package com.slotify.demo.service;
import org.springframework.stereotype.Service;
import org.springframework.http.ResponseEntity;
import com.slotify.demo.model.User;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.beans.factory.annotation.Autowired;
import com.slotify.demo.repository.UserRepo;

@Service
public class UserService{

    @Autowire
    private UserRepo userRepo;
    
    public ResponseEntity<?> loginService(email, password) {
        if userRepo.getEmail
    }

}
