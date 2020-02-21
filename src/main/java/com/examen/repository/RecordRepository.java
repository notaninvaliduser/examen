package com.examen.repository;


import com.examen.models.Record;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.Collection;

public interface RecordRepository extends JpaRepository<Record, Integer> {

    @Query("from Record record where album =:album")
    Collection<Object> findArtistByAlbum(String album);

    @Query("from Record record where artist =:artist ")
    Collection<Object> findAlbumByArtist(String artist);
}
