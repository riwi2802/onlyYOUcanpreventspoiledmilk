package org.launchcode.spoiledmilk.models;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

@Entity
public class Store extends AbstractEntity {

    private String placeId;

    private String title;

    private String address1;

    private String address2;

    private Double lat;

    private Double lng;

    @OneToMany(mappedBy = "store")
    private final List<PurchaseEntry> purchases = new ArrayList<>();

    //address data should be auto-populated from map - check JSON for field names

    public Store() {}

    public void setPlaceId(String placeId) {
        this.placeId = placeId;
    }

    public String getPlaceId() {
        return placeId;
    }

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

    public Double getLat() {
        return lat;
    }

    public void setLat(Double lat) {
        this.lat = lat;
    }

    public Double getLng() {
        return lng;
    }

    public void setLng(Double lng) {
        this.lng = lng;
    }

    public List<PurchaseEntry> getPurchases() {return purchases;}

    public void addPurchase(PurchaseEntry purchaseEntry) {this.purchases.add(purchaseEntry);}

    @Override
    public String toString() {
        return title;
    }
}
