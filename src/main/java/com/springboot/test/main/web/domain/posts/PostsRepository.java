package com.springboot.test.main.web.domain.posts;

import org.springframework.data.jpa.repository.JpaRepository;

//인터페이스 생성후 JpaRepository<엔티티 클래스, PK 타입> 을 상속하면 기본 CRUD가 생성
public interface PostsRepository extends JpaRepository<Posts, Long> {
}
