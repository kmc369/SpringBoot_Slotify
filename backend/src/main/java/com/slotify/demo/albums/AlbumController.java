package com.slotify.demo.albums;
import java.util.*;
import org.springframework.web.bind.annotation.*;
import org.springframework.beans.factory.annotation.Autowired;
import com.slotify.demo.model.Album;
import com.slotify.demo.albums.AlbumService;


@RestController
@RequestMapping("/albums")
@CrossOrigin(origins = "http://localhost:3000")
public class AlbumController {

    @Autowired
    private AlbumService albumService;

    @GetMapping("/")
    public List<Album> getAlbums() {

        List<Album> albums = albumService.findAllAlbums();
        return albums;

    }




}
