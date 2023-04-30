/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.vang.monashoeapi.entities;

import com.fasterxml.jackson.annotation.JsonBackReference;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import jakarta.persistence.Basic;
import jakarta.persistence.CascadeType;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;
import jakarta.persistence.Table;
import java.io.Serializable;
import java.util.List;
import lombok.Data;
import org.hibernate.annotations.Fetch;
import org.hibernate.annotations.FetchMode;

/**
 *
 * @author kyqua
 */
@Entity
@Table(name = "Brands")
@Data
public class Brands implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "BrandID")
    private Integer brandID;
    @Basic(optional = false)
    @Column(name = "BrandName")
    private String brandName;
    @Basic(optional = false)
    @Column(name = "Description")
    private String description;
    @Column(name = "Website")
    private String website;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "brandID",fetch = FetchType.EAGER)
    @JsonIgnore
    private List<Products> productsList;

    public Brands() {
    }

    public Brands(Integer brandID) {
        this.brandID = brandID;
    }

    public Brands(Integer brandID, String brandName, String description) {
        this.brandID = brandID;
        this.brandName = brandName;
        this.description = description;
    }

    @Override
    public String toString() {
        return "com.vang.monashoeapi.entities.Brands[ brandID=" + brandID + " ]";
    }


}
