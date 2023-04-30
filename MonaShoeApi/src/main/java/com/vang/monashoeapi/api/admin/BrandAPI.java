/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.vang.monashoeapi.api.admin;

import com.vang.monashoeapi.entities.Brands;
import com.vang.monashoeapi.service.BrandService;
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

@RestController
@RequestMapping("/api/administrator/employee/")
public class BrandAPI {

    @Autowired
    private BrandService brandService;

    @GetMapping("brand/")
    public ResponseEntity<List<Brands>> getBrands() {
        return brandService.homeBrand();
    }

    @GetMapping("brand/{id}/")
    public ResponseEntity<Brands> getBrand(@PathVariable("id") int id) {
        return brandService.getBrand(id);
    }

    @PostMapping("/brand/")
    public ResponseEntity<Brands> addBrand(@RequestBody Brands brands) {
        return brandService.addBrand(brands);
    }
    
        @PutMapping("brand/")
    public ResponseEntity<Brands> edit(@RequestBody Brands dto) {
        return brandService.editBrand(dto);
    }

    @DeleteMapping("brand/{id}/")
    public ResponseEntity<Brands> deleteBrand(@PathVariable("id") int id) {
        return brandService.removeBrand(id);
    }
}
