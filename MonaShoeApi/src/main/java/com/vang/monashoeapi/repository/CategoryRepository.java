/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package com.vang.monashoeapi.repository;

import com.vang.monashoeapi.entities.Categories;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 *
 * @author kyqua
 */
public interface CategoryRepository extends JpaRepository<Categories, Integer> {
    
}
