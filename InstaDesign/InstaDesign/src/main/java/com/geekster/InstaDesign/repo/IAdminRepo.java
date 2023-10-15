package com.geekster.InstaDesign.repo;

import com.geekster.InstaDesign.model.Admin;
import org.springframework.data.jpa.repository.JpaRepository;

public interface IAdminRepo extends JpaRepository<Admin,Long> {
}
