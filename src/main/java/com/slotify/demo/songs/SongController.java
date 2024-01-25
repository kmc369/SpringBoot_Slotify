package com.slotify.demo.songs;
import java.util.*;
import com.slotify.demo.songs.SongService;
import org.springframework.web.bind.annotation.*;
import org.springframework.beans.factory.annotation.Autowired;
import com.slotify.demo.model.Song;

@RestController
@RequestMapping("/api/Songs")
@CrossOrigin(origins = "http://localhost:3000")
public class SongController {

    @Autowired
    private SongService SongService;


    @GetMapping("/")
    public List<Song> getSongs(){

        List<Song> Songs = SongService.findAll();
        

        return Songs;
    }

}