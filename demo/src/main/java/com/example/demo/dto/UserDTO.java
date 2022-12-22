package com.example.demo.dto;

import javax.persistence.*;

import com.example.demo.entity.UserEntity;

import lombok.*;

// Entity클래스인 Guestbook과 거의 동일한 필드를 가지고 있으며 getter/setter를 통해 자유롭게 값을 변경할 수 있도록 구성한다
// @Getter //getter 자동 생성
// @Setter //setter 자동생성
// @RequiredArgsConstructor // 꼭 필요한 요소(final) 자동 생성
@Data //뤼 이노테이션들을 다 적용시켜주는놈
public class UserDTO {
  
  private String id;  // final 은 꼭 필요한 요소임을 명시하는 것, 값이 변경 될 수 없음
  private String name;
  private String password;
  private String desc;

  //repository를 통해 조회한 Entity를 DTO로 변환 용도
  public void UserReponseDto(UserEntity userEntity) {
    this.id = userEntity.getUser_id();
    this.name = userEntity.getUser_nm();
    this.password = userEntity.getUser_pw();
    this.desc = userEntity.getUser_desc();
  }
}
