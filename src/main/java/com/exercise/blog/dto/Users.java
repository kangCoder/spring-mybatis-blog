package com.exercise.blog.dto;

import java.util.Date;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class Users {

  private Integer id;
  private String email;
  private String name;
  private String password;
  private Date createdAt;

  public Users(String name, String email, String password) {
    this.name = name;
    this.email = email;
    this.password = password;
  }

  public Users(String email, String name) {
    this.email = email;
    this.name = name;
  }
}
