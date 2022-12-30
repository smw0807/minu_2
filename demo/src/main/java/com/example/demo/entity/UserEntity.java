package com.example.demo.entity;
/**
 * @Entity : JPA를 사용할 클래스를 명시하며, 테이블과 매핑하는 역할을 한다.
 * @Id : 기본키(Primary Key)라는 것을 명시하는 역하을 한다.
 * @GeneratedValue : 키값의 자동생성 전략을 성정할 수 있다. (default : GenerationType.AUTO)
 * @column : 컬럼의 속성값을 설정할 수 있다.
 */

import lombok.*;

import com.example.demo.dto.UserDTO;

import javax.persistence.*;

@Getter //getter 자동생성
@NoArgsConstructor	//lombok. 기본 생성자 생성
@Entity(name="user")
public class UserEntity {
  
  @Id // ID 값, Primary Key로 사용하겠다는 의미
  @Column(name = "user_id", nullable = false, unique = true, length = 50)
  private String userId;

  @Column(name = "user_nm", nullable = false, unique = true, length = 50)
  private String userNm;

  @Column(name = "user_pw", nullable = false, unique = true, length = 30)
  private String userPw;

  @Column(name = "user_desc", nullable = false)
  private String userDesc;

  public void User(UserDTO user) {
    this.userId = user.getId();
    this.userNm = user.getName();
    this.userPw = user.getPassword();
    this.userDesc = user.getDesc();
  }
}
