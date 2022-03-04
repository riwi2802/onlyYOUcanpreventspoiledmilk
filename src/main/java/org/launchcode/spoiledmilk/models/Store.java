package org.launchcode.spoiledmilk.models;

import javax.persistence.Entity;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import java.util.ArrayList;
import java.util.List;

@Entity
public class Store extends AbstractEntity {

    private String title;
    private String address1;
    private String address2;

    @OneToOne
    private Coords coords;

    @OneToMany(mappedBy = "store")
    private final List<PurchaseEntry> purchases = new ArrayList<>();

    //address data should be auto-populated from map - check JSON for field names


    public Store(String title, String address1, String address2) {
        this.title = title;
        this.address1 = address1;
        this.address2 = address2;
    }

    public Store() {}

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getAddress1() {
        return address1;
    }

    public void setAddress1(String address1) {
        this.address1 = address1;
    }

    public String getAddress2() {
        return address2;
    }

    public void setAddress2(String address2) {
        this.address2 = address2;
    }

    public Coords getPosition() {
        return coords;
    }

    public void setPosition(Coords coords) {
        this.coords = coords;
    }

    public List<PurchaseEntry> getPurchases() {return purchases;}

    public void addPurchase(PurchaseEntry purchaseEntry) {this.purchases.add(purchaseEntry);}

    @Override
    public String toString() {
        return title + address1;
    }
}
