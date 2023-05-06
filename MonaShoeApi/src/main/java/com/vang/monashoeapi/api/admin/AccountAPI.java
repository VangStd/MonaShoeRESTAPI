/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.vang.monashoeapi.api.admin;

import com.vang.monashoeapi.entities.AccountConfig;
import com.vang.monashoeapi.entities.Accounts;
import com.vang.monashoeapi.service.AccountConfigService;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 *
 * @author kyqua
 */
@RestController
@RequestMapping("/api/administrator/employee/")
public class AccountAPI {

    @Autowired
    private AccountConfigService accountConfigService;

    @GetMapping("account/")
    public ResponseEntity<List<AccountConfig>> getAccounts() {
        return accountConfigService.getAccountConfig();
    }

    @GetMapping("account/{id}/")
    public ResponseEntity<AccountConfig> getAccountConfig(@PathVariable("id") int id) {
        return accountConfigService.getAccount(id);
    }

    @PostMapping("account/")
    public ResponseEntity<Accounts> addAccount(@RequestBody Accounts accounts) {
        return accountConfigService.addAccount(accounts);
    }

    @PostMapping("account-config/")
    public ResponseEntity<AccountConfig> addAccount(@RequestBody AccountConfig accountConfig) {
        return accountConfigService.addAccountConfig(accountConfig);
    }

    @PutMapping("account-config/")
    public ResponseEntity<AccountConfig> editAccount(@RequestBody AccountConfig accounts) {
        return accountConfigService.editAccountConfig(accounts);
    }

    @PutMapping("account/")
    public ResponseEntity<Accounts> editAccount(@RequestBody Accounts accounts) {
        return accountConfigService.editAccount(accounts);
    }

    @GetMapping("account/username/{username}/")
    public ResponseEntity<Long> checkExistUsername(@PathVariable("username") String username) {
        return accountConfigService.checkExistUsername(username);
    }

    @GetMapping("account/email/{email}/")
    public ResponseEntity<Long> checkExistEmail(@PathVariable("email") String email) {
        return accountConfigService.checkExistEmail(email);
    }

}
