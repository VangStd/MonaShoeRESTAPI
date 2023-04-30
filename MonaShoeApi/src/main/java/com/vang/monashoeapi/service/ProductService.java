/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package com.vang.monashoeapi.service;

import com.vang.monashoeapi.entities.Products;
import java.util.List;
import org.springframework.http.ResponseEntity;

/**
 *
 * @author kyqua
 */
public interface ProductService {

    ResponseEntity<List<Products>> getProducts();

    ResponseEntity<Products> getProduct(int id);

    ResponseEntity<Products> addProduct(Products products);

    ResponseEntity<Products> editProduct(Products products);

    ResponseEntity<Products> deleteProduct(int id);
}
