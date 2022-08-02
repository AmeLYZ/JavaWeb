package com.example.demo.dao;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;
/**
 * 一个简单的dto实体类
 */
@AllArgsConstructor
@Getter
@Setter
public class User {
    private final String name;
    private final String password;
    
  }