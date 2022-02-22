package org.launchcode.spoiledmilk.models;

import javax.persistence.Entity;
import javax.persistence.OneToMany;
import javax.validation.constraints.NotBlank;
import java.util.ArrayList;
import java.util.List;

@Entity
public class Store extends AbstractEntity {

    @NotBlank
    private String name;

    @OneToMany(mappedBy = "store")
    private final List<PurchaseEntry> purchases = new ArrayList<>();

    //address data should be auto-populated from map - check JSON for field names

    private String address;
}
