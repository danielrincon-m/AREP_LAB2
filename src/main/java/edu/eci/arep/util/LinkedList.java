package edu.eci.arep.util;

public class LinkedList<E> {

    private LinkedListNode<E> head;
    private int size;

    public void addFirst(E e) {
        LinkedListNode<E> newNode = new LinkedListNode<>(e);
        newNode.setNextNode(head);
        head = newNode;
        size++;
    }

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

    public E get(E e) {
        LinkedListNode<E> actualNode = head;
        for (int i = 0; i < size; i++) {
            if (actualNode.equals(e)) {
                return actualNode.getData();
            }
            actualNode = actualNode.getNextNode();
        }
        return actualNode.getData();
    }

    public E get(int index) {
        LinkedListNode<E> actualNode = head;
        for (int i = 0; i < index; i++) {
            actualNode = actualNode.getNextNode();
        }
        return actualNode.getData();
    }

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

    public int getSize() {
        return size;
    }
}
