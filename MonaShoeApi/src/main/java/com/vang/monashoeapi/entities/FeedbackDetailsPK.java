/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.vang.monashoeapi.entities;

import jakarta.persistence.Basic;
import jakarta.persistence.Column;
import jakarta.persistence.Embeddable;
import java.io.Serializable;

/**
 *
 * @author kyqua
 */
@Embeddable
public class FeedbackDetailsPK implements Serializable {

    @Basic(optional = false)
    @Column(name = "FeedbackID")
    private int feedbackID;
    @Basic(optional = false)
    @Column(name = "ProductID")
    private int productID;

    public FeedbackDetailsPK() {
    }

    public FeedbackDetailsPK(int feedbackID, int productID) {
        this.feedbackID = feedbackID;
        this.productID = productID;
    }

    public int getFeedbackID() {
        return feedbackID;
    }

    public void setFeedbackID(int feedbackID) {
        this.feedbackID = feedbackID;
    }

    public int getProductID() {
        return productID;
    }

    public void setProductID(int productID) {
        this.productID = productID;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (int) feedbackID;
        hash += (int) productID;
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof FeedbackDetailsPK)) {
            return false;
        }
        FeedbackDetailsPK other = (FeedbackDetailsPK) object;
        if (this.feedbackID != other.feedbackID) {
            return false;
        }
        if (this.productID != other.productID) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.vang.monashoeapi.entities.FeedbackDetailsPK[ feedbackID=" + feedbackID + ", productID=" + productID + " ]";
    }
    
}
