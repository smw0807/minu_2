package com.example.demo.service;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.example.demo.dto.UserDTO;
import com.example.demo.entity.UserEntity;
import com.example.demo.repo.UserRepository;

import java.util.*;

import lombok.RequiredArgsConstructor;;
// service계층에서는 DTO를 이용해 필요한 내용을 전달받고 반환하도록 처리한다
@Service // 이 클래스는 서비스임을 알려줌
public interface UserService {
  
  // private static UserRepository userRepository;

  // public default List<UserEntity> userList(UserDTO userDTO) {
  //   return userRepository.findAll(userDTO);
  // }
  // @Transactional
  // public List<UserEntity> list(UserDTO userDTO) {
  //   List<UserEntity> userList = UserRepository.findAll(userDTO);
  //   return userList;
  // }
  
}
