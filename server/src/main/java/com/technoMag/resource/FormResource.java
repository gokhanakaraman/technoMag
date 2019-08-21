package com.technoMag.resource;
import com.technoMag.document.Form;
import com.technoMag.repository.FormRepository;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/rest/form")
public class FormResource {

    private FormRepository formRepository;

    public FormResource(FormRepository formRepository)
    {
        this.formRepository=formRepository;
    }

    @GetMapping("/all")
    public List<Form> getAll(){
        return formRepository.findAll();
    }

    @PutMapping
    public void insert(@RequestBody Form form){
        this.formRepository.insert(form);
    }

    @PostMapping
    public void update(@RequestBody Form form){
        this.formRepository.save(form);
    }

    @DeleteMapping("/{id}")
    public void delete(@PathVariable("id") int id){
        this.formRepository.deleteById(id);
    }
}
