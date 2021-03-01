package com.springboot.test.main.web.domain.posts;

import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@Getter
@NoArgsConstructor
@Entity                 // 테이블과 링크될 클래스임을 나타냄
public class Posts {

    @Id                 // PK
    @GeneratedValue(strategy = GenerationType.IDENTITY)    // PK 생성규칙
    private Long ID;

    @Column(length = 500, nullable = false)                // 테이블의 칼럼을 나타내지만 굳이 선언하지 않아도 모든 필드는 칼럼
    private String title;

    @Column(columnDefinition = "TEXT", nullable = false)
    private String content;


    private String author;

    @Builder
    public Posts(String title, String content, String author){
        this.title = title;
        this.content = content;
        this.author = author;
    }

    public void update(String title, String content){
        this.title = title;
        this.content = content;
    }

}
