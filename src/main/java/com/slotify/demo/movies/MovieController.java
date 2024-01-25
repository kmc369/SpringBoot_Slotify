package com.slotify.demo.movies;
import java.util.*;
import com.slotify.demo.movies.MovieService;
import org.springframework.web.bind.annotation.*;
import org.springframework.beans.factory.annotation.Autowired;
import com.slotify.demo.model.Movie;

@RestController
@RequestMapping("/api/movies")
@CrossOrigin(origins = "http://localhost:3000")
public class MovieController {

    @Autowired
    private MovieService movieService;


    @GetMapping("/")
    public List<Movie> getMovies(){

        List<Movie> movies = movieService.findAll();
        

        return movies;
    }

}