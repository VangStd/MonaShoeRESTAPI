/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.vang.monashoeapi.entities;

import jakarta.persistence.Basic;
import jakarta.persistence.CascadeType;
import jakarta.persistence.Column;
import jakarta.persistence.EmbeddedId;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.OneToMany;
import jakarta.persistence.Table;
import java.io.Serializable;
import java.sql.Date;
import java.util.List;

/**
 *
 * @author kyqua
 */
@Entity
@Table(name = "Promotions")
public class Promotions implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "PromotionID")
    private Integer promotionID;
    @Basic(optional = false)
    @Column(name = "PromotionName")
    private String promotionName;
    @Basic(optional = false)
    @Column(name = "PromotionDate")
    private Date promotionDate;
    @Basic(optional = false)
    @Column(name = "Discount")
    private int discount;
    // @Max(value=?)  @Min(value=?)//if you know range of your decimal fields consider using these annotations to enforce field validation
    @Basic(optional = false)
    @Column(name = "AmountApplyPromotion")
    private double amountApplyPromotion;
    @Column(name = "Note")
    private String note;
    @JoinColumn(name = "ProductID", referencedColumnName = "ProductID")
    @ManyToOne(optional = false)
    private Products productID;

    public Promotions() {
    }

    public Promotions(Integer promotionID) {
        this.promotionID = promotionID;
    }

    public Promotions(Integer promotionID, String promotionName, Date promotionDate, int discount, double amountApplyPromotion) {
        this.promotionID = promotionID;
        this.promotionName = promotionName;
        this.promotionDate = promotionDate;
        this.discount = discount;
        this.amountApplyPromotion = amountApplyPromotion;
    }

    public Integer getPromotionID() {
        return promotionID;
    }

    public void setPromotionID(Integer promotionID) {
        this.promotionID = promotionID;
    }

    public String getPromotionName() {
        return promotionName;
    }

    public void setPromotionName(String promotionName) {
        this.promotionName = promotionName;
    }

    public Date getPromotionDate() {
        return promotionDate;
    }

    public void setPromotionDate(Date promotionDate) {
        this.promotionDate = promotionDate;
    }

    public int getDiscount() {
        return discount;
    }

    public void setDiscount(int discount) {
        this.discount = discount;
    }

    public double getAmountApplyPromotion() {
        return amountApplyPromotion;
    }

    public void setAmountApplyPromotion(double amountApplyPromotion) {
        this.amountApplyPromotion = amountApplyPromotion;
    }

    public String getNote() {
        return note;
    }

    public void setNote(String note) {
        this.note = note;
    }

    public Products getProductID() {
        return productID;
    }

    public void setProductID(Products productID) {
        this.productID = productID;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (promotionID != null ? promotionID.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Promotions)) {
            return false;
        }
        Promotions other = (Promotions) object;
        if ((this.promotionID == null && other.promotionID != null) || (this.promotionID != null && !this.promotionID.equals(other.promotionID))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.vang.monashoeapi.entities.Promotions[ promotionID=" + promotionID + " ]";
    }
    
}
