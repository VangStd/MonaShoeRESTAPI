/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.vang.monashoeapi.api.admin;

import com.vang.monashoeapi.entities.Categories;
import com.vang.monashoeapi.service.CategoryService;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
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
public class CategoryAPI {

    @Autowired
    private CategoryService categoryService;

    @GetMapping("category/")
    public ResponseEntity<List<Categories>> getCategories() {
        return categoryService.getCategoies();
    }

    @GetMapping("/category/{id}/")
    public ResponseEntity<Categories> getCategory(@PathVariable("id") int id) {
        return categoryService.getCategory(id);
    }

    @PostMapping("/category/")
    public ResponseEntity<Categories> addCategory(@RequestBody Categories categories) {
        return categoryService.addCategory(categories);
    }

    @PutMapping("/category/")
    public ResponseEntity<Categories> editCategory(@RequestBody Categories categories) {
        return categoryService.editCategory(categories);
    }

    @DeleteMapping("/category/{id}/")
    public ResponseEntity<Categories> deleteCategory(@PathVariable("id") int id) {
        return categoryService.deleteCategory(id);
    }
    

}
