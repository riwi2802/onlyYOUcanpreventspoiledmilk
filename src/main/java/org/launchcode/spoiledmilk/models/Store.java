package org.launchcode.spoiledmilk.models;

import javax.persistence.Entity;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import javax.validation.constraints.Min;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;
import java.util.ArrayList;
import java.util.List;

@Entity
public class Store extends AbstractEntity {

    @NotBlank
    private String name;

    @NotNull
    private String street;

    @Size(min = 3, max = 50)
    private String city;

    @Size(min = 2, max = 2)
    private String state;

    @Min(10000)
    private Integer zipCode;

    @OneToMany(mappedBy = "store")
    private final List<PurchaseEntry> purchases = new ArrayList<>();

    //address data should be auto-populated from map - check JSON for field names


    public Store(String name, String street, String city, String state, Integer zipCode) {
        this.name = name;
        this.street = street;
        this.city = city;
        this.state = state;
        this.zipCode = zipCode;
    }

    public Store() {}

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getStreet() {
        return street;
    }

    public void setStreet(String street) {
        this.street = street;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }

    public Integer getZipCode() {
        return zipCode;
    }

    public void setZipCode(Integer zipCode) {
        this.zipCode = zipCode;
    }

//    public List<PurchaseEntry> getPurchases() {return purchases;}

//    public void addPurchase(PurchaseEntry purchaseEntry) {this.purchases.add(purchaseEntry);}

    @Override
    public String toString() {
        return name + street;
    }
}
