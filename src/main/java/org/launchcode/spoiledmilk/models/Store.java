package org.launchcode.spoiledmilk.models;

import javax.persistence.Entity;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import javax.validation.constraints.NotBlank;
import java.util.ArrayList;
import java.util.List;

@Entity
public class Store extends AbstractEntity {

    @NotBlank
    private String name;

    @OneToOne
    private Address address;

    @OneToMany(mappedBy = "store")
    private final List<PurchaseEntry> purchases = new ArrayList<>();

    //address data should be auto-populated from map - check JSON for field names


    public Store(String name, Address address) {
        this.name = name;
        this.address = address;
    }

    public Store() {}

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Address getAddress() {
        return address;
    }

    public void setAddress(Address address) {
        this.address = address;
    }

    public List<PurchaseEntry> getPurchases() {
        return purchases;
    }

    public void addPurchase(PurchaseEntry purchaseEntry) {this.purchases.add(purchaseEntry);}

    @Override
    public String toString() {
        return name + address.getStreet();
    }
}
