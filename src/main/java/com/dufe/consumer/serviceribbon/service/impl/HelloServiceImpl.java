package com.dufe.consumer.serviceribbon.service.impl;

import com.dufe.consumer.serviceribbon.service.IHelloService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

@Service
public class HelloServiceImpl implements IHelloService {
    @Autowired
    RestTemplate restTemplate;

    @Override
    public String hiService(String name) {
        return restTemplate.getForObject("http://SERVICE-HI/v1/hi?name="+name,String.class);
    }
}
