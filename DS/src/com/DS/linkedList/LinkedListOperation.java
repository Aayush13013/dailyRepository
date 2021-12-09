package com.DS.linkedList;

public class LinkedListOperation {
    public static void main(String[] args) {
        LinkedList list = new LinkedList();
        list.insert(5);
        list.insert(12);
        list.insert(6);

        list.insertAtStart(25);

        list.insertAt(0,55);

        list.deleteAt(2);
        list.show();
    }
}