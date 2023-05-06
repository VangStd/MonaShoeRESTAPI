/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package com.vang.monashoeapi.service;

import com.vang.monashoeapi.entities.AccountConfig;
import com.vang.monashoeapi.entities.Accounts;
import java.util.List;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestBody;

/**
 *
 * @author kyqua
 */
public interface AccountConfigService {

    ResponseEntity<List<AccountConfig>> getAccountConfig();

    ResponseEntity<AccountConfig> getAccount(int id);

    ResponseEntity<Accounts> addAccount(Accounts accounts);

    ResponseEntity<Accounts> editAccount(Accounts accounts);

    ResponseEntity<Accounts> deleteAccount(int id);

    ResponseEntity<AccountConfig> addAccountConfig(AccountConfig account);

    ResponseEntity<AccountConfig> editAccountConfig(AccountConfig account);

    ResponseEntity<Long> checkExistUsername(String username);

    ResponseEntity<Long> checkExistEmail(String email);
}
