package com.slotify.demo.service;
import java.util.*;
import org.springframework.web.bind.annotation.*;
import com.slotify.demo.repository.UserRepo;
import com.slotify.demo.model.Movie;
import org.springframework.stereotype.*;


@Service
public class MovieService {

@Autowired
public UserRepo userRepo;

public List<Movie> findAll() {
    List<Movie> movies = (List<Student>) userRepo.findAll();
    return movies;
}





}