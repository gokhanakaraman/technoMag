package com.technoMag.resource;
import com.technoMag.document.Gallery;
import com.technoMag.repository.GalleryRepository;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/rest/gallery")
public class GalleryResource {

    private GalleryRepository galleryRepository;

    public GalleryResource(GalleryRepository galleryRepository)
    {
        this.galleryRepository=galleryRepository;
    }

    @GetMapping("/all")
    public List<Gallery> getAll(){
        return galleryRepository.findAll();
    }

    @PutMapping
    public void insert(@RequestBody Gallery gallery){
        this.galleryRepository.insert(gallery);
    }

    @PostMapping
    public void update(@RequestBody Gallery gallery){
        this.galleryRepository.save(gallery);
    }

    @DeleteMapping("/{id}")
    public void delete(@PathVariable("id") int id){
        this.galleryRepository.deleteById(id);
    }
}
