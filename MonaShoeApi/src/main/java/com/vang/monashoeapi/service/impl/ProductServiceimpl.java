/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.vang.monashoeapi.service.impl;

import com.vang.monashoeapi.entities.Products;
import com.vang.monashoeapi.repository.ProductRepository;
import com.vang.monashoeapi.service.ProductService;
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
public class ProductServiceimpl implements ProductService {

    @Autowired
    private ProductRepository productRepository;

    @Override
    public ResponseEntity<List<Products>> getProducts() {
        return new ResponseEntity<>(productRepository.findAll(), HttpStatus.OK);
    }

    @Override
    public ResponseEntity<Products> getProduct(int id) {
        Products products = productRepository.findById(id).get();
        return new ResponseEntity<>(products, HttpStatus.OK);
    }

    @Override
    public ResponseEntity<Products> addProduct(Products products) {
        productRepository.save(products);
        return new ResponseEntity<>(products, HttpStatus.OK);
    }

    @Override
    public ResponseEntity<Products> editProduct(Products products) {
        productRepository.save(products);
        return new ResponseEntity<>(products, HttpStatus.OK);
    }

    @Override
    public ResponseEntity<Products> deleteProduct(int id) {
        Products products = productRepository.findById(id).get();
        System.out.println("--->" + products.getProductName());
        productRepository.deleteByIdRemake(id);
        return new ResponseEntity<>(products, HttpStatus.OK);
    }

}
