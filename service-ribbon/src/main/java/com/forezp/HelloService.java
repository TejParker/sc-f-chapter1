package com.forezp;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import com.netflix.hystrix.contrib.javanica.annotation.HystrixCommand;

@Service
public class HelloService {

    @Autowired
    RestTemplate restTemplate;

    @HystrixCommand(fallbackMethod = "hiError")
    public String hiService(String name) {
        String url = "http://SERVICE-HI/hi?name=" + name;
        System.out.println("************url=" + url);
        return restTemplate.getForObject(url, String.class);
    }

    public String hiError(String name) {
        return "hi," + name + ",sorry,error!";
    }

}