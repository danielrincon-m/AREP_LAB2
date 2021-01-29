package edu.eci.arep;

import edu.eci.arep.util.LinkedList;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Pruebas de la Lista Enlazada implementada
 *
 * @author Daniel Rincón
 */
public class LinkedListTest {

    private LinkedList<Integer> list;

    @Before
    public void initializeLinkedList() {
        list = new LinkedList<>();
    }

    /**
     * Prueba el cálculo interno de la longitud de la lista
     */
    @Test
    public void sizeTest() {
        assertEquals(0, list.getSize());
        list.addFirst(0);
        assertEquals(1, list.getSize());
        list.remove(0);
        assertEquals(0, list.getSize());
    }

    /**
     * Prueba la función que agrega elementos al comienzo de la lista
     */
    @Test
    public void addFirstTest() {
        list.addFirst(20);
        list.addFirst(10);
        assertEquals(20, (int) list.get(1));
        assertEquals(10, (int) list.get(0));
    }

    /**
     * Prueba la función que agrega elementos al final de la lista
     */
    @Test
    public void addLastTest() {
        list.addLast(10);
        list.addLast(20);
        assertEquals(10, (int) list.get(0));
        assertEquals(20, (int) list.get(1));
    }

    /**
     * Prueba la función que remueve elementos de la lista
     */
    @Test
    public void removeTest() {
        list.addLast(10);
        list.addLast(20);
        assertEquals(2, list.getSize());
        list.remove(1);
        assertEquals(1, list.getSize());
        assertEquals(10, (int) list.get(0));
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
