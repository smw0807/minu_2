package com.example.demo.service;

import com.example.demo.dto.UserDTO;;
// service계층에서는 DTO를 이용해 필요한 내용을 전달받고 반환하도록 처리한다
public interface UserService {
  Long register(UserDTO user);

  
}
