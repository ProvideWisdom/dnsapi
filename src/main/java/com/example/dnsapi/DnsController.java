package com.example.dnsapi;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import java.util.concurrent.locks.ReentrantLock;

@RestController
@RequestMapping(value = "get/")
public class DnsController {

    @GetMapping(value = "ip")
    public Object getIp(){
        String getUrl = "https://api.ipify.org/?format=jsonp&callback=?";
        RestTemplate template = new RestTemplate();
       return template.getForEntity(getUrl,Object.class);
    }
}
