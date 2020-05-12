package com.cerebrumweaver.client;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

/**
 * @作者 cerebrumWeaver
 * @日期 2020/5/10 14:14
 */
@Service
public class ClientService {
    @Autowired
    private RestTemplate restTemplate;
    public String hiService(){
        return restTemplate.getForObject("http://SPRINGCLOUD-GATEWAY-PREDICATE/hi",String.class);
    }
}
