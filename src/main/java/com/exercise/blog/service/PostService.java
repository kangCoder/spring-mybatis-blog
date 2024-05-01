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

  public Post getPostById(Integer id) {
    return postMapper.findOne(id);
  }
}
