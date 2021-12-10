package com.bob.webfluxtest.controller;

import com.bob.webfluxtest.entity.User;
import com.bob.webfluxtest.service.QueryUserService;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import reactor.core.publisher.Mono;

/**
 * @author tianbo.bai
 * @version 1.0
 * @description: 用户API
 * @date 2021/12/9 14:11
 */
@RestController
public class UserController {

    @Autowired
    private QueryUserService queryUserService;

    //servlet
    @GetMapping("users/sync")
    public List<User> queryAllUser(){
        return queryUserService.queryAll();
    }

    //webflux
    @GetMapping("users/async")
    public Mono<List<User>> queryAllUserAsync(){
        return queryUserService.queryAllAsync();
    }
}
