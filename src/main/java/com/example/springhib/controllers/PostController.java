package com.example.springhib.controllers;

import com.example.springhib.dto.PostData;
import com.example.springhib.service.PostService;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;
import java.util.List;

//Controller merely presents business functions that are implemented in the application service layer as "Services"

@RestController
@RequestMapping("/posts")
public class PostController {

    @Resource(name = "postService")
    private PostService postService;

    @GetMapping
    public List <PostData> getPosts(){
        return postService.getAllPosts();
    }

    @GetMapping("/post/{id}")
    public PostData getPost(@PathVariable Long id){
        return postService.getPostById(id);
    }

    @PostMapping("/post")
    public PostData savePost(final @RequestBody PostData postData){
        return postService.savePost(postData);
    }

    @DeleteMapping("/post/{id}")
    public Boolean deletePost(@PathVariable Long id){
        return postService.deletePost(id);
    }
}
