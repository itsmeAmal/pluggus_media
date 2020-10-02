/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.pm.model;

import java.math.BigDecimal;

/**
 *
 * @author personal
 */
public class Item {
    /*
    item_id, item_name, item_barcode, item_type, item_unit_price, item_category_name,
    item_sub_category_name, item_category_id, item_sub_category_id, item_status, item_detail
    */
private int ItemId;
private String ItemName;
private String ItemBarcode;
private String ItemType;
private BigDecimal ItemUnitPrice;
private String ItemCategoryName;
private String ItemSubCategoryName;
private int ItemCategoryId;
private int ItemSubCategoryId;
private int ItemStatus;
private String ItemDetail;

    /**
     * @return the ItemId
     */
    public int getItemId() {
        return ItemId;
    }

    /**
     * @param ItemId the ItemId to set
     */
    public void setItemId(int ItemId) {
        this.ItemId = ItemId;
    }

    /**
     * @return the ItemName
     */
    public String getItemName() {
        return ItemName;
    }

    /**
     * @param ItemName the ItemName to set
     */
    public void setItemName(String ItemName) {
        this.ItemName = ItemName;
    }

    /**
     * @return the ItemBarcode
     */
    public String getItemBarcode() {
        return ItemBarcode;
    }

    /**
     * @param ItemBarcode the ItemBarcode to set
     */
    public void setItemBarcode(String ItemBarcode) {
        this.ItemBarcode = ItemBarcode;
    }

    /**
     * @return the ItemType
     */
    public String getItemType() {
        return ItemType;
    }

    /**
     * @param ItemType the ItemType to set
     */
    public void setItemType(String ItemType) {
        this.ItemType = ItemType;
    }

    /**
     * @return the ItemUnitPrice
     */
    public BigDecimal getItemUnitPrice() {
        return ItemUnitPrice;
    }

    /**
     * @param ItemUnitPrice the ItemUnitPrice to set
     */
    public void setItemUnitPrice(BigDecimal ItemUnitPrice) {
        this.ItemUnitPrice = ItemUnitPrice;
    }

    /**
     * @return the ItemCategoryName
     */
    public String getItemCategoryName() {
        return ItemCategoryName;
    }

    /**
     * @param ItemCategoryName the ItemCategoryName to set
     */
    public void setItemCategoryName(String ItemCategoryName) {
        this.ItemCategoryName = ItemCategoryName;
    }

    /**
     * @return the ItemSubCategoryName
     */
    public String getItemSubCategoryName() {
        return ItemSubCategoryName;
    }

    /**
     * @param ItemSubCategoryName the ItemSubCategoryName to set
     */
    public void setItemSubCategoryName(String ItemSubCategoryName) {
        this.ItemSubCategoryName = ItemSubCategoryName;
    }

    /**
     * @return the ItemCategoryId
     */
    public int getItemCategoryId() {
        return ItemCategoryId;
    }

    /**
     * @param ItemCategoryId the ItemCategoryId to set
     */
    public void setItemCategoryId(int ItemCategoryId) {
        this.ItemCategoryId = ItemCategoryId;
    }

    /**
     * @return the ItemSubCategoryId
     */
    public int getItemSubCategoryId() {
        return ItemSubCategoryId;
    }

    /**
     * @param ItemSubCategoryId the ItemSubCategoryId to set
     */
    public void setItemSubCategoryId(int ItemSubCategoryId) {
        this.ItemSubCategoryId = ItemSubCategoryId;
    }

    /**
     * @return the ItemStatus
     */
    public int getItemStatus() {
        return ItemStatus;
    }

    /**
     * @param ItemStatus the ItemStatus to set
     */
    public void setItemStatus(int ItemStatus) {
        this.ItemStatus = ItemStatus;
    }

    /**
     * @return the ItemDetail
     */
    public String getItemDetail() {
        return ItemDetail;
    }

    /**
     * @param ItemDetail the ItemDetail to set
     */
    public void setItemDetail(String ItemDetail) {
        this.ItemDetail = ItemDetail;
    }

}

