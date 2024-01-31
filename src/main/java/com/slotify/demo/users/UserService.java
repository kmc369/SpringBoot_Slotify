package com.slotify.demo.user;

import com.slotify.demo.user.UserRepository;
import org.springframework.web.bind.annotation.*;
import org.springframework.beans.factory.annotation.Autowired;
import com.slotify.demo.users.UserPrincipal;
import org.springframework.stereotype.*;
import org.springframework.security.authentication.BadCredentialsException;
import org.springframework.security.core.userdetails.UserDetails;


@Service
public class UserService {

    @Autowired
    private UserRepository userRepository;  

    public UserDetails authenticate(String email, String password) throws BadCredentialsException {

        User user = userRepository.findByEmail(email);

        if (user == null || !password.equals(user.getPassword())) {
            throw new BadCredentialsException("Invalid credentials");
        }

        return new UserPrincipal(user);  
    }
}
