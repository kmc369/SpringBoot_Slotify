package com.slotify.demo.user;

import com.slotify.demo.user.userRepository;
import org.springframework.web.bind.annotation.*;
import org.springframework.beans.factory.annotation.Autowired;

@Service
public class AuthenticationService {

    @Autowired
    private UserRepository userRepository;  // Assuming you have a UserRepository

    public UserDetails authenticate(String email, String password) throws BadCredentialsException {
        // Retrieve user from the database (you might want to handle this differently)
        User user = userRepository.findByEmail(email);

        if (user == null || !password.equals(user.getPassword())) {
            throw new BadCredentialsException("Invalid credentials");
        }

        return new UserPrincipal(user);  // UserPrincipal implements UserDetails
    }
}
