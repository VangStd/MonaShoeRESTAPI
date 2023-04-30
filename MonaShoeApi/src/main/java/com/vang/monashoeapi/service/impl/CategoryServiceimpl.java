/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.vang.monashoeapi.service.impl;

import com.vang.monashoeapi.entities.Categories;
import com.vang.monashoeapi.repository.CategoryRepository;
import com.vang.monashoeapi.service.CategoryService;
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
public class CategoryServiceimpl implements CategoryService {

    @Autowired
    private CategoryRepository categoryRepository;

    @Override
    public ResponseEntity<List<Categories>> getCategoies() {
        return new ResponseEntity<>(categoryRepository.findAll(), HttpStatus.OK);
    }

    @Override
    public ResponseEntity<Categories> getCategory(int id) {
        Categories categories = categoryRepository.findById(id).get();
        return new ResponseEntity<>(categories, HttpStatus.OK);
    }

    @Override
    public ResponseEntity<Categories> addCategory(Categories categories) {
        categoryRepository.save(categories);
        return new ResponseEntity<>(categories, HttpStatus.OK);
    }

    @Override
    public ResponseEntity<Categories> editCategory(Categories categories) {
        categoryRepository.save(categories);
        return new ResponseEntity<>(categories, HttpStatus.OK);
    }

    @Override
    public ResponseEntity<Categories> deleteCategory(int id) {
        Categories categories = categoryRepository.findById(id).get();
        categoryRepository.delete(categories);
        return new ResponseEntity<>(categories, HttpStatus.OK);
    }

}
