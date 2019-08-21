package com.technoMag.repository;
import com.technoMag.document.Subscribe;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface SubscribeRepository extends MongoRepository<Subscribe,Integer> {
}
