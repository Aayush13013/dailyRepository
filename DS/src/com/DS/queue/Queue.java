package com.DS.queue;

import java.util.ArrayList;
import java.util.List;
//implementing the queue using ArrayList
public class Queue {

    List<Integer> list = new ArrayList<>();
    int rear;
    int front;

    Queue() {
        rear = -1;
        front = -1;
    }
    //printing all the elements
    void display() {
        if (front<=rear){
        for (int i = rear; i >= front; i--) {
            System.out.println(list.get(i));
        }
        }
        else System.out.println("empty");
    }
    //adding elements in the queue
    void offer(int data) {
        rear = rear+1;
        front = 0;
        list.add(data);
    }
    //deleting the elements from the front and returning it as well
    int poll() {
        int y = list.get(front);
        front = front+1;
        return y;
    }
    //returning the element which was first added
    int peek() {
       return list.get(front);
    }
    //checking whether the queue is empty
    boolean isEmpty(){
        if (front>=rear) return true;
        else return false;
    }
}
