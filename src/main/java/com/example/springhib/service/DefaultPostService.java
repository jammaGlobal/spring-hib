package com.example.springhib.service;

import com.example.springhib.models.Post;
import com.example.springhib.repositories.PostImageRepository;
import com.example.springhib.repositories.PostRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.example.springhib.dto.PostData;


import javax.persistence.EntityNotFoundException;
import java.util.ArrayList;
import java.util.List;

//Services represent business use cases

@Service("postService")
public class DefaultPostService implements PostService {

    @Autowired
    private PostRepository postRepository;

    @Autowired
    private PostImageRepository postImageRepository;

    public PostData savePost(PostData post) {
        Post postModel = populatePostEntity(post);
        return populatePostData(postRepository.save(postModel)); //Error here
    }


    @Override
    public boolean deletePost(Long postId) {
        postRepository.deleteById(postId);
        return true;
    }


    @Override
    public List < PostData > getAllPosts() {
        List< PostData > posts = new ArrayList<>();
        List < Post > postList = postRepository.findAll();
        postList.forEach(post -> {
                posts.add(populatePostData(post));
        });
        return posts;
    }


    @Override
    public PostData getPostById(Long postId) {
        return populatePostData(postRepository.findById(postId).orElseThrow(
                () -> new EntityNotFoundException("Post not found")));
    }


    private PostData populatePostData(final Post post) {
        PostData postData = new PostData();
        postData.setId(post.getId());
        postData.setTitle(post.getTitle());
        postData.setBody(post.getBody());
        postData.setAuthoredDate(post.getAuthoredDate());
        postData.setPostImages(post.getPostImages());

        return postData;
    }

    private Post populatePostEntity(PostData postData) {
        Post post = new Post();
        post.setTitle(postData.getTitle());
        post.setBody(postData.getBody());
        post.setAuthoredDate(postData.getAuthoredDate());
        post.setPostImages(postData.getPostImages());
        return post;
    }
}
