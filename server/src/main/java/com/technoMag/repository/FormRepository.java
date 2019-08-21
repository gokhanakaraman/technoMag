package com.technoMag.repository;

import com.technoMag.document.Form;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface FormRepository extends MongoRepository<Form,Integer> {
}
