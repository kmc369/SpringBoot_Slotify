package com.slotify.demo.movies;
import java.util.*;

import com.slotify.demo.movies.MovieRepo;
import com.slotify.demo.model.Movie;
import org.springframework.stereotype.*;
import org.springframework.beans.factory.annotation.Autowired; 


@Service
public class MovieService {

@Autowired
public MovieRepo userRepo;

public List<Movie> findAll() {
    List<Movie> movies = (List<Movie>) userRepo.findAll();
    return movies;
}





}