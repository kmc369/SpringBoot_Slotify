package com.slotify.demo.model;
import com.fasterxml.jackson.annotation.JsonIgnore;

import jakarta.persistence.*;
import java.util.List;

@Entity
@Table(name = "playlists")
public class Playlist {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private int id;

    @Column(name = "image", nullable = false, length = 2000)
    private String image;

    @Column(name = "name", nullable = false)
    private String name;

    @Column(name = "description")
    private String description;

    @OneToMany(mappedBy = "playlist", cascade = CascadeType.ALL, orphanRemoval = true)
    @JsonIgnore
    private List<Song> songs;

    @ManyToOne
    @JoinColumn(name = "user_id")
    private User user;



    // Constructors, getters, setters, etc.


    public Playlist() {
    }


    public Playlist(int id, String image, String name, String description, List<Song> songs, User user) {
        this.id = id;
        this.image = image;
        this.name = name;
        this.description = description;
        this.songs = songs;
        this.user = user;
    }


    public int getId() {
        return this.id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getImage() {
        return this.image;
    }

    public void setImage(String image) {
        this.image = image;
    }

    public String getName() {
        return this.name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDescription() {
        return this.description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public List<Song> getSongs() {
        return this.songs;
    }

    public void setSongs(List<Song> songs) {
        this.songs = songs;
    }

    public User getUser() {
        return this.user;
    }

    public void setUser(User user) {
        this.user = user;
    }


    @Override
    public String toString() {
        return "{" +
            " id='" + getId() + "'" +
            ", image='" + getImage() + "'" +
            ", name='" + getName() + "'" +
            ", description='" + getDescription() + "'" +
            ", songs='" + getSongs() + "'" +
            ", user='" + getUser() + "'" +
            "}";
    }

    

}