package org.example.fooddelivery.services;

import org.example.fooddelivery.models.Organization;
import org.example.fooddelivery.models.Item;
import org.example.fooddelivery.models.Pricing;

public class PricingService {
    public double calculatePrice(String zone, int organizationId, int totalDistance, String itemType) {
        double basePrice = 10.0;
        Organization organization = new Organization(organizationId, "Sample Organization");
        Item item = new Item(1, itemType, "Sample Item");
        Pricing pricing = new Pricing(1, organizationId, item.getId(), zone, 5, 1.5, basePrice);

        // Calculate total price
        double totalPrice = basePrice;
        if (totalDistance > pricing.getBaseDistanceInKm()) {
            double additionalDistance = totalDistance - pricing.getBaseDistanceInKm();
            totalPrice += additionalDistance * pricing.getKmPrice();
        }
        return totalPrice;
    }
}
