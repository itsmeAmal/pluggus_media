/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.pm.model;

import java.math.BigDecimal;
import java.sql.Timestamp;

/**
 *
 * @author personal
 */
public class Invoice {
    /*
    invoice_id, invoice_date, invoice_customer_id, invoice_item_type, invoice_qty, 
    invoice_total, invoice_discount_amount, invoice_discount_percentage, 
    invoice_status, invoice_remark, invoice_remark_2
    */
    
    private int InvoiceId;
    private Timestamp InvoiceDate;
    private int InvoiceCustomerId;
    private String InvoiceItemType;
    private BigDecimal InvoiceQty;
    private BigDecimal InvoiceTotal;
    private BigDecimal InvoiceDiscountAmount;
    private BigDecimal InvoiceDiscountPercentage;
    private int InvoiceStatus;
    private String InvoiceRemark;
    private String InvoiceRemark2;

    /**
     * @return the InvoiceId
     */
    public int getInvoiceId() {
        return InvoiceId;
    }

    /**
     * @param InvoiceId the InvoiceId to set
     */
    public void setInvoiceId(int InvoiceId) {
        this.InvoiceId = InvoiceId;
    }

    /**
     * @return the InvoiceDate
     */
    public Timestamp getInvoiceDate() {
        return InvoiceDate;
    }

    /**
     * @param InvoiceDate the InvoiceDate to set
     */
    public void setInvoiceDate(Timestamp InvoiceDate) {
        this.InvoiceDate = InvoiceDate;
    }

    /**
     * @return the InvoiceCustomerId
     */
    public int getInvoiceCustomerId() {
        return InvoiceCustomerId;
    }

    /**
     * @param InvoiceCustomerId the InvoiceCustomerId to set
     */
    public void setInvoiceCustomerId(int InvoiceCustomerId) {
        this.InvoiceCustomerId = InvoiceCustomerId;
    }

    /**
     * @return the InvoiceItemType
     */
    public String getInvoiceItemType() {
        return InvoiceItemType;
    }

    /**
     * @param InvoiceItemType the InvoiceItemType to set
     */
    public void setInvoiceItemType(String InvoiceItemType) {
        this.InvoiceItemType = InvoiceItemType;
    }

    /**
     * @return the InvoiceQty
     */
    public BigDecimal getInvoiceQty() {
        return InvoiceQty;
    }

    /**
     * @param InvoiceQty the InvoiceQty to set
     */
    public void setInvoiceQty(BigDecimal InvoiceQty) {
        this.InvoiceQty = InvoiceQty;
    }

    /**
     * @return the InvoiceTotal
     */
    public BigDecimal getInvoiceTotal() {
        return InvoiceTotal;
    }

    /**
     * @param InvoiceTotal the InvoiceTotal to set
     */
    public void setInvoiceTotal(BigDecimal InvoiceTotal) {
        this.InvoiceTotal = InvoiceTotal;
    }

    /**
     * @return the InvoiceDiscountAmount
     */
    public BigDecimal getInvoiceDiscountAmount() {
        return InvoiceDiscountAmount;
    }

    /**
     * @param InvoiceDiscountAmount the InvoiceDiscountAmount to set
     */
    public void setInvoiceDiscountAmount(BigDecimal InvoiceDiscountAmount) {
        this.InvoiceDiscountAmount = InvoiceDiscountAmount;
    }

    /**
     * @return the InvoiceDiscountPercentage
     */
    public BigDecimal getInvoiceDiscountPercentage() {
        return InvoiceDiscountPercentage;
    }

    /**
     * @param InvoiceDiscountPercentage the InvoiceDiscountPercentage to set
     */
    public void setInvoiceDiscountPercentage(BigDecimal InvoiceDiscountPercentage) {
        this.InvoiceDiscountPercentage = InvoiceDiscountPercentage;
    }

    /**
     * @return the InvoiceStatus
     */
    public int getInvoiceStatus() {
        return InvoiceStatus;
    }

    /**
     * @param InvoiceStatus the InvoiceStatus to set
     */
    public void setInvoiceStatus(int InvoiceStatus) {
        this.InvoiceStatus = InvoiceStatus;
    }

    /**
     * @return the InvoiceRemark
     */
    public String getInvoiceRemark() {
        return InvoiceRemark;
    }

    /**
     * @param InvoiceRemark the InvoiceRemark to set
     */
    public void setInvoiceRemark(String InvoiceRemark) {
        this.InvoiceRemark = InvoiceRemark;
    }

    /**
     * @return the InvoiceRemark2
     */
    public String getInvoiceRemark2() {
        return InvoiceRemark2;
    }

    /**
     * @param InvoiceRemark2 the InvoiceRemark2 to set
     */
    public void setInvoiceRemark2(String InvoiceRemark2) {
        this.InvoiceRemark2 = InvoiceRemark2;
    }
    
}
