package com.technoMag.document;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;
import org.springframework.format.annotation.DateTimeFormat;

@Document
public class Gallery {

    @Id
    private Integer id;
    private String photopath;
    private DateTimeFormat createdDate;
    private DateTimeFormat updatedDate;
    private Integer type;

    public Gallery(Integer id, String photopath, DateTimeFormat createdDate, DateTimeFormat updatedDate, Integer type) {
        this.id = id;
        this.photopath = photopath;
        this.createdDate = createdDate;
        this.updatedDate = updatedDate;
        this.type = type;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getPhotopath() {
        return photopath;
    }

    public void setPhotopath(String photopath) {
        this.photopath = photopath;
    }

    public DateTimeFormat getCreatedDate() {
        return createdDate;
    }

    public void setCreatedDate(DateTimeFormat createdDate) {
        this.createdDate = createdDate;
    }

    public DateTimeFormat getUpdatedDate() {
        return updatedDate;
    }

    public void setUpdatedDate(DateTimeFormat updatedDate) {
        this.updatedDate = updatedDate;
    }

    public Integer getType() {
        return type;
    }

    public void setType(Integer type) {
        this.type = type;
    }
}
