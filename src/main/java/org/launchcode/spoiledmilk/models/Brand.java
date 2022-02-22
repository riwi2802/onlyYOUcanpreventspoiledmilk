package org.launchcode.spoiledmilk.models;

public enum Brand {
    LUCERNE("Lucerne"),
    WHOLEFOODS("Whole Foods/365 Everyday"),
    TRADERJOES("Trader Joe's"),
    HORIZON("Horizon Organics"),
    FAIRLIFE("Fairlife"),
    CLOVERFARMS("Clover Farms"),
    ORGANICVALLEY("Organic Valley"),
    STONYFIELD("Stonyfield"),
    MAPLEHILL("Maplehill"),
    A2("A2"),
    DAIRYPURE("Dairy Pure");

    private final String displayName;

    public String getDisplayName() {
        return displayName;
    }

    Brand(String displayName) {
        this.displayName = displayName;
    }
}

