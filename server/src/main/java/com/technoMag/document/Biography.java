package com.technoMag.document;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.aggregation.ArrayOperators;
import org.springframework.data.mongodb.core.mapping.Document;
import org.springframework.format.annotation.DateTimeFormat;

import java.time.LocalDate;
import java.util.Date;

@Document
public class Biography {

    @Id
    private Integer id;
    private String name;
    private String coverPhotoPath;
    private String description;
    private Date createdDate ;
    private Date updatedDate;
    private Integer age;
    private String country;
    private String basedIn;

    public Biography(Integer id, String name, String coverPhotoPath, String description, Date createdDate, Date updatedDate, Integer age, String country, String basedIn) {
        this.id = id;
        this.name = name;
        this.coverPhotoPath = coverPhotoPath;
        this.description = description;
        this.createdDate = createdDate;
        this.updatedDate = updatedDate;
        this.age = age;
        this.country = country;
        this.basedIn = basedIn;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getCoverPhotoPath() {
        return coverPhotoPath;
    }

    public void setCoverPhotoPath(String coverPhotoPath) {
        this.coverPhotoPath = coverPhotoPath;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public Date getCreatedDate() {
        return createdDate;
    }

    public void setCreatedDate(Date createdDate) {
        this.createdDate = createdDate;
    }

    public Date getUpdatedDate() {
        return updatedDate;
    }

    public void setUpdatedDate(Date updatedDate) {
        this.updatedDate = updatedDate;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public String getBasedIn() {
        return basedIn;
    }

    public void setBasedIn(String basedIn) {
        this.basedIn = basedIn;
    }
}
