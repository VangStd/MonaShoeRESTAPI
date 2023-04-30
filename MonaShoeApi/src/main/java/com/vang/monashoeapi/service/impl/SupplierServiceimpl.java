/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.vang.monashoeapi.service.impl;

import com.vang.monashoeapi.entities.Suppliers;
import com.vang.monashoeapi.repository.SupplierRepository;
import com.vang.monashoeapi.service.SupplierService;
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
public class SupplierServiceimpl implements SupplierService {

    @Autowired
    private SupplierRepository supplierRepository;

    @Override
    public ResponseEntity<List<Suppliers>> getSuppliers() {
        return new ResponseEntity<>(supplierRepository.findAll(), HttpStatus.OK);
    }

    @Override
    public ResponseEntity<Suppliers> getSupplier(int id) {
        return new ResponseEntity<>(supplierRepository.findById(id).get(), HttpStatus.OK);
    }

    @Override
    public ResponseEntity<Suppliers> addSupplier(Suppliers suppliers) {
        supplierRepository.save(suppliers);
        return new ResponseEntity<>(suppliers, HttpStatus.OK);
    }

    @Override
    public ResponseEntity<Suppliers> editSupplier(Suppliers suppliers) {
        supplierRepository.save(suppliers);
        return new ResponseEntity<>(suppliers, HttpStatus.OK);
    }

    @Override
    public ResponseEntity<Suppliers> deleteSupplier(int id) {
        Suppliers suppliers = supplierRepository.findById(id).get();
        supplierRepository.delete(suppliers);
        return new ResponseEntity<>(suppliers, HttpStatus.OK);
    }

}
