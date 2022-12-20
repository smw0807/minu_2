package com.example.demo.controller;

import com.example.demo.dto.UserDTO;
import com.example.demo.entity.UserEntity;
import com.example.demo.repo.UserRepository;
import com.example.demo.service.UserService;

import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController // JSON 형태 결과값을 반환해준다.(@ResponseBody가 필요없음)
@RequiredArgsConstructor // final 객체를 Constructor Injection 해줌 (Autowired 역할)
@RequestMapping("/user")
public class UserController implements UserService {

  private final UserRepository userRepository;

  @GetMapping("/list")
  public List<UserEntity> findAllUser() {
    return userRepository.findAll();
  }

  // @GetMapping("/list2")
  // public List<UserEntity> findUser()  {

  // }

  @Override
  public Long register(UserDTO user) {
    // TODO Auto-generated method stub
    return null;
  }

  // @PostMapping("/add")
  // public UserEntity signUp() {
  //   final UserEntity user = UserEntity.builder().user_id("smw002").user_nm("smw002").user_pw("123123123").build();
  //   return UserRepository.save(user);
  // }
  
}
