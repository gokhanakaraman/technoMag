package com.technoMag.document;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;
import org.springframework.format.annotation.DateTimeFormat;

@Document
public class News {

    @Id
    private Integer id;
    private String title;
    private String description;
    private DateTimeFormat createdDate;
    private DateTimeFormat updatedDate;
    private String coverPhotoPath;
    private String author;

    public News(Integer id, String title, String description, DateTimeFormat createdDate, DateTimeFormat updatedDate, String coverPhotoPath, String author) {
        this.id = id;
        this.title = title;
        this.description = description;
        this.createdDate = createdDate;
        this.updatedDate = updatedDate;
        this.coverPhotoPath = coverPhotoPath;
        this.author = author;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
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

    public String getCoverPhotoPath() {
        return coverPhotoPath;
    }

    public void setCoverPhotoPath(String coverPhotoPath) {
        this.coverPhotoPath = coverPhotoPath;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }
}
