package com.technoMag.resource;
import com.technoMag.document.Subscribe;
import com.technoMag.repository.SubscribeRepository;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/rest/subscribe")
public class SubscribeResource {

    private SubscribeRepository subscribeRepository;

    public SubscribeResource(SubscribeRepository subscribeRepository)
    {
        this.subscribeRepository=subscribeRepository;
    }

    @GetMapping("/all")
    public List<Subscribe> getAll(){
        return subscribeRepository.findAll();
    }

    @PutMapping
    public void insert(@RequestBody Subscribe subscribe){
        this.subscribeRepository.insert(subscribe);
    }

    @PostMapping
    public void update(@RequestBody Subscribe subscribe){
        this.subscribeRepository.save(subscribe);
    }

    @DeleteMapping("/{id}")
    public void delete(@PathVariable("id") int id){
        this.subscribeRepository.deleteById(id);
    }
}
