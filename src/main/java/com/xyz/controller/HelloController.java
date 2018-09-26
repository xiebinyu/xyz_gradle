package com.xyz.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {

  @RequestMapping("hello")
  public String sayHello(@RequestParam(value = "name") String name) {
    return "你好！" + name;
  }
}
