package com.examen.models;
import javax.persistence.*;

@Entity
@Table(name = "record")
public class Record {

    @Id
    @GeneratedValue(strategy=GenerationType.AUTO)
    private Integer id;

    @Column(name = "album_title")
    private String album_title;

    @Column(name = "artist_name")
    private String artist_name;

    @Column(name = "song_count")
    private short song_count;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getAlbum_title() {
        return album_title;
    }

    public void setAlbum_title(String album_title) {
        this.album_title = album_title;
    }

    public String getArtist_name() {
        return artist_name;
    }

    public void setArtist_name(String artist_name) {
        this.artist_name = artist_name;
    }

    public short getSong_count() {
        return song_count;
    }

    public void setSong_count(short song_count) {
        this.song_count = song_count;
    }

    public Record() {
    }
}
