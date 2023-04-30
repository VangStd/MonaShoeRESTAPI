/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.vang.monashoeapi.api.admin;

import com.vang.monashoeapi.entities.Suppliers;
import com.vang.monashoeapi.service.SupplierService;
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
public class SupplierAPI {

    @Autowired
    private SupplierService supplierService;

    @GetMapping("supplier/")
    public ResponseEntity<List<Suppliers>> getSuppliers() {
        return supplierService.getSuppliers();
    }

    @GetMapping("supplier/{id}/")
    public ResponseEntity<Suppliers> getSupplier(@PathVariable("id") int id) {
        return supplierService.getSupplier(id);
    }

    @PostMapping("supplier/")
    public ResponseEntity<Suppliers> addSupplier(@RequestBody Suppliers suppliers) {
        return supplierService.addSupplier(suppliers);
    }

    @PutMapping("supplier/")
    public ResponseEntity<Suppliers> editSupplier(@RequestBody Suppliers suppliers) {
        return supplierService.editSupplier(suppliers);
    }

    @DeleteMapping("supplier/{id}/")
    public ResponseEntity<Suppliers> deleteSupplier(@PathVariable("id") int id) {
        return supplierService.deleteSupplier(id);
    }
}
