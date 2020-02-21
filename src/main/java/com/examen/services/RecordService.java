package com.examen.services;

import com.examen.models.Record;
import com.examen.repository.RecordRepository;
import com.examen.repository.CRUD;
import org.springframework.stereotype.Service;

import java.util.Collection;
import java.util.List;

@Service
public class RecordService extends CRUD<Record, RecordRepository> {
    public RecordService(RecordRepository repository) {
        super(repository);
    }

    @Override
    public List<Record> list() {
        return repository.findAll();
    }

    @Override
    public Record get(int id) {
        return repository.findById(id).get();
    }

    @Override
    public void add(Record o) {
        repository.save(o);
    }

    @Override
    public void update(Record o, int id) {
        o.setId(id);
        repository.save(o);
    }

    @Override
    public void delete(int id) {
        repository.deleteById(id);
    }


    public Collection<Object> find_by_artist(String artist){
        return repository.findAlbumByArtist(artist);
    }

    public Collection<Object> find_by_album(String album) {
        return repository.findArtistByAlbum(album);
    }
}
