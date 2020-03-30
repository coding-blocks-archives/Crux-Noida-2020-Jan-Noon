package com.company.Lec19;

public class QueueClient {

    public static void main(String[] args) {

        Queue queue = new Queue();

        for (int i = 1; i <10 ; i++) {

            queue.push(i);
        }

        System.out.println(queue.pop());

        System.out.println(queue.pop());
    }
}
