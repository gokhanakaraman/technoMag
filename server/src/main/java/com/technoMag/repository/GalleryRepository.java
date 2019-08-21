package com.technoMag.repository;

import com.technoMag.document.Gallery;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface GalleryRepository extends MongoRepository<Gallery,Integer> {
}
