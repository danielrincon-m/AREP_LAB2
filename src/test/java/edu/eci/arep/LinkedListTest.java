package edu.eci.arep;

import edu.eci.arep.util.LinkedList;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class LinkedListTest {

    private LinkedList<Integer> list;

    @BeforeEach
    public void initializeLinkedList() {
        list = new LinkedList<>();
    }

    @Test
    public void sizeTest() {
        assertEquals(0, list.getSize());
        list.addFirst(0);
        assertEquals(1, list.getSize());
        list.remove(0);
        assertEquals(0, list.getSize());
    }

    @Test
    public void addFirstTest() {
        list.addFirst(20);
        list.addFirst(10);
        assertEquals(20, list.get(1));
        assertEquals(10, list.get(0));
    }

    @Test
    public void addLastTest() {
        list.addLast(10);
        list.addLast(20);
        assertEquals(10, list.get(0));
        assertEquals(20, list.get(1));
    }

    @Test
    public void removeTest() {
        list.addLast(10);
        list.addLast(20);
        assertEquals(2, list.getSize());
        list.remove(1);
        assertEquals(1, list.getSize());
        assertEquals(10, list.get(0));
        list.remove(0);
        assertEquals(0, list.getSize());
        try {
            list.remove(0);
            fail("No lanzó la Excepción");
        } catch (IndexOutOfBoundsException e) {
            assertTrue(true);
        }
    }
}
