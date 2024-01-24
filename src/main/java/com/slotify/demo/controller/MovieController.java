package com.slotify.demo.controller;
import java.util.*;
import com.slotify.demo.service.MovieService;
import org.springframework.web.bind.annotation.*;
import org.springframework.beans.factory.annotation.Autowired;

@RestController
@RequestMapping("/api/movies")
public class MovieController {

    @Autowired
    private MovieService movieService;


    @GetMapping("/")
    public List<Movie> getMovies(){

        List<Movie> movies = movieService.findAll();
        

        return movies
    }

}