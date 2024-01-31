package com.slotify.demo.user;

import com.slotify.demo.model.User;
import org.springframework.web.bind.annotation.*;


@Repository
public interface UserRepository  extends JpaRepository<User,Integer> {

    User findByEmail(String email);

}