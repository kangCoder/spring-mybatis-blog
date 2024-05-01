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
  private String title;
  private String content;
  private String username;
  private Date createdAt;
}
