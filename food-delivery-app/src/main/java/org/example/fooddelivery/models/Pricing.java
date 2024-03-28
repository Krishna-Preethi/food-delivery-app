package org.example.fooddelivery.models;

public class Pricing {
    private int id;
    private int organizationId;
    private int itemId;
    private String zone;
    private int baseDistanceInKm;
    private double kmPrice;
    private double fixPrice;

    public Pricing(int id, int organizationId, int itemId, String zone, int baseDistanceInKm, double kmPrice, double fixPrice) {
        this.id = id;
        this.organizationId = organizationId;
        this.itemId = itemId;
        this.zone = zone;
        this.baseDistanceInKm = baseDistanceInKm;
        this.kmPrice = kmPrice;
        this.fixPrice = fixPrice;
    }

    // Getters and setters
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getOrganizationId() {
        return organizationId;
    }

    public void setOrganizationId(int organizationId) {
        this.organizationId = organizationId;
    }

    public int getItemId() {
        return itemId;
    }

    public void setItemId(int itemId) {
        this.itemId = itemId;
    }

    public String getZone() {
        return zone;
    }

    public void setZone(String zone) {
        this.zone = zone;
    }

    public int getBaseDistanceInKm() {
        return baseDistanceInKm;
    }

    public void setBaseDistanceInKm(int baseDistanceInKm) {
        this.baseDistanceInKm = baseDistanceInKm;
    }

    public double getKmPrice() {
        return kmPrice;
    }

    public void setKmPrice(double kmPrice) {
        this.kmPrice = kmPrice;
    }

    public double getFixPrice() {
        return fixPrice;
    }

    public void setFixPrice(double fixPrice) {
        this.fixPrice = fixPrice;
    }
}
