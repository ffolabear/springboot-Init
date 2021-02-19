package com.springboot.test.main;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

// 여기서 부터 패키지를 읽어 내려감. 그러므로 가장 위에 존해해야한다.

@SpringBootApplication
public class Application {

    public static void main(String[] args) {
        SpringApplication.run(Application.class);
    }

}
