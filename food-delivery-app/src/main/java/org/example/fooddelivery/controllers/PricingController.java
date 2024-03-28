package org.example.fooddelivery.controllers;

import org.example.fooddelivery.models.Pricing;
import org.example.fooddelivery.services.PricingService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class PricingController {

    private final PricingService pricingService;

    @Autowired
    public PricingController(PricingService pricingService) {
        this.pricingService = pricingService;
    }

    @PostMapping("/calculate-price")
    public ResponseEntity<Double> calculatePrice(@RequestBody PricingRequest request) {
        try {
            // Extract request parameters
            String zone = request.getZone();
            String organizationId = request.getOrganizationId();
            int totalDistance = request.getTotalDistance();
            String itemType = request.getItemType();

            // Call pricing service to calculate price
            double totalPrice = pricingService.calculatePrice(zone, Integer.parseInt(organizationId), totalDistance, itemType);

            return ResponseEntity.ok(totalPrice);
        } catch (Exception e) {
            return ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR).build();
        }
    }

    // Inner class representing the request body structure
    static class PricingRequest {
        private String zone;
        private String organizationId;
        private int totalDistance;
        private String itemType;

        // Getters and setters
        public String getZone() {
            return zone;
        }

        public void setZone(String zone) {
            this.zone = zone;
        }

        public String getOrganizationId() {
            return organizationId;
        }

        public void setOrganizationId(String organizationId) {
            this.organizationId = organizationId;
        }

        public int getTotalDistance() {
            return totalDistance;
        }

        public void setTotalDistance(int totalDistance) {
            this.totalDistance = totalDistance;
        }

        public String getItemType() {
            return itemType;
        }

        public void setItemType(String itemType) {
            this.itemType = itemType;
        }
    }
}
