package com.myblog.payload;

import lombok.Data;

@Data
public class PostDto {
    private long id;
    private String name;
    private int age;
}
