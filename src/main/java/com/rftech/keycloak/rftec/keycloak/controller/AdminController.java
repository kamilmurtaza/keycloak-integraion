package com.rftech.keycloak.rftec.keycloak.controller;

import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.security.core.annotation.AuthenticationPrincipal;
import org.springframework.security.oauth2.jwt.Jwt;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Map;

@RestController
@RequestMapping("/api/v1/admin")
public class AdminController {

    @PreAuthorize("hasRole('Administrator')")
    @GetMapping("/view")
    public String getMessage(@AuthenticationPrincipal Jwt jwt) {
        return "Welcome admin " + jwt.getClaimAsString("preferred_username") + "!";
    }
}
