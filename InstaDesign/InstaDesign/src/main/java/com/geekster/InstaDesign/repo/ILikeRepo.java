package com.geekster.InstaDesign.repo;

import com.geekster.InstaDesign.model.Like;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ILikeRepo extends JpaRepository<Like,Integer> {
}
