package com.bob.webfluxtest.service;

import com.bob.webfluxtest.entity.User;
import com.google.common.collect.Lists;
import java.time.Duration;
import java.util.List;
import java.util.concurrent.TimeUnit;
import org.springframework.stereotype.Service;
import reactor.core.publisher.Mono;

/**
 * @author tianbo.bai
 * @version 1.0
 * @description: TODO
 * @date 2021/12/9 14:19
 */
@Service
public class QueryUserServiceImpl implements QueryUserService{

    //IO耗时时间
    private static final long ioTime = 3L;

    private static final List<User> allUsers = Lists.newArrayList(new User(1L,"张三"),new User(2L,"李四"),new User(3L,"王五"),new User(4L,"钱六"));

    @Override
    public List<User> queryAll() {
        //模拟IO耗时
        try {
            TimeUnit.SECONDS.sleep(ioTime);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        return allUsers;
    }

    @Override
    public Mono<List<User>> queryAllAsync() {
        //模拟耗时 Duration.ofSeconds(ioTime)
        return Mono.just(allUsers).delayElement(Duration.ofSeconds(ioTime));
    }
}
