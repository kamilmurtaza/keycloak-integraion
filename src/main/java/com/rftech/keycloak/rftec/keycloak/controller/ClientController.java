package com.rftech.keycloak.rftec.keycloak.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/v1/secure")
public class ClientController {

    @GetMapping("/message")
    public String getMessage() {
        return "Secorty Working!";
    }
}
