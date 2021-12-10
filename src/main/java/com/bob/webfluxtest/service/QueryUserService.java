package com.bob.webfluxtest.service;

import com.bob.webfluxtest.entity.User;
import java.util.List;
import reactor.core.publisher.Mono;

public interface QueryUserService {
    List<User> queryAll();
    Mono<List<User>> queryAllAsync();
}
