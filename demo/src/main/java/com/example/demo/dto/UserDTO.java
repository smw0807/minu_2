package com.example.demo.dto;

import javax.persistence.*;

import com.example.demo.entity.UserEntity;

import lombok.*;

// Entity클래스인 Guestbook과 거의 동일한 필드를 가지고 있으며 getter/setter를 통해 자유롭게 값을 변경할 수 있도록 구성한다
@Getter
public class UserDTO {
  
  private String id;
  private String name;
  private String password;
  private String desc;

  

}
