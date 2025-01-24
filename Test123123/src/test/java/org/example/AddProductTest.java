package org.example;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class AddProductTest {
    private ProductManager manager;

    @BeforeEach
    public void setup() {
        manager = new ProductManager();
    }

    @Test
    public void addProductCorrectly() {
        manager.addProduct("Book", 12.5);
        assertEquals(1, manager.getCount());
        assertEquals(0, manager.findProduct("Book"));
    }

    @Test
    public void addProductIncorrectly() {
        manager.addProduct("Pen", 2.0);
        manager.addProduct("Pen", 3.0);
        assertEquals(1, manager.getCount());
    }

    @Test
    public void checkCountAfterAdd() {
        manager.addProduct("Paper", 1.0);
        manager.addProduct("Pencil", 1.0);
        assertEquals(2, manager.getCount());
    }
}

