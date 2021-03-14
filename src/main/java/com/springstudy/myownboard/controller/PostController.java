package com.springstudy.myownboard.controller;

import com.springstudy.myownboard.domain.Post;
import com.springstudy.myownboard.domain.PostRepository;
import com.springstudy.myownboard.domain.PostRequestDto;
import com.springstudy.myownboard.service.PostService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequiredArgsConstructor
public class PostController {
    private final PostRepository postRepository;
    private final PostService postService;

    @PostMapping("/api/posts")
    public Post createPost(@RequestBody PostRequestDto postRequestDto) {
        Post post=new Post(postRequestDto);
        return post;
    }

    @GetMapping("/api/posts")
    public List<Post> getPost() {
        return postRepository.findAll();
    }

    @PutMapping("/api/posts/{id}")
    public Long updatePost(@PathVariable Long id, @RequestBody PostRequestDto postRequestDto) {
        postService.updatePost(id, postRequestDto);
        return id;
    }

    @DeleteMapping("/api/posts/{id}")
    public Long deletePost(@PathVariable Long id) {
        postRepository.deleteById(id);
        return id;
    }
}
