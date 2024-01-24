package com.slotify.demo.service;
import java.util.*;

import com.slotify.demo.repository.UserRepo;
import com.slotify.demo.model.Movie;
import org.springframework.stereotype.*;
import org.springframework.beans.factory.annotation.Autowired; 


@Service
public class MovieService {

@Autowired
public UserRepo userRepo;

public List<Movie> findAll() {
    List<Movie> movies = (List<Movie>) userRepo.findAll();
    return movies;
}





}