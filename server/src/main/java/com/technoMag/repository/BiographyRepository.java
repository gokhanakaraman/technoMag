package com.technoMag.repository;

import com.technoMag.document.Biography;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface BiographyRepository extends MongoRepository<Biography,Integer> {
}
