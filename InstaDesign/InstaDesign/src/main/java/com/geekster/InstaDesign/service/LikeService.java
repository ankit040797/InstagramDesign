package com.geekster.InstaDesign.service;

import com.geekster.InstaDesign.repo.ILikeRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class LikeService {
    @Autowired
    ILikeRepo likeRepo;

}
