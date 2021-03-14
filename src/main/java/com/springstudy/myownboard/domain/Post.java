package com.springstudy.myownboard.domain;

import lombok.Getter;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.sql.Timestamp;

@Entity
@Getter
@NoArgsConstructor
public class Post {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    @Column(nullable = false)
    private String writer;

    @Column(nullable = false)
    private String contents;

    public Post(PostRequestDto postRequestDto) {
        this.writer = writer;
        this.contents = contents;
    }

    public void update(PostRequestDto requestDto) {
        this.writer=requestDto.getWriter();
        this.contents=requestDto.getContents();
    }
}
