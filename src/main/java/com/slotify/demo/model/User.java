package com.slotify.demo.model;
import java.util.*;
import jakarta.persistence.*;

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

  @Column(name = "password")
  private String hashedPassword;

  @OneToMany(mappedBy = "user", cascade = CascadeType.ALL)
  private List<Song> songs;
  public User() {}

  public User(int id, String username, String email, String hashedPassword) {
    this.id = id;
    this.username = username;
    this.email = email;
    this.hashedPassword = hashedPassword;
  }

  public User(String email, String hashedPassword) {
    this.email = email;
    this.hashedPassword = hashedPassword;
  }

  public List<Song> getSongs() {
    return this.songs;
}

  public void setSongs(List<Song> songs) {
    this.songs =songs ;
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

  public String getHashedPassword() {
    return this.hashedPassword;
  }

  public void setHashedPassword(String hashedPassword) {
    this.hashedPassword = hashedPassword;
  }

  @Override
  public String toString() {
    return (
      "{" +
      " id='" +
      getId() +
      "'" +
      ", username='" +
      getUsername() +
      "'" +
      ", email='" +
      getEmail() +
      "'" +
      ", hashedPassword='" +
      getHashedPassword() +
      "'" +
      "}"
    );
  }

  
}
