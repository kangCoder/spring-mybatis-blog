package com.exercise.blog.controller;

import com.exercise.blog.dto.Post;
import com.exercise.blog.service.PostService;
import java.util.List;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequiredArgsConstructor
public class PostController {

  private final PostService postService;

  @GetMapping("/post")
  @ResponseBody
  public List<Post> getAllPost() {
    return postService.getAllPost();
  }

  @GetMapping("/post/{id}")
  @ResponseBody
  public Post getPostById(@PathVariable Integer id) {
    return postService.getPostById(id);
  }
}
