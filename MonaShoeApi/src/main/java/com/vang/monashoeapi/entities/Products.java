/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.vang.monashoeapi.entities;

import jakarta.persistence.Basic;
import jakarta.persistence.CascadeType;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.OneToMany;
import jakarta.persistence.Table;
import java.io.Serializable;
import java.util.List;

/**
 *
 * @author kyqua
 */
@Entity
@Table(name = "Products")
public class Products implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "ProductID")
    private Integer productID;
    @Basic(optional = false)
    @Column(name = "ProductName")
    private String productName;
    @Basic(optional = false)
    @Column(name = "Description")
    private String description;
    // @Max(value=?)  @Min(value=?)//if you know range of your decimal fields consider using these annotations to enforce field validation
    @Basic(optional = false)
    @Column(name = "UnitPrice")
    private double unitPrice;
    @Column(name = "Image")
    private String image;
    @Basic(optional = false)
    @Column(name = "Quantity")
    private int quantity;
    @Basic(optional = false)
    @Column(name = "PromotionStatus")
    private int promotionStatus;
    @Basic(optional = false)
    @Column(name = "Status")
    private int status;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "products")
    private List<FeedbackDetails> feedbackDetailsList;
    @JoinColumn(name = "BrandID", referencedColumnName = "BrandID")
    @ManyToOne(optional = false)
    private Brands brandID;
    @JoinColumn(name = "CategoryID", referencedColumnName = "CategoryID")
    @ManyToOne(optional = false)
    private Categories categoryID;
    @JoinColumn(name = "SupplierID", referencedColumnName = "SupplierID")
    @ManyToOne(optional = false)
    private Suppliers supplierID;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "productID")
    private List<Promotions> promotionsList;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "products")
    private List<OrderDetails> orderDetailsList;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "productID")
    private List<Feedbacks> feedbacksList;

    public Products() {
    }

    public Products(Integer productID) {
        this.productID = productID;
    }

    public Products(Integer productID, String productName, String description, double unitPrice, int quantity, int promotionStatus, int status) {
        this.productID = productID;
        this.productName = productName;
        this.description = description;
        this.unitPrice = unitPrice;
        this.quantity = quantity;
        this.promotionStatus = promotionStatus;
        this.status = status;
    }

    public Integer getProductID() {
        return productID;
    }

    public void setProductID(Integer productID) {
        this.productID = productID;
    }

    public String getProductName() {
        return productName;
    }

    public void setProductName(String productName) {
        this.productName = productName;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public double getUnitPrice() {
        return unitPrice;
    }

    public void setUnitPrice(double unitPrice) {
        this.unitPrice = unitPrice;
    }

    public String getImage() {
        return image;
    }

    public void setImage(String image) {
        this.image = image;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    public int getPromotionStatus() {
        return promotionStatus;
    }

    public void setPromotionStatus(int promotionStatus) {
        this.promotionStatus = promotionStatus;
    }

    public int getStatus() {
        return status;
    }

    public void setStatus(int status) {
        this.status = status;
    }

    public List<FeedbackDetails> getFeedbackDetailsList() {
        return feedbackDetailsList;
    }

    public void setFeedbackDetailsList(List<FeedbackDetails> feedbackDetailsList) {
        this.feedbackDetailsList = feedbackDetailsList;
    }

    public Brands getBrandID() {
        return brandID;
    }

    public void setBrandID(Brands brandID) {
        this.brandID = brandID;
    }

    public Categories getCategoryID() {
        return categoryID;
    }

    public void setCategoryID(Categories categoryID) {
        this.categoryID = categoryID;
    }

    public Suppliers getSupplierID() {
        return supplierID;
    }

    public void setSupplierID(Suppliers supplierID) {
        this.supplierID = supplierID;
    }

    public List<Promotions> getPromotionsList() {
        return promotionsList;
    }

    public void setPromotionsList(List<Promotions> promotionsList) {
        this.promotionsList = promotionsList;
    }

    public List<OrderDetails> getOrderDetailsList() {
        return orderDetailsList;
    }

    public void setOrderDetailsList(List<OrderDetails> orderDetailsList) {
        this.orderDetailsList = orderDetailsList;
    }

    public List<Feedbacks> getFeedbacksList() {
        return feedbacksList;
    }

    public void setFeedbacksList(List<Feedbacks> feedbacksList) {
        this.feedbacksList = feedbacksList;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (productID != null ? productID.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Products)) {
            return false;
        }
        Products other = (Products) object;
        if ((this.productID == null && other.productID != null) || (this.productID != null && !this.productID.equals(other.productID))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.vang.monashoeapi.entities.Products[ productID=" + productID + " ]";
    }

}
