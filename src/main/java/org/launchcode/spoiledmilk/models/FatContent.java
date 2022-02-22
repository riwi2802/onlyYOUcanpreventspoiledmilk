package org.launchcode.spoiledmilk.models;

public enum FatContent {

    SKIM("Skim (0%)"),
    LOWFAT("Low Fat (1%)"),
    REDUCEDFAT("Reduced Fat (2%)"),
    WHOLE("Whole");

    private final String displayName;

    public String getDisplayName() {
        return displayName;
    }

    FatContent (String displayName) {
        this.displayName = displayName;
    }
}
