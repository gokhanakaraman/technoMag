package com.technoMag.resource;
import com.technoMag.document.Interviews;
import com.technoMag.repository.InterviewsRepository;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/rest/interviews")
public class InterviewsResource {

    private InterviewsRepository interviewsRepository;

    public InterviewsResource(InterviewsRepository interviewsRepository)
    {
        this.interviewsRepository=interviewsRepository;
    }

    @GetMapping("/all")
    public List<Interviews> getAll(){
        return interviewsRepository.findAll();
    }

    @PutMapping
    public void insert(@RequestBody Interviews interviews){
        this.interviewsRepository.insert(interviews);
    }

    @PostMapping
    public void update(@RequestBody Interviews interviews){
        this.interviewsRepository.save(interviews);
    }

    @DeleteMapping("/{id}")
    public void delete(@PathVariable("id") int id){
        this.interviewsRepository.deleteById(id);
    }
}
