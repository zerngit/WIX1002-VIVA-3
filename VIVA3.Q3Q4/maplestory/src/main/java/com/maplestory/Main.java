package com.maplestory;

import main.java.com.maplestory.MagicShield;

/**
 * Main class to demonstrate MagicShield functionality
 * Tests all requirements: constructors, setters, exceptions, static methods, and edge cases
 */
public class Main {
    public static void main(String[] args) {
        
        // ===== REQUIREMENT 1: Create multiple MagicShield objects using different constructors =====
        MagicShield m1 = new MagicShield();                          // Default constructor
        MagicShield m2 = new MagicShield(4.0, 2.0, "Light");        // Parameterized constructor
        MagicShield m3 = new MagicShield(3.0, 2.0, "Dark");         // Parameterized constructor

        // ===== REQUIREMENT 2: Test setters with valid and invalid values =====
        // Valid value
        m1.setThickness(5);
        
        // Invalid value - test exception handling
        try {
            m1.setThickness(-1);
        } catch (IllegalArgumentException e) {
            System.out.println("Invalid thickness");
        }

        // ===== REQUIREMENT 3: Calculate and print defense power and mana cost =====
        System.out.println("--- Magic Shield 1 ---");
        System.out.println("Defense Power: " + m1.calculateDefensePower());
        System.out.println("Mana Cost: " + m1.calculateManaCost());

        System.out.println();

        System.out.println("--- Magic Shield 2 ---");
        System.out.println("Defense Power: " + m2.calculateDefensePower());
        System.out.println("Mana Cost: " + m2.calculateManaCost());
        
        System.out.println();

        System.out.println("--- Magic Shield 3 ---");
        System.out.println("Defense Power: " + m3.calculateDefensePower());
        System.out.println("Mana Cost: " + m3.calculateManaCost());
        
        System.out.println();

        // ===== REQUIREMENT 4: Use static methods for arbitrary parameter combinations =====
        System.out.println("=== Instant Calculation (Static Methods) ===");
        System.out.println("Defense Power: " + MagicShield.calculateDefensePower(1.0, 4.0, "Ice"));
        System.out.println("Mana Cost: " + MagicShield.calculateManaCost(1.0, 4.0));

        System.out.println();

        // ===== REQUIREMENT 5: Output total number of shields created =====
        System.out.println("Total number of shields created: " + MagicShield.getShieldCount());

        System.out.println();

        // ===== Display shield details =====
        System.out.println("MagicShield 1: \n\n" + m1);

        System.out.println();

        // ===== REQUIREMENT 6: Test edge cases =====
        System.out.println("=== Edge Case Testing ===");
        
        // Edge case 1: Negative radius
        try {
            m1.setRadius(-1);
        } catch (IllegalArgumentException e) {
            System.out.println("Caught: " + e.getMessage());
        }

        // Edge case 2: Zero values
        m1.setRadius(0);
        System.out.println("Radius set to 0: " + m1.getRadius());
        
        m1.setThickness(0);
        System.out.println("Thickness set to 0: " + m1.getThickness());

        // Edge case 3: Null elementType (should default to "Neutral")
        m1.setElementType(null);
        System.out.println("ElementType set to null, result: " + m1.getElementType());

        // Edge case 4: Empty string elementType (should default to "Neutral")
        m1.setElementType("");
        System.out.println("ElementType set to empty string, result: " + m1.getElementType());
    }
}