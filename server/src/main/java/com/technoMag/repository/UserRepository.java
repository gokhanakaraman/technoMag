package com.technoMag.repository;

        import com.technoMag.document.Users;
        import org.springframework.data.mongodb.repository.MongoRepository;

public interface UserRepository extends MongoRepository<Users, Integer> {
}
