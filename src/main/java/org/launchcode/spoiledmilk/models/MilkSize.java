package org.launchcode.spoiledmilk.models;

public enum MilkSize {

    PINT("pint"),
    QUART("quart"),
    HALFGALLON("half gallon"),
    GALLON("gallon");

    private final String displayName;

    public String getDisplayName() {
        return displayName;
    }

    MilkSize (String displayName) {
        this.displayName = displayName;
    }
}
