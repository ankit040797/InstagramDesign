package com.geekster.InstaDesign.service;

import com.geekster.InstaDesign.model.Post;
import com.geekster.InstaDesign.repo.IPostRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class PostService {

    @Autowired
    IPostRepo postRepo;


    public void createInstaPost(Post instaPost) {
        postRepo.save(instaPost);
    }

    public Post getPostById(Integer postId) {
        return  postRepo.findById(postId).orElseThrow();

    }

    public void removeById(Integer postId) {

        //delete all likes


        // delete all comments


        //finally delete post

    }
}
