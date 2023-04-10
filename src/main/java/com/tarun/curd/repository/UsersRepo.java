package com.tarun.curd.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.tarun.curd.entites.Users;

@Repository
public interface UsersRepo extends JpaRepository<Users, Integer> {

}
