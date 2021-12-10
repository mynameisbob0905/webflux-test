package com.bob.webfluxtest.entity;

import lombok.AllArgsConstructor;
import lombok.Data;

/**
 * @author tianbo.bai
 * @version 1.0
 * @description: TODO
 * @date 2021/12/9 14:14
 */
@Data
@AllArgsConstructor
public class User {

    private Long id;
    private String name;
}
