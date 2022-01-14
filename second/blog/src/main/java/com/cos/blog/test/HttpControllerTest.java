package com.cos.blog.test;

import org.springframework.web.bind.annotation.*;

@RestController
public class HttpControllerTest {

    @GetMapping("/http/get")
    public String getTest(Member m) {
        return "get " + m.getId() + m.getUsername();
    }
    @PostMapping("/http/post")
    public String postTest() {
        return "post";
    }
    @PutMapping("/http/put")
    public String putTest() {
        return "put";
    }
    @DeleteMapping("/http/delete")
    public String deleteTest() {
        return "delete";
    }
}
