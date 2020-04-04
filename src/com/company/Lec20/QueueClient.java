package com.company.Lec20;

public class QueueClient {

    public static void main(String[] args) {


        CircularQueue queue = new CircularQueue();

        for (int i = 0; i <10 ; i++) {
            queue.enqueue(i);
        }

        queue.dequeue();

        queue.enqueue(21);

        for (int i = 0; i <10 ; i++) {
            System.out.println(queue.dequeue());
        }

//        queue.display();

    }
}
