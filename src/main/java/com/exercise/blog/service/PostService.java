package com.exercise.blog.service;

import com.exercise.blog.dto.Post;
import com.exercise.blog.mapper.PostMapper;
import java.util.List;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class PostService {

  private final PostMapper postMapper;

  public List<Post> getAllPost() {
    return postMapper.findAll();
  }

  public Post getPostById(Integer id) {
    Post post = postMapper.findOne(id);
    System.out.println(post.getUserId());
    return postMapper.findOne(id);
  }
}
