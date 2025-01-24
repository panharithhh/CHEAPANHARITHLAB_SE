package org.example;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class UpdateProductTest {
    private ProductManager manager;

    @BeforeEach
    public void setup() {
        manager = new ProductManager();
        manager.addProduct("Car", 5000, 10);
    }

    @Test
    public void updateProductCorrectly() {
        boolean updated = manager.updateProduct("Car", "Truck", 6000, 15);
        assertTrue(updated);
        assertEquals("Truck", manager.removeProduct("Truck").getName());
    }

    @Test
    public void updateProductIncorrectlyNotFound() {
        boolean updated = manager.updateProduct("Nope", "Truck", 6000, 15);
        assertFalse(updated);
    }

    @Test
    public void updateProductIncorrectlyBlankName() {
        boolean updated = manager.updateProduct("Car", "", 6000, 15);
        Product p = manager.removeProduct("Car");
        assertFalse(p.getName().isBlank());
        assertTrue(updated);
    }

    @Test
    public void updateProductIncorrectlyPrice() {
        boolean updated = manager.updateProduct("Car", "Car2", -100, 10);
        assertTrue(updated);
        Product p = manager.removeProduct("Car2");
        assertEquals(0.0, p.getPrice());
    }

    @Test
    public void updateProductIncorrectlyDiscount() {
        boolean updated = manager.updateProduct("Car", "Car2", 200, 500);
        assertTrue(updated);
        Product p = manager.removeProduct("Car2");
        assertEquals(0.0, p.getDiscount());
    }

    @Test
    public void updateProductCountCheck() {
        int before = manager.getCount();
        manager.updateProduct("Car", "CarNew", 300, 20);
        int after = manager.getCount();
        assertEquals(before, after);
    }
}


