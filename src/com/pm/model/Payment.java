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
public class Payment {
    
    private int PaymentId;
    private String PaymentType;
    private BigDecimal PaymentAmount;
    private Timestamp PaymentDate;
    private int PaymentInvoiceQuotationId;
    private int Status;
    private String Remarks;

    /**
     * @return the PaymentId
     */
    public int getPaymentId() {
        return PaymentId;
    }

    /**
     * @param PaymentId the PaymentId to set
     */
    public void setPaymentId(int PaymentId) {
        this.PaymentId = PaymentId;
    }

    /**
     * @return the PaymentType
     */
    public String getPaymentType() {
        return PaymentType;
    }

    /**
     * @param PaymentType the PaymentType to set
     */
    public void setPaymentType(String PaymentType) {
        this.PaymentType = PaymentType;
    }

    /**
     * @return the PaymentAmount
     */
    public BigDecimal getPaymentAmount() {
        return PaymentAmount;
    }

    /**
     * @param PaymentAmount the PaymentAmount to set
     */
    public void setPaymentAmount(BigDecimal PaymentAmount) {
        this.PaymentAmount = PaymentAmount;
    }

    /**
     * @return the PaymentDate
     */
    public Timestamp getPaymentDate() {
        return PaymentDate;
    }

    /**
     * @param PaymentDate the PaymentDate to set
     */
    public void setPaymentDate(Timestamp PaymentDate) {
        this.PaymentDate = PaymentDate;
    }

    /**
     * @return the PaymentInvoiceQuotationId
     */
    public int getPaymentInvoiceQuotationId() {
        return PaymentInvoiceQuotationId;
    }

    /**
     * @param PaymentInvoiceQuotationId the PaymentInvoiceQuotationId to set
     */
    public void setPaymentInvoiceQuotationId(int PaymentInvoiceQuotationId) {
        this.PaymentInvoiceQuotationId = PaymentInvoiceQuotationId;
    }

    /**
     * @return the Status
     */
    public int getStatus() {
        return Status;
    }

    /**
     * @param Status the Status to set
     */
    public void setStatus(int Status) {
        this.Status = Status;
    }

    /**
     * @return the Remarks
     */
    public String getRemarks() {
        return Remarks;
    }

    /**
     * @param Remarks the Remarks to set
     */
    public void setRemarks(String Remarks) {
        this.Remarks = Remarks;
    }
    
}
