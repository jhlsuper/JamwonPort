package com.Jamwonport.controller;

import com.Jamwonport.request.PostCreate;
import lombok.extern.slf4j.Slf4j;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.*;

import java.util.Map;

@Slf4j
@RestController
public class PostController {

    //http method -> GET POST PUT PATCH DELETE OPTIONS HEAD TRACE CONNECT
    //글 등록 : POST
    @PostMapping("/posts")
//    public String post(@RequestParam String title, @RequestParam String content){
public String post(@RequestBody PostCreate params){

//        log.info("title={}, content={}", title, content);
        log.info("params ={}",params.toString());
        return "Hello World";

    }

}
