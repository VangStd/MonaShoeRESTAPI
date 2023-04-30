/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package com.vang.monashoeapi.service;

import com.vang.monashoeapi.entities.Accounts;
import java.util.List;
import org.springframework.http.ResponseEntity;

/**
 *
 * @author kyqua
 */
public interface SecurityService {

    ResponseEntity<Accounts> authenticate(Accounts accounts);
    
    ResponseEntity<List<Accounts>> accounts();
}
