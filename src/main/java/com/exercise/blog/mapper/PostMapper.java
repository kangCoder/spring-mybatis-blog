package com.exercise.blog.mapper;

import com.exercise.blog.dto.Post;
import java.util.List;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

@Mapper
public interface PostMapper {

  List<Post> findAll();
  Post findOne(@Param("id") Integer id);
}
