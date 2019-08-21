package com.technoMag.repository;
import com.technoMag.document.News;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface NewsRepository extends MongoRepository<News,Integer> {
}
