package com.DS.linkedList;

public class LinkedList {

    Node head;

    public static class Node {
        int data;
        Node next;

        public Node(int data) {
            this.data = data;
            this.next = null;
        }
    }
    //we dont have to make createNode(val) method as in java we already have a constructor
    //we can simply create node as: Node newNode = new Node(1);

//    Node createNode(int val){
//        Node newNode = null;
//        newNode.data=val;
//        newNode.next=null;
//        return newNode;
//    }


    //insert an element at the end
    void insert(int data) {
        Node newNode = new Node(data); //inserting this node
        if (head == null) {
            head = newNode;  //when the list is empty
        } else {
            Node temp = head;  //here temp is temporary node to iterate to the end of the list
            while (temp.next != null) {
                temp = temp.next;
            }
            temp.next = newNode;//when we are at the end of the list
        }
    }


    //displaying all the elements in the list
    void show() {
        Node temp = head;
        while (temp.next != null) {
            System.out.println(temp.data);
            temp = temp.next;
        }
        System.out.println(temp.data);//this one because in loop
        // it will only print till second last element
    }

    //insert element at the start
    void insertAtStart(int val) {
        Node newNode = new Node(val);
        if (head == null) {
            head = newNode;
        } else {
            newNode.next = head;//current head will become newNode.next
            head = newNode;//and newNode will become the new head
        }
    }

    //insert element at a any position
    void insertAt(int pos, int data) {
        Node newNode = new Node(data);
        if (pos == 0) {
            insertAtStart(data);
        } else {
            Node temp = head;
            for (int i = 0; i < pos - 1; i++)//(pos-1) because we have to
            // make changes to previous node
            {
                temp = temp.next;
            }
            newNode.next = temp.next;//first assigning temp.next val to newNode.next
            temp.next = newNode;// and then assigning newNode to the current temp.next
        }
    }


    //deleting an element at particular position
    //for this method we just need to change the pointer of previous
    //node(of the deleting node) to the next node(of the deleting node)
    void deleteAt(int pos){
        if(pos==0){
            head= head.next;//deleting first element
        }
        else{
            Node temp = head;
            Node temp1;
            for (int i = 0; i < pos-1; i++) {
                temp = temp.next;//previous node to the deleting node
            }
            temp1= temp.next;//node to be deleted
            temp.next=temp1.next;//changing the pointer
//            System.out.println("item deleted" +temp1.data);
            temp1=null;//eligible for garbage collection
        }
    }
}
