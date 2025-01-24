package org.example;

import static org.junit.jupiter.api.Assertions.*;


import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class ProductTest {
    @Test
    public void setNameCorrectly() {
        Product p = new Product();
        p.setName("Apple");
        assertEquals("Apple", p.getName());
    }
    @Test
    public void setNameIncorrectly() {
        Product p = new Product();
        p.setName("");
        assertNull(p.getName());
    }
    @Test
    public void setPriceCorrectly() {
        Product p = new Product();
        p.setPrice(10.5);
        assertEquals(10.5, p.getPrice());
    }
    @Test
    public void setPriceIncorrectly() {
        Product p = new Product();
        p.setPrice(-5);
        assertEquals(0.0, p.getPrice());
    }
    @Test
    public void setDiscountCorrectly() {
        Product p = new Product();
        p.setDiscount(50);
        assertEquals(50, p.getDiscount());
    }
    @Test
    public void setDiscountIncorrectly() {
        Product p = new Product();
        p.setDiscount(150);
        assertEquals(0.0, p.getDiscount());
    }
}
