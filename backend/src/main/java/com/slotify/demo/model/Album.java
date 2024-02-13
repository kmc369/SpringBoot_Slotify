
package com.slotify.demo.model;
import com.fasterxml.jackson.annotation.JsonIgnore;

import jakarta.persistence.*;
import java.util.List;

@Entity
@Table(name = "albums")
public class Album {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private int id;

    @Column(name = "name", nullable = false)
    private String name;

    @Column(name = "time", nullable = false)
    private String time;

    @Column(name = "type", nullable = false)
    private String type;

    @Column(name = "image", nullable = false)
    private String image;

    @Column(name = "releasedate")
    private String releasedate;

    @OneToMany(mappedBy = "album", cascade = CascadeType.ALL, orphanRemoval = true)
    @JsonIgnore
    private List<Song> songs;

    @ManyToOne
    @JoinColumn(name = "artist_id")
    private Artist artist;


    public Album() {
    }

 

    public Album(int id, String name, String time, String type, String image, String releasedate, List<Song> songs, Artist artist) {
        this.id = id;
        this.name = name;
        this.time = time;
        this.type = type;
        this.image = image;
        this.releasedate = releasedate;
        this.songs = songs;
        this.artist = artist;
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

    public String getTime() {
        return this.time;
    }

    public void setTime(String time) {
        this.time = time;
    }

    public String getType() {
        return this.type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getImage() {
        return this.image;
    }

    public void setImage(String image) {
        this.image = image;
    }

    public String getReleasedate() {
        return this.releasedate;
    }

    public void setReleasedate(String releasedate) {
        this.releasedate = releasedate;
    }

    public List<Song> getSongs() {
        return this.songs;
    }

    public void setSongs(List<Song> songs) {
        this.songs = songs;
    }

    public Artist getArtist() {
        return this.artist;
    }

    public void setArtist(Artist artist) {
        this.artist = artist;
    }



    @Override
    public String toString() {
        return "{" +
            " id='" + getId() + "'" +
            ", name='" + getName() + "'" +
            ", time='" + getTime() + "'" +
            ", type='" + getType() + "'" +
            ", image='" + getImage() + "'" +
            ", releasedate='" + getReleasedate() + "'" +
            ", songs='" + getSongs() + "'" +
            ", artist='" + getArtist() + "'" +
            "}";
    }



}