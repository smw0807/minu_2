package com.example.demo.repo;

import com.example.demo.dto.UserDTO;
import com.example.demo.entity.UserEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;

@Repository
public interface UserRepository extends JpaRepository<UserEntity, String>{

  List<UserEntity> findAll();
  // List<UserEntity> findAll(UserDTO userDTO);
  Optional<UserEntity> findById(String name);
}

