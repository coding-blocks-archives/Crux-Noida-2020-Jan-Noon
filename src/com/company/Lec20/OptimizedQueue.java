package com.company.Lec20;

public class OptimizedQueue {

    private int[] data;
    private int front;
    private int end;
    private int DEFAULT_SIZE=10;

    public OptimizedQueue() {
        this.data = new int[DEFAULT_SIZE];
        this.end=0;
        this.front=0;
    }

    public void enqueue(int element){

        if(isFull()){
            return;
        }

        data[end++]=element;
    }

    private boolean isFull() {
        return end==data.length;
    }

    public int dequeue(){

        if(isEmpty()){
            return -1;
        }

        int temp=data[front];

//        for (int i = 1; i <end ; i++) {
//            data[i-1]=data[i];
//        }

        front++;

        return temp;
    }

    public void display(){

        for (int i = front; i <end ; i++) {

            System.out.println(data[i]);
        }
    }

    private boolean isEmpty() {
        return end==0;
    }
}
