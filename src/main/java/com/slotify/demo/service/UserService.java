// package com.slotify.demo.service;
// import org.springframework.stereotype.Service;
// import org.springframework.http.ResponseEntity;
// import com.slotify.demo.model.User;
// import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
// import org.springframework.beans.factory.annotation.Autowired;
// import com.slotify.demo.repository.UserRepo;

// @Service
// public class UserService implements UserDetailsService {
//     @Autowired
//     private UserRepository userRepository;

//     @Override
//     public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
//         User user = userRepository.findByUsername(username);

//         if (user == null) {
//             throw new UsernameNotFoundException("User not found with username: " + username);
//         }

//         return new org.springframework.security.core.userdetails.User(
//             user.getUsername(),
//             user.getPassword(),
           
//             Collections.singletonList(new SimpleGrantedAuthority("ROLE_USER"))
//         );
//     }
// }

