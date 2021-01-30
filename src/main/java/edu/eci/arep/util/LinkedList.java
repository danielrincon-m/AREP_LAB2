package edu.eci.arep.util;

import java.util.Collection;
import java.util.Iterator;

/**
 * Implementación de una lista enlazada sencilla, probada en la clase LinkedListTest
 * @param <E> El tipo que se almacenará en la lista enlazada
 *
 * @author Daniel Rincón
 */
public class LinkedList<E> implements Collection<E> {

    private LinkedListNode<E> head;
    private int size;

    /**
     * Agrega un elemento al inicio de la lista
     * @param e El elemento a agregar
     */
    public void addFirst(E e) {
        LinkedListNode<E> newNode = new LinkedListNode<>(e);
        newNode.setNextNode(head);
        head = newNode;
        size++;
    }

    /**
     * Agrega un elemento al final de la lista
     * @param e El elemento a agregar
     */
    public void addLast(E e) {
        LinkedListNode<E> newNode = new LinkedListNode<>(e);
        if (head == null) {
            head = newNode;
        } else {
            LinkedListNode<E> lastNode = head;
            for (int i = 0; i < size - 1; i++) {
                lastNode = lastNode.getNextNode();
            }
            lastNode.setNextNode(newNode);
        }
        size++;
    }

    /**
     * Obtiene el elemento ubicado en la posición dada de la lista
     * @param index La posición de ls lista en la cual se desea buscar en la lista
     * @return El elemento ubicado en la posición
     * @throws IndexOutOfBoundsException Si la posición no existe en la lista
     */
    public E get(int index) throws IndexOutOfBoundsException {
        if (index >= size) {
            throw new IndexOutOfBoundsException();
        }

        LinkedListNode<E> actualNode = head;
        for (int i = 0; i < index; i++) {
            actualNode = actualNode.getNextNode();
        }
        return actualNode.getData();
    }

    /**
     * Remueve el elemento ubicado en el índice dado
     * @param index La posición en la lista del elemento a remover
     * @throws IndexOutOfBoundsException Cuando la posición no existe en la lista
     */
    public void remove(int index) throws IndexOutOfBoundsException {
        LinkedListNode<E> nodeToRemove = head;
        LinkedListNode<E> prevNode = null;
        LinkedListNode<E> nextNode = null;

        if (index < 0 || index >= size) {
            throw new IndexOutOfBoundsException();
        }

        if (index == 0) {
            nextNode = nodeToRemove.getNextNode();
            head = nextNode;
        } else {
            for (int i = 0; i < index; i++) {
                prevNode = nodeToRemove;
                nodeToRemove = nodeToRemove.getNextNode();
            }
            nextNode = nodeToRemove.getNextNode();
            prevNode.setNextNode(nextNode);
        }
        size--;
    }

    /**
     * @return La longitud de la lista enlazada
     */
    public int getSize() {
        return size;
    }

    @Override
    public int size() {
        return size;
    }

    @Override
    public boolean isEmpty() {
        return size == 0;
    }

    @Override
    public boolean contains(Object o) {
        return false;
    }

    @Override
    public Iterator<E> iterator() {
        return null;
    }

    @Override
    public Object[] toArray() {
        return new Object[0];
    }

    @Override
    public <T> T[] toArray(T[] a) {
        return null;
    }

    @Override
    public boolean add(E e) {
        return false;
    }

    @Override
    public boolean remove(Object o) {
        return false;
    }

    @Override
    public boolean containsAll(Collection<?> c) {
        return false;
    }

    @Override
    public boolean addAll(Collection<? extends E> c) {
        return false;
    }

    @Override
    public boolean removeAll(Collection<?> c) {
        return false;
    }

    @Override
    public boolean retainAll(Collection<?> c) {
        return false;
    }

    @Override
    public void clear() {

    }
}
