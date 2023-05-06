/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.vang.monashoeapi.entities;

import com.fasterxml.jackson.annotation.JsonIgnore;
import jakarta.persistence.Basic;
import jakarta.persistence.CascadeType;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;
import jakarta.persistence.Table;
import java.io.Serializable;
import java.sql.Date;
import java.util.List;

@Entity
@Table(name = "Accounts")
public class Accounts implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "AccountID")
    private Integer accountID;
    @Basic(optional = false)
    @Column(name = "Username")
    private String username;
    @Basic(optional = false)
    @Column(name = "Password")
    private String password;
    @Basic(optional = false)
    @Column(name = "Email")
    private String email;
    @Basic(optional = false)
    @Column(name = "Roles")
    private String roles;
    @Basic(optional = false)
    @Column(name = "DateCreate")
    private Date dateCreate;
    @Basic(optional = false)
    @Column(name = "Status")
    private String status;
    @OneToMany(cascade = {CascadeType.ALL, CascadeType.REMOVE}, mappedBy = "customerID")
    @JsonIgnore
    private List<Orders> ordersList;
//    @OneToMany(cascade = CascadeType.ALL, mappedBy = "employeeID")
//    @JsonIgnore
//    private List<Orders> ordersList1;
    @OneToMany(cascade = {CascadeType.ALL, CascadeType.REMOVE}, mappedBy = "accountID")
    @JsonIgnore
    private List<AccountConfig> accountConfigList;

    public Accounts() {
    }

    public Accounts(Integer accountID) {
        this.accountID = accountID;
    }

    public Accounts(Integer accountID, String username, String password, String email, String roles, Date dateCreate, String status) {
        this.accountID = accountID;
        this.username = username;
        this.password = password;
        this.email = email;
        this.roles = roles;
        this.dateCreate = dateCreate;
        this.status = status;
    }

    public Integer getAccountID() {
        return accountID;
    }

    public void setAccountID(Integer accountID) {
        this.accountID = accountID;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getRoles() {
        return roles;
    }

    public void setRoles(String roles) {
        this.roles = roles;
    }

    public Date getDateCreate() {
        return dateCreate;
    }

    public void setDateCreate(Date dateCreate) {
        this.dateCreate = dateCreate;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public List<Orders> getOrdersList() {
        return ordersList;
    }

    public void setOrdersList(List<Orders> ordersList) {
        this.ordersList = ordersList;
    }

//    public List<Orders> getOrdersList1() {
//        return ordersList1;
//    }
//
//    public void setOrdersList1(List<Orders> ordersList1) {
//        this.ordersList1 = ordersList1;
//    }
    @Override
    public int hashCode() {
        int hash = 0;
        hash += (accountID != null ? accountID.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Accounts)) {
            return false;
        }
        Accounts other = (Accounts) object;
        if ((this.accountID == null && other.accountID != null) || (this.accountID != null && !this.accountID.equals(other.accountID))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.vang.monashoeapi.entities.Accounts[ accountID=" + accountID + " ]";
    }

    public List<AccountConfig> getAccountConfigList() {
        return accountConfigList;
    }

    public void setAccountConfigList(List<AccountConfig> accountConfigList) {
        this.accountConfigList = accountConfigList;
    }

}
