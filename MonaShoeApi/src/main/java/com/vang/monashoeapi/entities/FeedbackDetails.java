/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.vang.monashoeapi.entities;

import jakarta.persistence.Column;
import jakarta.persistence.EmbeddedId;
import jakarta.persistence.Entity;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;
import java.io.Serializable;

/**
 *
 * @author kyqua
 */
@Entity
@Table(name = "FeedbackDetails")
public class FeedbackDetails implements Serializable {

    private static final long serialVersionUID = 1L;
    @EmbeddedId
    protected FeedbackDetailsPK feedbackDetailsPK;
    @Column(name = "FeedbackContent")
    private String feedbackContent;
    @Column(name = "Reviews")
    private String reviews;
    @JoinColumn(name = "FeedbackID", referencedColumnName = "FeedbackID", insertable = false, updatable = false)
    @ManyToOne(optional = false)
    private Feedbacks feedbacks;
    @JoinColumn(name = "ProductID", referencedColumnName = "ProductID", insertable = false, updatable = false)
    @ManyToOne(optional = false)
    private Products products;

    public FeedbackDetails() {
    }

    public FeedbackDetails(FeedbackDetailsPK feedbackDetailsPK) {
        this.feedbackDetailsPK = feedbackDetailsPK;
    }

    public FeedbackDetails(int feedbackID, int productID) {
        this.feedbackDetailsPK = new FeedbackDetailsPK(feedbackID, productID);
    }

    public FeedbackDetailsPK getFeedbackDetailsPK() {
        return feedbackDetailsPK;
    }

    public void setFeedbackDetailsPK(FeedbackDetailsPK feedbackDetailsPK) {
        this.feedbackDetailsPK = feedbackDetailsPK;
    }

    public String getFeedbackContent() {
        return feedbackContent;
    }

    public void setFeedbackContent(String feedbackContent) {
        this.feedbackContent = feedbackContent;
    }

    public String getReviews() {
        return reviews;
    }

    public void setReviews(String reviews) {
        this.reviews = reviews;
    }

    public Feedbacks getFeedbacks() {
        return feedbacks;
    }

    public void setFeedbacks(Feedbacks feedbacks) {
        this.feedbacks = feedbacks;
    }

    public Products getProducts() {
        return products;
    }

    public void setProducts(Products products) {
        this.products = products;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (feedbackDetailsPK != null ? feedbackDetailsPK.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof FeedbackDetails)) {
            return false;
        }
        FeedbackDetails other = (FeedbackDetails) object;
        if ((this.feedbackDetailsPK == null && other.feedbackDetailsPK != null) || (this.feedbackDetailsPK != null && !this.feedbackDetailsPK.equals(other.feedbackDetailsPK))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.vang.monashoeapi.entities.FeedbackDetails[ feedbackDetailsPK=" + feedbackDetailsPK + " ]";
    }
    
}
