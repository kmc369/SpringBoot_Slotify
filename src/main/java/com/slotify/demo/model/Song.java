package com.slotify.demo.model;
import jakarta.persistence.*;
import com.slotify.demo.model.Artist;

@Entity
@Table(name = "songs")
public class Song{

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "song_id")
    private int id;

    @Column(name = "genre")
    private String genre;

    @Column(name = "name")
    private String name;

    @Column(name = "time")
    private String time;

    @Column(name = "audio_url")
    private String audioUrl;




   
    @ManyToOne
    @JoinColumn(name = "user_id")
    private User user;

    @ManyToOne
    @JoinColumn(name = "artist_id")
    private  Artist artist;


    @ManyToOne
    @JoinColumn(name = "album_id")
    private Album album;


    // @ManyToOne
    // @JoinColumn(name = "playlist_id")
    // private Playlist playlist;

    




    public Song() {
    }




  






    
}