/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.vang.monashoeapi.service.impl;

import com.vang.monashoeapi.entities.Accounts;
import com.vang.monashoeapi.repository.AccountRespository;
import com.vang.monashoeapi.service.SecurityService;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

/**
 *
 * @author kyqua
 */
@Service
public class SecurityServiceimpl implements SecurityService {

    @Autowired
    private AccountRespository accountRespository;

    @Override
    public ResponseEntity<Accounts> authenticate(Accounts accounts) {
        return new ResponseEntity<>(accountRespository.loadByUsername(accounts.getUsername()), HttpStatus.OK);
    }

    @Override
    public ResponseEntity<List<Accounts>> accounts() {
        return new ResponseEntity<>(accountRespository.findAll(),HttpStatus.OK);
    }

}
