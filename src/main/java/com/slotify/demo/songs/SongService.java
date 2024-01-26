package com.slotify.demo.songs;
import java.util.*;

import com.slotify.demo.songs.SongRepository;
import com.slotify.demo.model.Song;
import org.springframework.stereotype.*;
import org.springframework.beans.factory.annotation.Autowired; 


@Service
public class SongService {

@Autowired
private SongRepository songRepo;

public List<Song> findAll() {
    List<Song> Songs = (List<Song>) songRepo.findAll();
    
    return Songs;
}





}