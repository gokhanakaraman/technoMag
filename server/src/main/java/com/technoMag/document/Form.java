package com.technoMag.document;


import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;
import org.springframework.format.annotation.DateTimeFormat;

@Document
public class Form {

    @Id
    private Integer id;
    private String name;
    private String email;
    private String phone;
    private DateTimeFormat date;
    private String message;
    private Integer type;

    public Form(Integer id, String name, String email, String phone, DateTimeFormat date, String message, Integer type) {
        this.id = id;
        this.name = name;
        this.email = email;
        this.phone = phone;
        this.date = date;
        this.message = message;
        this.type = type;
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

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public DateTimeFormat getDate() {
        return date;
    }

    public void setDate(DateTimeFormat date) {
        this.date = date;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public Integer getType() {
        return type;
    }

    public void setType(Integer type) {
        this.type = type;
    }
}
