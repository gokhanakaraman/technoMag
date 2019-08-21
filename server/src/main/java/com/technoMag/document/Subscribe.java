package com.technoMag.document;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;
import org.springframework.format.annotation.DateTimeFormat;

@Document
public class Subscribe {

    @Id
    private Integer id;
    private String email;
    private Integer subscribed;
    private DateTimeFormat subscribedDate;
    private DateTimeFormat updatedDate;

    public Subscribe(Integer id, String email, Integer subscribed, DateTimeFormat subscribedDate, DateTimeFormat updatedDate) {
        this.id = id;
        this.email = email;
        this.subscribed = subscribed;
        this.subscribedDate = subscribedDate;
        this.updatedDate = updatedDate;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public Integer getSubscribed() {
        return subscribed;
    }

    public void setSubscribed(Integer subscribed) {
        this.subscribed = subscribed;
    }

    public DateTimeFormat getSubscribedDate() {
        return subscribedDate;
    }

    public void setSubscribedDate(DateTimeFormat subscribedDate) {
        this.subscribedDate = subscribedDate;
    }

    public DateTimeFormat getUpdatedDate() {
        return updatedDate;
    }

    public void setUpdatedDate(DateTimeFormat updatedDate) {
        this.updatedDate = updatedDate;
    }
}
