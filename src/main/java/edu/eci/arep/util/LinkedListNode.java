package edu.eci.arep.util;

public class LinkedListNode<E> {
    private LinkedListNode<E> nextNode;
    private final E data;

    public LinkedListNode(E data) {
        this.data = data;
    }

    public void setNextNode(LinkedListNode<E> nextNode) {
        this.nextNode = nextNode;
    }

    public LinkedListNode<E> getNextNode() {
        return nextNode;
    }

    public E getData() {
        return data;
    }
}
