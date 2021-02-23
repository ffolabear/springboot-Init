package com.springboot.test.main.service.posts;

import com.springboot.test.main.web.domain.posts.PostsRepository;
import com.springboot.test.main.web.dto.PostsSaveRequestDto;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;

@RequiredArgsConstructor
@Service
public class PostsService {

    private final PostsRepository postsRepository;

    @Transactional
    public Long save(PostsSaveRequestDto requestDto){

        return postsRepository.save(requestDto.toEntity()).getID();
    }

}
