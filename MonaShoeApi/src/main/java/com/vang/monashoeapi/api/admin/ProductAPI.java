/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.vang.monashoeapi.api.admin;

import com.vang.monashoeapi.entities.Products;
import com.vang.monashoeapi.service.ProductService;
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
public class ProductAPI {

    @Autowired
    private ProductService productService;

    @GetMapping("product/")
    public ResponseEntity<List<Products>> getProducts() {
        return productService.getProducts();
    }

    @GetMapping("product/{id}/")
    public ResponseEntity<Products> getProduct(@PathVariable("id") int id) {
        return productService.getProduct(id);
    }

    @PostMapping("product/")
    public ResponseEntity<Products> addProduct(@RequestBody Products products) {
        return productService.addProduct(products);
    }

    @PutMapping("product/")
    public ResponseEntity<Products> editProduct(@RequestBody Products products) {
        return productService.editProduct(products);
    }

    @DeleteMapping("product/{id}/")
    public ResponseEntity<Products> deleteProduct(@PathVariable("id") int id) {
        return productService.deleteProduct(id);
    }
}
