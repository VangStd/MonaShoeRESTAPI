/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.vang.monashoeapi.api;

import com.vang.monashoeapi.service.BrandService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 *
 * @author kyqua
 */
@RestController
@RequestMapping("/api/")
public class HomeAPI {

    @Autowired
    private BrandService brandService;

    @GetMapping("home/")
    public ResponseEntity<String> home() {
        return new ResponseEntity<>("Hello", HttpStatus.OK);
    }

}
