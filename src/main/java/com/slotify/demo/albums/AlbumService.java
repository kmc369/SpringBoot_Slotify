package com.slotify.demo.albums;
import org.springframework.stereotype.*;
import org.springframework.beans.factory.annotation.Autowired; 
import java.util.*;
import com.slotify.demo.albums.AlbumRepository;
import com.slotify.demo.model.Album;

@Service
public class AlbumService {

    @Autowired
    private  AlbumRepository albumrepo;


    public List<Album> findAllAlbums(){
        List <Album> albums = (List<Album>)albumrepo.findAll();

        if (!albums.isEmpty()) {
            return albums;
        }
        else {
    
            return Collections.emptyList();
        }
    

    }

 



}