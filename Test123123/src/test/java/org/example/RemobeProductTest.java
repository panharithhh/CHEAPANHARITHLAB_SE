package org.example;


import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class RemobeProductTest {
    private ProductManager manager;

    @BeforeEach
    public void setup() {
        manager = new ProductManager();
        manager.addProduct("A", 10);
        manager.addProduct("B", 20);
    }

    @Test
    public void removeProductCorrectly() {
        Product removed = manager.removeProduct("A");
        assertNotNull(removed);
        assertEquals("A", removed.getName());
        assertEquals(-1, manager.findProduct("A"));
    }

    @Test
    public void removeProductIncorrectly() {
        Product removed = manager.removeProduct("X");
        assertNull(removed);
    }

    @Test
    public void checkCountAfterRemove() {
        int before = manager.getCount();
        manager.removeProduct("B");
        assertEquals(before - 1, manager.getCount());
    }
}

