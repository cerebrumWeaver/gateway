package com.cerebrumweaver.client;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @作者 cerebrumWeaver
 * @日期 2020/5/10 14:17
 */
@RestController
public class ClientController {
    @Autowired
    private ClientService clientService;
    @GetMapping("hi")
    private String hi(){
        return clientService.hiService();
    }
}
