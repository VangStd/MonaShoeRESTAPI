/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.vang.monashoeapi.service.impl;

import com.vang.monashoeapi.entities.Brands;
import com.vang.monashoeapi.repository.BrandRepository;
import com.vang.monashoeapi.service.BrandService;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

@Service
public class BrandServiceimpl implements BrandService {

    @Autowired
    private BrandRepository brandRepository;

    @Override
    public ResponseEntity<List<Brands>> homeBrand() {
        return new ResponseEntity<>(brandRepository.findAll(), HttpStatus.OK);
    }

    @Override
    public ResponseEntity<Brands> getBrand(int id) {
        Brands brands = brandRepository.findById(id).get();
        return new ResponseEntity<>(brands, HttpStatus.OK);
    }

    @Override
    public ResponseEntity<Brands> addBrand(Brands brands) {
        brandRepository.save(brands);
        return new ResponseEntity<>(brands, HttpStatus.OK);
    }

    @Override
    public ResponseEntity<Brands> editBrand(Brands brands) {
        brandRepository.save(brands);
        return new ResponseEntity<>(brands, HttpStatus.OK);
    }

    @Override
    public ResponseEntity<Brands> removeBrand(int id) {
        Brands brands = brandRepository.findById(id).get();
        brandRepository.delete(brands);
        return new ResponseEntity<>(brands, HttpStatus.OK);
    }

}
