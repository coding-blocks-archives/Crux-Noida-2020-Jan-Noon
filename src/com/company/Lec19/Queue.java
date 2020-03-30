package com.company.Lec19;

public class Queue {

    private int[] data;
    private int end;
    private int DEFAULT_SIZE=10;

    public Queue() {
        this.data = new int[DEFAULT_SIZE];
        this.end=0;
    }

    public void push(int element){

        if(isFull()){
            return;
        }

        data[end++]=element;
    }

    private boolean isFull() {
        return end==data.length;
    }

    public int pop(){

        if(isEmpty()){
            return -1;
        }

        int temp=data[0];

        for (int i = 1; i <end ; i++) {
            data[i-1]=data[i];
        }

        end--;

        return temp;
    }

    private boolean isEmpty() {
        return end==0;
    }
}

