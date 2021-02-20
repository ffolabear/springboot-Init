package com.springboot.test.main.web;

import com.springboot.test.main.web.dto.HelloResponseDto;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

// JSON을 반환하는 컨트롤러로 만들어줌
// 이전의 ResponseBody 를 메소드 마다 선언했던걸을 한번에 사용하게 해줌
@RestController
public class HelloController {

    // HttpMethod GET 요청을 받을 수 있게 해줌
    // 이전에는 @RequestMapping(Method = RequestMethod.GET)
    @GetMapping("/hello")
    public String hello(){
        return "hello";
    }

    // requestParam : 외부에서 API로 넘긴 파라미터를 가져오는 어노테이션
    // @RequestParam("name") 를 String name에 저장
    @GetMapping("/hello/dto")
    public HelloResponseDto helloDto(@RequestParam("name") String name,
                                     @RequestParam("amount") int amount){

        return new HelloResponseDto(name, amount);
    }






}
