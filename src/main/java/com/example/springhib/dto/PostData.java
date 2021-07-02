package com.example.springhib.dto;

//Data Transfer Object

import com.fasterxml.jackson.annotation.JsonFormat;

import java.util.Date;

public class PostData {
    private Long id;
    private String title;
    private String body;


    @JsonFormat(shape=JsonFormat.Shape.STRING, pattern="YYYY-MM-DD")
    private Date authoredDate;

    public PostData(){

    }

    public Long getId(){
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getBody() {
        return body;
    }

    public void setBody(String body) {
        this.body = body;
    }

    @JsonFormat(shape=JsonFormat.Shape.STRING, pattern="YYYY-MM-DD")
    public Date getAuthoredDate() {
        return authoredDate;
    }

    @JsonFormat(shape=JsonFormat.Shape.STRING, pattern="YYYY-MM-DD")
    public void setAuthoredDate(Date authoredDate) {
        this.authoredDate = authoredDate;
    }
}
