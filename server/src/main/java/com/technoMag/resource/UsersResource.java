package com.technoMag.resource;

import com.technoMag.document.Users;
import com.technoMag.repository.UserRepository;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/rest/users")
public class UsersResource {

    private UserRepository userRepository;

    public UsersResource(UserRepository userRepository) {
        this.userRepository = userRepository;
    }

    @GetMapping("/all")
    @CrossOrigin
    public List<Users> getAll() {
       return userRepository.findAll();
    }

    @PutMapping //http status döndür
    public void insert(@RequestBody Users user){
        this.userRepository.insert(user);
    }

    @PostMapping
    public void update(@RequestBody Users user){
        this.userRepository.save(user);
    }

    @DeleteMapping("/{id}")
    public void delete(@PathVariable("id") int id){
        this.userRepository.deleteById(id);
    }
}
