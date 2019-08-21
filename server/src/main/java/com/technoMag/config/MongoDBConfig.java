package com.technoMag.config;

import com.technoMag.document.Users;
import com.technoMag.repository.UserRepository;
import com.technoMag.document.Biography;
import com.technoMag.repository.BiographyRepository;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.data.mongodb.repository.config.EnableMongoRepositories;

import java.text.SimpleDateFormat;

@EnableMongoRepositories(basePackageClasses = {UserRepository.class , BiographyRepository.class})
@Configuration
public class MongoDBConfig {

    @Bean
    CommandLineRunner commandLineRunner(UserRepository userRepository) {
        return strings -> {
                userRepository.save(new Users(1,"Gökhan","Development",3000L));
                userRepository.save(new Users(2,"Hakan","Development",3000L));
                userRepository.save(new Users(3,"Mete","Development",3000L));
                userRepository.save(new Users(4,"Emre","Development",3000L));
        };
    }

    @Bean
    CommandLineRunner commandLineRunner1(BiographyRepository biographyRepository) {
        return strings -> {
            biographyRepository.save(new Biography(1,"Gökhan","C:/ " ," Açıklama ", new SimpleDateFormat("dd/MM/yyyy").parse("02/02/2000") , new SimpleDateFormat("dd/MM/yyyy").parse("04/04/2000"),34,"Turkey","Germany"));
            biographyRepository.save(new Biography(2,"Hakan","C:/ " ," Açıklama ", new SimpleDateFormat("dd/MM/yyyy").parse("02/02/2000") , new SimpleDateFormat("dd/MM/yyyy").parse("04/04/2000"),34,"France","England"));
            biographyRepository.save(new Biography(3,"Abdullah","C:/ " ," Açıklama ", new SimpleDateFormat("dd/MM/yyyy").parse("02/02/2000") , new SimpleDateFormat("dd/MM/yyyy").parse("04/04/2000"),34,"Belgium","Netherlands"));

        };
    }
}
