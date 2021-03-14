package com.springstudy.myownboard.service;

import com.springstudy.myownboard.domain.Post;
import com.springstudy.myownboard.domain.PostRepository;
import com.springstudy.myownboard.domain.PostRequestDto;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
@RequiredArgsConstructor
public class PostService {
    private final PostRepository postRepository;

    @Transactional
    public Long updatePost(Long id, PostRequestDto postRequestDto) {
        Post post=postRepository.findById(id).orElseThrow(
                ()->new IllegalArgumentException("아이디가 존재하지 않습니다.")
        );
        post.update(postRequestDto);
        return post.getId();
    }
}
