package org.launchcode.spoiledmilk.models;

import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.ManyToOne;
import javax.validation.constraints.Min;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;
import java.sql.Time;
import java.util.Date;

@Entity
public class PurchaseEntry extends AbstractEntity {

    @ManyToOne
    @NotNull
    private Store store;


    //data about purchase
    private Date purchaseDate;
    private Time purchaseTime;
    private Date expDate;


    private boolean remainder;
    private boolean lastOne;

    //data about milk
    @Enumerated(EnumType.STRING)
    private Brand brand;

    @Enumerated(EnumType.STRING)
    private MilkSize milkSize;

    @Enumerated(EnumType.STRING)
    private FatContent fatContent;

    private boolean isOrganic;

    private Double price;

    public PurchaseEntry(Store store, Date purchaseDate, Time purchaseTime, Date expDate, boolean remainder, boolean lastOne, Brand brand, MilkSize milkSize, FatContent fatContent, boolean isOrganic, Double price) {
        this.store = store;
        this.purchaseDate = purchaseDate;
        this.purchaseTime = purchaseTime;
        this.expDate = expDate;
        this.remainder = remainder;
        this.lastOne = lastOne;
        this.brand = brand;
        this.milkSize = milkSize;
        this.fatContent = fatContent;
        this.isOrganic = isOrganic;
        this.price = price;
    }

    public PurchaseEntry() {}

    public Store getStore() {
        return store;
    }

    public void setStore(Store store) {
        this.store = store;
    }

    public Date getPurchaseDate() {
        return purchaseDate;
    }

    public void setPurchaseDate(Date purchaseDate) {
        this.purchaseDate = purchaseDate;
    }

    public Time getPurchaseTime() {
        return purchaseTime;
    }

    public void setPurchaseTime(Time purchaseTime) {
        this.purchaseTime = purchaseTime;
    }

    public Date getExpDate() {
        return expDate;
    }

    public void setExpDate(Date expDate) {
        this.expDate = expDate;
    }

    public boolean isRemainder() {
        return remainder;
    }

    public void setRemainder(boolean remainder) {
        this.remainder = remainder;
    }

    public boolean isLastOne() {
        return lastOne;
    }

    public void setLastOne(boolean lastOne) {
        this.lastOne = lastOne;
    }

    public Brand getBrand() {
        return brand;
    }

    public void setBrand(Brand brand) {
        this.brand = brand;
    }

    public MilkSize getMilkSize() {
        return milkSize;
    }

    public void setMilkSize(MilkSize milkSize) {
        this.milkSize = milkSize;
    }

    public FatContent getFatContent() {
        return fatContent;
    }

    public void setFatContent(FatContent fatContent) {
        this.fatContent = fatContent;
    }

    public boolean isOrganic() {
        return isOrganic;
    }

    public void setOrganic(boolean organic) {
        isOrganic = organic;
    }

    public Double getPrice() {
        return price;
    }

    public void setPrice(Double price) {
        this.price = price;
    }

    @Override
    public String toString() {
        return store.toString() + expDate;
    }
}
