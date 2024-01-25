package com.slotify.demo.model;
import java.util.*;
import jakarta.persistence.*;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonIgnore;

@Entity
@Table(name = "users")
public class User {

  @Id
  @GeneratedValue(strategy = GenerationType.IDENTITY)
  @Column(name = "user_id")
  private int id;

  @Column(name = "username")
  private String username;

  @Column(name = "email")
  private String email;


  @Column(name = "image")
  private String image;

  @Column(name = "password")
  private String hashedPassword;

  @OneToMany(mappedBy = "user", cascade = CascadeType.ALL)
  @JsonIgnore
  private List<Song> songs;

  @OneToMany(mappedBy="user", cascade = CascadeType.ALL)
  @JsonIgnore
  private List<Playlist> playlists;


  public User() {
  }

  public User(int id, String username, String email,String image, String hashedPassword, List<Song> songs, List<Playlist> playlists) {
    this.id = id;
    this.username = username;
    this.email = email;
    this.image = image;
    this.hashedPassword = hashedPassword;
    this.songs = songs;
    this.playlists = playlists;
  }

  public int getId() {
    return this.id;
  }

  public void setId(int id) {
    this.id = id;
  }

  public String getUsername() {
    return this.username;
  }

  public void setUsername(String username) {
    this.username = username;
  }



  public String getEmail() {
    return this.email;
  }

  public void setEmail(String email) {
    this.email = email;
  }

  public String getImage(){
    return this.image;
  }

  public void setImage(String image){
    this.image = image;
  }

  public String getHashedPassword() {
    return this.hashedPassword;
  }

  public void setHashedPassword(String hashedPassword) {
    this.hashedPassword = hashedPassword;
  }

  public List<Song> getSongs() {
    return this.songs;
  }

  public void setSongs(List<Song> songs) {
    this.songs = songs;
  }

  public List<Playlist> getPlaylists() {
    return this.playlists;
  }

  public void setPlaylists(List<Playlist> playlists) {
    this.playlists = playlists;
  }

  public User id(int id) {
    setId(id);
    return this;
  }

  public User username(String username) {
    setUsername(username);
    return this;
  }

  public User email(String email) {
    setEmail(email);
    return this;
  }

  public User hashedPassword(String hashedPassword) {
    setHashedPassword(hashedPassword);
    return this;
  }

  public User songs(List<Song> songs) {
    setSongs(songs);
    return this;
  }

  public User playlists(List<Playlist> playlists) {
    setPlaylists(playlists);
    return this;
  }



  @Override
  public String toString() {
    return "{" +
      " id='" + getId() + "'" +
      ", username='" + getUsername() + "'" +
      ", email='" + getEmail() + "'" +
      ", image='" + getImage() + "'" +
      ", hashedPassword='" + getHashedPassword() + "'" +
      ", songs='" + getSongs() + "'" +
      ", playlists='" + getPlaylists() + "'" +
      "}";
  }
  
  
}
