package com.geekster.InstaDesign.repo;

import com.geekster.InstaDesign.model.Post;
import org.springframework.data.jpa.repository.JpaRepository;

public interface IPostRepo extends JpaRepository<Post,Integer> {
}
