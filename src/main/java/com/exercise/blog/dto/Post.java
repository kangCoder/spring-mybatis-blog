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
public class Post {

  private Integer id;
  private Integer userId;
  private String title;
  private String content;
  private String username;
  private Date createdAt;
  private Users user;

  public Post(Integer id, Integer userId, String title, String content) {
    this.id = id;
    this.userId = userId;
    this.title = title;
    this.content = content;
  }

  public Post(Integer id, Integer userId, String title, String content, String email, String name) {
    this.id = id;
    this.userId = userId;
    this.title = title;
    this.content = content;
    this.user = new Users(email, name);
  }
}
