package com.company.Lec21;

public class QueueClient {

    public static void main(String[] args) {

        DynamicQueue queue = new DynamicQueue();

        for (int i = 0; i <100 ; i++) {
            queue.enqueue(i);
        }

        for (int i = 0; i <100 ; i++) {
            System.out.println(queue.dequeue());
        }
    }
}
