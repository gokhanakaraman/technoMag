package com.technoMag.repository;

import com.technoMag.document.Interviews;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface InterviewsRepository extends MongoRepository<Interviews,Integer> {
}
