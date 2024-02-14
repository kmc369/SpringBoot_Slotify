package com.slotify.demo.songs;
import java.util.*;
import com.slotify.demo.songs.SongService;
import org.springframework.web.bind.annotation.*;
import org.springframework.beans.factory.annotation.Autowired;
import com.slotify.demo.model.Song;

@RestController
@RequestMapping("/albums/songs")
@CrossOrigin(origins = "http://localhost:3000")
public class SongController {

    @Autowired
    private SongService SongService;


    @GetMapping("/")
    public List<Song> getSongs(){

        List<Song> Songs = SongService.findAll();


        return Songs;
    }

    @GetMapping("/{album_id}")
    public List<Song> getSongByAlbum(@PathVariable  int album_id){


        List<Song> album_songs = SongService.findByAlbumId(album_id);

        return Songs;
    }



}