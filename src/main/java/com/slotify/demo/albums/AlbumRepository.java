package com.slotify.demo.albums;

import com.slotify.demo.model.Album;
import java.util.*;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;


@Repository
public interface AlbumRepository extends JpaRepository<Album, Integer>{

}