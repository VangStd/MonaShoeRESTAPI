/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package com.vang.monashoeapi.service;

import com.vang.monashoeapi.entities.Categories;
import java.util.List;
import org.springframework.http.ResponseEntity;

/**
 *
 * @author kyqua
 */
public interface CategoryService {

    ResponseEntity<List<Categories>> getCategoies();

    ResponseEntity<Categories> getCategory(int id);

    ResponseEntity<Categories> addCategory(Categories categories);

    ResponseEntity<Categories> editCategory(Categories categories);

    ResponseEntity<Categories> deleteCategory(int id);
}
