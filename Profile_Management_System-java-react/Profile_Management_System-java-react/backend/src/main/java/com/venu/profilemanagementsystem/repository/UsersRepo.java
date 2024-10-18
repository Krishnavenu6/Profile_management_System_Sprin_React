package com.venu.profilemanagementsystem.repository;


import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;

import com.venu.profilemanagementsystem.entity.OurUsers;

public interface UsersRepo extends JpaRepository<OurUsers, Integer> {

    Optional<OurUsers> findByEmail(String email);
}
