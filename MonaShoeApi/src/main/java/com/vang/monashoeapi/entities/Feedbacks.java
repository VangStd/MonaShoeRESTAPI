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
@Table(name = "Feedbacks")
public class Feedbacks implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "FeedbackID")
    private Integer feedbackID;
    @Basic(optional = false)
    @Column(name = "CreationDate")
    private Date creationDate;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "feedbacks")
    private List<FeedbackDetails> feedbackDetailsList;
    @JoinColumn(name = "ProductID", referencedColumnName = "ProductID")
    @ManyToOne(optional = false)
    private Products productID;

    public Feedbacks() {
    }

    public Feedbacks(Integer feedbackID) {
        this.feedbackID = feedbackID;
    }

    public Feedbacks(Integer feedbackID, Date creationDate) {
        this.feedbackID = feedbackID;
        this.creationDate = creationDate;
    }

    public Integer getFeedbackID() {
        return feedbackID;
    }

    public void setFeedbackID(Integer feedbackID) {
        this.feedbackID = feedbackID;
    }

    public Date getCreationDate() {
        return creationDate;
    }

    public void setCreationDate(Date creationDate) {
        this.creationDate = creationDate;
    }

    public List<FeedbackDetails> getFeedbackDetailsList() {
        return feedbackDetailsList;
    }

    public void setFeedbackDetailsList(List<FeedbackDetails> feedbackDetailsList) {
        this.feedbackDetailsList = feedbackDetailsList;
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
        hash += (feedbackID != null ? feedbackID.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Feedbacks)) {
            return false;
        }
        Feedbacks other = (Feedbacks) object;
        if ((this.feedbackID == null && other.feedbackID != null) || (this.feedbackID != null && !this.feedbackID.equals(other.feedbackID))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.vang.monashoeapi.entities.Feedbacks[ feedbackID=" + feedbackID + " ]";
    }
    
}
