package com.technoMag.resource;
import com.technoMag.document.Biography;
import com.technoMag.repository.BiographyRepository;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/rest/biography")
public class BiographyResource {

    private BiographyRepository biographyRepository;

    public BiographyResource(BiographyRepository biographyRepository)
    {
        this.biographyRepository=biographyRepository;
    }

    @GetMapping("/all")
    public List<Biography> getAll(){
        return biographyRepository.findAll();
    }

    @PutMapping
    public void insert(@RequestBody Biography biography){
        this.biographyRepository.insert(biography);
    }

    @PostMapping
    public void update(@RequestBody Biography biography){
        this.biographyRepository.save(biography);
    }

    @DeleteMapping("/{id}")
    public void delete(@PathVariable("id") int id){
        this.biographyRepository.deleteById(id);
    }
}
