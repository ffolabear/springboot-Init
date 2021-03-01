package com.springboot.test.main.web;

import com.springboot.test.main.service.posts.PostsService;
import com.springboot.test.main.web.dto.PostUpdateRequestDto;
import com.springboot.test.main.web.dto.PostsResponseDto;
import com.springboot.test.main.web.dto.PostsSaveRequestDto;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

@RequiredArgsConstructor
@RestController
public class PostsApiController {

    private final PostsService postsService;

    @PostMapping("/api/v1/posts")
    public Long save(@RequestBody PostsSaveRequestDto requestDto){

        return postsService.save(requestDto);

    }

    @PutMapping("/api/v1/posts/{id}")
    public Long upate(@PathVariable Long id, @RequestBody PostUpdateRequestDto requestDto){

        return postsService.update(id, requestDto);
    }

    @GetMapping("/api/v1/posts/{id}")
    public PostsResponseDto findById(@PathVariable Long id){

        return postsService.findById(id);
    }


}
