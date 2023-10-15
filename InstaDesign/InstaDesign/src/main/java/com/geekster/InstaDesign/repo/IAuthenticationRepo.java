package com.geekster.InstaDesign.repo;

import com.geekster.InstaDesign.model.AuthenticationToken;
import com.geekster.InstaDesign.model.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface IAuthenticationRepo extends JpaRepository<AuthenticationToken,Long> {

    AuthenticationToken findFirstByTokenValue(String authTokenValue);

    AuthenticationToken findFirstByUser(User user);
}
