/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package com.vang.monashoeapi.service;

import com.vang.monashoeapi.entities.Brands;
import java.util.List;
import org.springframework.http.ResponseEntity;

/**
 *
 * @author kyqua
 */
public interface BrandService {

    ResponseEntity<List<Brands>> homeBrand();

    ResponseEntity<Brands> getBrand(int id);

    ResponseEntity<Brands> addBrand(Brands dto);

    ResponseEntity<Brands> editBrand(Brands dto);

    ResponseEntity<Brands> removeBrand(int id);
}
