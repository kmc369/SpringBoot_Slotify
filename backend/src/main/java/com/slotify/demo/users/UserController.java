// package com.slotify.demo.users;
// import java.util.*;
// import org.springframework.web.bind.annotation.*;
// import org.springframework.beans.factory.annotation.Autowired;
// import org.springframework.beans.factory.annotation.Autowired;
// import org.springframework.http.HttpStatus;
// import org.springframework.http.ResponseEntity;
// import org.springframework.security.authentication.AuthenticationManager;
// import org.springframework.security.authentication.UsernamePasswordAuthenticationToken;
// import org.springframework.security.core.Authentication;
// import org.springframework.security.core.AuthenticationException;
// import org.springframework.security.core.context.SecurityContextHolder;

// import com.slotify.demo.model.user; 

// import com.slotify.demo.user.UserService;



// @RestController
// @RequestMapping("/api/auth")
// @CrossOrigin(origins = "http://localhost:3000")
// public class UserController {

//     @Autowired
//     private AuthenticationManager authenticationManager;

//     @Autowired
//     private UserService authenticationService;

//     @PostMapping("/login")
//     public ResponseEntity<String> login(@RequestBody User loginForm) {
//         try {
//             // Authenticate the user
//             Authentication authentication = authenticationManager.authenticate(
//                     new UsernamePasswordAuthenticationToken(loginForm.getEmail(), loginForm.getPassword())
//             );

//             // Set the authentication in the SecurityContext
//             SecurityContextHolder.getContext().setAuthentication(authentication);

        
//             return ResponseEntity.ok("Login successful");
//         } catch (AuthenticationException e) {
           
//             return ResponseEntity.status(HttpStatus.UNAUTHORIZED).body("Invalid credentials");
//         }
//     }
// }






