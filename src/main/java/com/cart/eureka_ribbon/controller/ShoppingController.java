package com.cart.eureka_ribbon.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

@RestController
public class ShoppingController {
    @Autowired
    RestTemplate restTemplate;
    
    @RequestMapping(value = "/shopping", method = RequestMethod.GET)
    public String add(@RequestParam String code,@RequestParam Integer num) {
        return restTemplate.getForEntity("http://SHOPPING-SERVICE/shopping?code="+code+"&num="+num, String.class).getBody();
    }
}
