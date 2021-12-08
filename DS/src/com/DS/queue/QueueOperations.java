package com.DS.queue;

public class QueueOperations {
    public static void main(String[] args) {
        Queue q = new Queue();
        q.offer(1);
        q.offer(2);
        q.offer(3);
        q.offer(4);
        q.offer(5);
        q.display();

//        System.out.println(q.poll());
//        q.display();
//        System.out.println(q.peek());
        q.poll();
        q.poll();
        System.out.println(q.isEmpty());

//        System.out.println(q.peek());
//        q.display();
        q.poll();
        q.poll();
        q.poll();
//        q.poll();
        q.display();
        System.out.println(q.isEmpty());
    }
}
