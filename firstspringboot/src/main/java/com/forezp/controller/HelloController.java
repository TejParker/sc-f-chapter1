package com.forezp.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
// 等同于同时加上了@Controller和@ResponseBody
public class HelloController {

    public HelloController() {
        System.out.println("**************HelloController invoked!!!");
    }

    // 访问/hello或者/hi任何一个地址，都会返回一样的结果
    @RequestMapping(value = { "/hello", "/hi" }, method = RequestMethod.GET)
    public String say() {
        String content = "hi you!!!";
        System.out.println("****************content=" + content);
        return content;
    }

    @RequestMapping("/sayHello")
    public String sayHello(@RequestParam(defaultValue = "Lee") String name) {
        String text = "hi," + name + ",welcome!";
        System.out.println("***************************text=" + text);
        return text;
    }
}