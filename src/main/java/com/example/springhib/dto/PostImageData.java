package com.example.springhib.dto;

import com.example.springhib.models.Post;

import javax.persistence.*;

public class PostImageData {
    private Long pImgId;
    private String imageLocation;   //This will be an index to the file system. In this case it will be on our server's filesystem.
    private String imgCaption;      //This might be kept in the markdown file, if so use this string as a general description.
    //private Post post;


    public Long getpImgId() {
        return pImgId;
    }

    public void setpImgId(Long pImgId) {
        this.pImgId = pImgId;
    }

    public String getImageLocation() {
        return imageLocation;
    }

    public void setImageLocation(String imageLocation) {
        this.imageLocation = imageLocation;
    }

    public String getImgCaption() {
        return imgCaption;
    }

    public void setImgCaption(String imgCaption) {
        this.imgCaption = imgCaption;
    }

//    public Post getPost() {
//        return post;
//    }
//
//    public void setPost(Post post) {
//        this.post = post;
//    }
}
