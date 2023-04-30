/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.vang.monashoeapi.api;

import com.vang.monashoeapi.entities.Accounts;
import com.vang.monashoeapi.service.SecurityService;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

/**
 *
 * @author kyqua
 */
@RestController
public class SecurityAPI {

    @Autowired
    private SecurityService securityService;

    @PostMapping("/api/login/")
    public ResponseEntity<Accounts> authenticate(@RequestBody Accounts accounts) {
        return securityService.authenticate(accounts);
    }

    @GetMapping("/api/account/")
    public ResponseEntity<List<Accounts>> accounts() {
        return securityService.accounts();
    }

}
