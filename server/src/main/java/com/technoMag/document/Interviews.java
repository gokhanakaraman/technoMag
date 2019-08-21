package com.technoMag.document;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;
import org.springframework.format.annotation.DateTimeFormat;

@Document
public class Interviews {

    @Id
    private Integer id;
    private String author;
    private DateTimeFormat createdDate;
    private DateTimeFormat updatedDate;
    private String description;
    private String coverPhotoPath;

    public Interviews(Integer id, String author, DateTimeFormat createdDate, DateTimeFormat updatedDate, String description, String coverPhotoPath) {
        this.id = id;
        this.author = author;
        this.createdDate = createdDate;
        this.updatedDate = updatedDate;
        this.description = description;
        this.coverPhotoPath = coverPhotoPath;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
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

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getCoverPhotoPath() {
        return coverPhotoPath;
    }

    public void setCoverPhotoPath(String coverPhotoPath) {
        this.coverPhotoPath = coverPhotoPath;
    }
}
