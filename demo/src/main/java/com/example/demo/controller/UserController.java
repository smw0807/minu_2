package com.example.demo.controller;

import com.example.demo.dto.UserDTO;
import com.example.demo.entity.UserEntity;
import com.example.demo.service.UserService;

import lombok.RequiredArgsConstructor;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController // JSON 형태 결과값을 반환해준다.(@ResponseBody가 필요없음)
@RequiredArgsConstructor // final 객체를 Constructor Injection 해줌 (Autowired 역할)
@RequestMapping("/user")
public class UserController {

  private UserService userService;

  @GetMapping("/list")
  public ResponseEntity<?> findAllUser(@ModelAttribute UserDTO userDTO) {
    System.out.println("######## S3");
    System.out.println(userDTO.getId());
    System.out.println(userDTO.getName());
    System.out.println(userDTO.getPassword());
    System.out.println(userDTO.getDesc());
    System.out.println("######## E");
    List<UserEntity> list = userService.findAll();
    return ResponseEntity.ok().body(list);
  }
}
