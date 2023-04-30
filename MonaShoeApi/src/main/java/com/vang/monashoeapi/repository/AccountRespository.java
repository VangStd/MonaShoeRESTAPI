/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package com.vang.monashoeapi.repository;

import com.vang.monashoeapi.entities.Accounts;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

/**
 *
 * @author kyqua
 */
public interface AccountRespository extends JpaRepository<Accounts, Integer> {

    @Query(value = "select * from Accounts where Username = ?1", nativeQuery = true)
    Accounts loadByUsername(String username);
}
