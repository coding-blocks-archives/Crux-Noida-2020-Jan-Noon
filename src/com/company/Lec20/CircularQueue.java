package com.company.Lec20;

public class CircularQueue {

    private int[] data;
    private int front;
    private int end;
    private int size=0;
    private int DEFAULT_SIZE=10;

    public CircularQueue() {
        this.data = new int[DEFAULT_SIZE];
        this.end=0;
        this.front=0;
        this.size=0;
    }

    public void enqueue(int element){

        if(isFull()){
            return;
        }

        data[end++]=element;
        end=end%data.length;

        size++;
    }

    private boolean isFull() {
        return size==data.length;
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
        front=front%data.length;

        size--;

        return temp;
    }

    public void display(){

        for (int i = 0; i <size ; i++) {

            System.out.println(data[(front+i)%data.length]);
        }
    }

    private boolean isEmpty() {
        return size==0;
    }
}
