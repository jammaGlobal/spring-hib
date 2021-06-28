package com.example.springhib.service;

import com.example.springhib.dto.PostData;

import java.util.List;


public interface PostService {
    PostData savePost(PostData post);
    boolean deletePost(final Long postId);
    List<PostData> getAllPosts();
    PostData getPostById(final Long postId);

}
