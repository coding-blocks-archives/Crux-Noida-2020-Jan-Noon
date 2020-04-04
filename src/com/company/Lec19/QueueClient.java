package com.company.Lec19;

public class QueueClient {

    public static void main(String[] args) {

        Queue queue = new Queue();

        for (int i = 1; i <10 ; i++) {

            queue.enqueue(i);
        }

        System.out.println(queue.dequeue());

        System.out.println(queue.dequeue());
    }
}
