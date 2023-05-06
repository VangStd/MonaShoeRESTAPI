/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.vang.monashoeapi.service.impl;

import com.vang.monashoeapi.service.AccountConfigService;
import com.vang.monashoeapi.entities.AccountConfig;
import com.vang.monashoeapi.entities.Accounts;
import com.vang.monashoeapi.repository.AccountConfigRepository;
import com.vang.monashoeapi.repository.AccountRespository;
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
public class AccountConfigServiceimpl implements AccountConfigService {

    @Autowired
    private AccountConfigRepository accountConfigRepository;

    @Autowired
    private AccountRespository accountRespository;

    @Override
    public ResponseEntity<List<AccountConfig>> getAccountConfig() {
        return new ResponseEntity<>(accountConfigRepository.findAll(), HttpStatus.OK);
    }

    @Override
    public ResponseEntity<AccountConfig> getAccount(int id) {
        return new ResponseEntity<>(accountConfigRepository.findById(id).get(), HttpStatus.OK);
    }

    @Override
    public ResponseEntity<AccountConfig> addAccountConfig(AccountConfig account) {
        accountConfigRepository.save(account);
        return new ResponseEntity<>(account, HttpStatus.OK);
    }

    @Override
    public ResponseEntity<AccountConfig> editAccountConfig(AccountConfig account) {
        accountConfigRepository.save(account);
        return new ResponseEntity<>(account, HttpStatus.OK);
    }

    @Override
    public ResponseEntity<Accounts> addAccount(Accounts accounts) {
        accountRespository.save(accounts);
        return new ResponseEntity<>(accounts, HttpStatus.OK);
    }

    @Override
    public ResponseEntity<Accounts> editAccount(Accounts accounts) {
        accountRespository.save(accounts);
        return new ResponseEntity<>(accounts, HttpStatus.OK);
    }

    @Override
    public ResponseEntity<Accounts> deleteAccount(int id) {
        Accounts accounts = accountRespository.findById(id).get();
        accountRespository.delete(accounts);
        return new ResponseEntity<>(accounts, HttpStatus.OK);
    }

    @Override
    public ResponseEntity<Long> checkExistUsername(String username) {
        return new ResponseEntity<>(accountRespository.getCountByUsername(username), HttpStatus.OK);
    }

    @Override
    public ResponseEntity<Long> checkExistEmail(String email) {
        return new ResponseEntity<>(accountRespository.getCountByEmail(email), HttpStatus.OK);
    }

}
