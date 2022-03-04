package org.launchcode.spoiledmilk.models;

import javax.persistence.Entity;
import javax.persistence.OneToOne;

@Entity
public class Coords extends AbstractEntity {

    private Long lat;
    private Long lng;

    @OneToOne
    private Store store;

    protected Coords() {}

    public Coords(Long latitude, Long longitude, Store store) {
        this.lat = latitude;
        this.lng = longitude;
        this.store = store;
    }

    public Long getLat() {
        return lat;
    }

    public void setLat(Long lat) {
        this.lat = lat;
    }

    public Long getLng() {
        return lng;
    }

    public void setLng(Long lng) {
        this.lng = lng;
    }

    public Store getStore() {
        return store;
    }

    public void setStore(Store store) {
        this.store = store;
    }

    @Override
    public String toString() {
        return lat + ", " + lng;
    }
}
