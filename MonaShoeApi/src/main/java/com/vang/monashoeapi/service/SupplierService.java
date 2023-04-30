/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package com.vang.monashoeapi.service;

import com.vang.monashoeapi.entities.Suppliers;
import java.util.List;
import org.springframework.http.ResponseEntity;

/**
 *
 * @author kyqua
 */
public interface SupplierService {

    ResponseEntity<List<Suppliers>> getSuppliers();

    ResponseEntity<Suppliers> getSupplier(int id);

    ResponseEntity<Suppliers> addSupplier(Suppliers suppliers);

    ResponseEntity<Suppliers> editSupplier(Suppliers suppliers);

    ResponseEntity<Suppliers> deleteSupplier(int id);
}
