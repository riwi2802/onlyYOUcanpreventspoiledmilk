package org.launchcode.spoiledmilk.models;

import javax.persistence.Entity;
import javax.persistence.ManyToOne;
import javax.validation.constraints.NotNull;

@Entity
public class PurchaseEntry extends AbstractEntity {

    @ManyToOne
    @NotNull
    private Store store;

    //data about purchase
    private String date;
    private String time;


    private boolean lookedLikeThereWasALotLeft;
    private boolean wasLastGallon;

    //data about milk
    private Brand brand;
    private MilkSize milkSize;
    private FatContent fatContent;
    private boolean isOrganic;

    private Double price;
}
