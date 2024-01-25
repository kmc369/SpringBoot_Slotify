package com.slotify.demo.songs;
import java.util.*;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;


import com.slotify.demo.model.Song;

@Repository
public interface SongRepository  extends JpaRepository<Song,Integer> {

    

}
