/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package com.vang.monashoeapi.repository;

import com.vang.monashoeapi.entities.Products;
import jakarta.transaction.Transactional;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;

/**
 *
 * @author kyqua
 */
public interface ProductRepository extends JpaRepository<Products, Integer> {

    @Transactional
    @Modifying
    @Query(value = "delete from Products where ProductID = ?1", nativeQuery = true)
    void deleteByIdRemake(int id);
}
