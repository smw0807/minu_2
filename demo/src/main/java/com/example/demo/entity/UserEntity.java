package com.example.demo.entity;
/**
 * @Entity : JPA를 사용할 클래스를 명시하며, 테이블과 매핑하는 역할을 한다.
 * @Id : 기본키(Primary Key)라는 것을 명시하는 역하을 한다.
 * @GeneratedValue : 키값의 자동생성 전략을 성정할 수 있다. (default : GenerationType.AUTO)
 * @column : 컬럼의 속성값을 설정할 수 있다.
 */

import lombok.*;

import javax.persistence.*;

@Getter // getter 메소드 생성
@Builder // 빌더를 사용할 수 있게 함
@AllArgsConstructor
@NoArgsConstructor(access = AccessLevel.PROTECTED)
@Entity(name="user")
public class UserEntity {
  @Id
  // @GeneratedValue(strategy = GenerationType.IDENTITY)
  @Column(nullable = false, unique = true, length = 50)
  private String user_id;

  @Column(nullable = false, unique = true, length = 50)
  private String user_nm;

  @Column(nullable = false, unique = true, length = 30)
  private String user_pw;

  @Column(nullable = false)
  private String user_desc;

  public UserEntity(String user_id, String user_nm, String user_pw) {
    this.user_id = user_id;
    this.user_nm = user_nm;
    this.user_pw = user_pw;
  }
}
