package com.slotify.demo.repository;
import java.util.*;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;


import com.slotify.demo.model.Movie;

@Repository
public interface UserRepo  extends JpaRepository<Movie,Integer> {

    

}
