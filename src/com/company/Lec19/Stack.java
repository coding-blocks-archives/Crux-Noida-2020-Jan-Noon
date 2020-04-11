package com.company.Lec19;

public class Stack {

    protected int[] data;
    protected int top;
    private int DEFAULT_SIZE=10;


    public Stack() {
        this.data =new int[DEFAULT_SIZE];
        this.top=0;
    }

    public void push(int element){

        if(isFull()){
            return;
        }

        data[top++]=element;
    }

    protected boolean isFull() {
        return top==data.length;
    }

    public int pop() throws Exception {

        if(isEmpty()){
            throw new Exception("Khaali he bhai");
        }

        int temp= data[top-1];
        top--;

        return temp;
    }

    protected boolean isEmpty() {
        return top==0;
    }


}
