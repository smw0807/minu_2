package com.example.demo.service;

import org.springframework.stereotype.Service;

import com.example.demo.entity.UserEntity;
import com.example.demo.repo.UserRepository;

import java.util.*;

import lombok.RequiredArgsConstructor;;
// service계층에서는 DTO를 이용해 필요한 내용을 전달받고 반환하도록 처리한다
@RequiredArgsConstructor
@Service // 이 클래스는 서비스임을 알려줌
public class UserService {
  
  private UserRepository userRepository;

  public List<UserEntity> findAll() {
    return userRepository.findAll();
  }
}
