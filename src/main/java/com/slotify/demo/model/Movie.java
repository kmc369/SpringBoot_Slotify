package com.slotify.demo.model;
import jakarta.persistence.*;

@Entity
@Table(name = "movies")
public class Movie{

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "movie_id")
    private int id;

    @Column(name = "genre")
    private String genre;

    @Column(name = "title")
    private String title;

    @Column(name = "year")
    private int year;


    public Movie() {
    }

    @ManyToOne
    @JoinColumn(name = "user_id")
    private User user;

    public Movie(String genre, String title, int year) {
        this.genre = genre;
        this.title = title;
        this.year = year;
    }

    public Movie(int id, String genre, String title, int year) {
        this.id = id;
        this.genre = genre;
        this.title = title;
        this.year = year;
    }
    public User getUser() {
        return this.user;
    }

    public void setUser(User user) {
        this.user = user;
    }

    public int getId() {
        return this.id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getGenre() {
        return this.genre;
    }

    public void setGenre(String genre) {
        this.genre = genre;
    }

    public String getTitle() {
        return this.title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public int getYear() {
        return this.year;
    }

    public void setYear(int year) {
        this.year = year;
    }



    @Override
    public String toString() {
        return "{" +
            " id='" + getId() + "'" +
            ", genre='" + getGenre() + "'" +
            ", title='" + getTitle() + "'" +
            ", year='" + getYear() + "'" +
            "}";
    }

    
}