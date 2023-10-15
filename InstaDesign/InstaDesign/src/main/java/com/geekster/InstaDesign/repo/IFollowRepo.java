package com.geekster.InstaDesign.repo;

import com.geekster.InstaDesign.model.Follow;
import com.geekster.InstaDesign.model.User;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface IFollowRepo extends JpaRepository<Follow,Integer> {
    List<Follow> findByCurrentUserAndCurrentUserFollower(User targetUser, User follower);
}
