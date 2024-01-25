package com.slotify.demo.model;
import jakarta.persistence.*;
import java.util.*;
import com.slotify.demo.model.Song;
import com.fasterxml.jackson.annotation.JsonIgnore;

@Entity
@Table(name = "artists")
public class Artist {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "artist_id")
    private int id;


    @Column(name = "name")
    private String name;

    @OneToMany(mappedBy = "artist", cascade = CascadeType.ALL)
    @JsonIgnore
    private List<Song> songs;


    @OneToMany(mappedBy = "artist", cascade = CascadeType.ALL)
    @JsonIgnore
    private List<Album> albums;


    public Artist() {
    }


    public Artist(int id, String name, List<Song> songs, List<Album> albums) {
        this.id = id;
        this.name = name;
        this.songs = songs;
        this.albums = albums;
    }



    public int getId() {
        return this.id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return this.name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public List<Song> getSongs() {
        return this.songs;
    }

    public void setSongs(List<Song> songs) {
        this.songs = songs;
    }

    public List<Album> getAlbums() {
        return this.albums;
    }

    public void setAlbums(List<Album> albums) {
        this.albums = albums;
    }



    @Override
    public String toString() {
        return "{" +
            " id='" + getId() + "'" +
            ", name='" + getName() + "'" +
            ", songs='" + getSongs() + "'" +
            ", albums='" + getAlbums() + "'" +
            "}";
    }




}