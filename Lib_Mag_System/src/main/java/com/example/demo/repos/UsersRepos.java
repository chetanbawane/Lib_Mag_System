package com.example.demo.repos;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.demo.entity.Users;

@Repository
public interface UsersRepos extends JpaRepository<Users, Integer> {

}
