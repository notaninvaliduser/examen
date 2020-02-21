package com.examen.restcontroller;

import com.examen.models.Record;
import com.examen.services.RecordService;
import com.examen.utils.UrlConstants;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.Collection;
import java.util.List;

@RestController
@RequestMapping(UrlConstants.RECORDS)
public class RecordRestController {
    @Autowired
    RecordService service;

    @GetMapping(UrlConstants.LIST)
    public List<Record> list (){
     return service.list();
    }



    @GetMapping(UrlConstants.GET)
    public Record get(@PathVariable int id){
        return service.get(id);
    }
    @PostMapping(UrlConstants.ADD)
    public void add(@RequestBody Record record){
        service.add(record);
    }

    @PutMapping(UrlConstants.UPDATE)
    public void update(@RequestBody Record record, @PathVariable int id){
        service.update(record, id);
    }
    @DeleteMapping(UrlConstants.DELETE)
    public void delete(@PathVariable int id){
        service.delete(id);
    }

    @GetMapping(UrlConstants.FIND_BY_ARTIST)
    public Collection<Object> getAlbumByArtist(@PathVariable String Artist){
        return service.find_by_artist(Artist);
    }
    @GetMapping(UrlConstants.FIND_BY_ALBUM)
    public Collection<Object> getArtistByAlbum(@PathVariable String Album){
        return service.find_by_artist(Album);
    }
}
