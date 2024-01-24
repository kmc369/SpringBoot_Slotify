package com.slotify.demo.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.slotify.demo.model.User;

@Repository
public interface UserRepo  extends JpaRepository<User,Integer> {

    

}
