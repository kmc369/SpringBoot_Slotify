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



    //relationships 
   
    @ManyToOne
    @JoinColumn(name = "user_id")
    private User user;

    @ManyToOne
    @JoinColumn(name = "artist_id")
    private  Artist artist;


    @ManyToOne
    @JoinColumn(name = "album_id")
    private Album album;


    @ManyToOne
    @JoinColumn(name = "playlist_id")
    private Playlist playlist;

    




    public Song() {
    }


    public Song(int id, String genre, String name, String time, String audioUrl, User user, Artist artist, Album album, Playlist playlist) {
        this.id = id;
        this.genre = genre;
        this.name = name;
        this.time = time;
        this.audioUrl = audioUrl;
        this.user = user;
        this.artist = artist;
        this.album = album;
        this.playlist = playlist;
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

    public String getAudioUrl() {
        return this.audioUrl;
    }

    public void setAudioUrl(String audioUrl) {
        this.audioUrl = audioUrl;
    }

    public User getUser() {
        return this.user;
    }

    public void setUser(User user) {
        this.user = user;
    }

    public Artist getArtist() {
        return this.artist;
    }

    public void setArtist(Artist artist) {
        this.artist = artist;
    }

    public Album getAlbum() {
        return this.album;
    }

    public void setAlbum(Album album) {
        this.album = album;
    }

    public Playlist getPlaylist() {
        return this.playlist;
    }

    public void setPlaylist(Playlist playlist) {
        this.playlist = playlist;
    }


    @Override
    public String toString() {
        return "{" +
            " id='" + getId() + "'" +
            ", genre='" + getGenre() + "'" +
            ", name='" + getName() + "'" +
            ", time='" + getTime() + "'" +
            ", audioUrl='" + getAudioUrl() + "'" +
            ", user='" + getUser() + "'" +
            ", artist='" + getArtist() + "'" +
            ", album='" + getAlbum() + "'" +
            ", playlist='" + getPlaylist() + "'" +
            "}";
    }






  






    
}