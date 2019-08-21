package com.technoMag.resource;
import com.technoMag.document.News;
import com.technoMag.repository.NewsRepository;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/rest/news")
public class NewsResource {

    private NewsRepository newsRepository;

    public NewsResource(NewsRepository newsRepository)
    {
        this.newsRepository=newsRepository;
    }

    @GetMapping("/all")
    public List<News> getAll(){
        return newsRepository.findAll();
    }

    @PutMapping
    public void insert(@RequestBody News news){
        this.newsRepository.insert(news);
    }

    @PostMapping
    public void update(@RequestBody News news){
        this.newsRepository.save(news);
    }

    @DeleteMapping("/{id}")
    public void delete(@PathVariable("id") int id){
        this.newsRepository.deleteById(id);
    }
}
