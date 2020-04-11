package com.company.Lec21;

public class ArrayList {


    private int[] data;
    private int size;
    private int DEFAULTSIZE=10;

    public ArrayList() {

        this.data = new int[DEFAULTSIZE];
        this.size=0;
    }


    public void add(int value){

        if (isFull()) {
            resize();
        }

        data[size++]= value;
    }

    private boolean isFull() {
        return size==data.length;
    }

    private void resize() {

        System.out.println("Me bad gya");
        int ar[] = new int[2*data.length];

        for (int i = 0; i <data.length ; i++) {
            ar[i]=data[i];
        }

        data =ar;
    }

    public int get(int index){

        return data[index];

    }

    public void set(int index, int value){

        data[index]=value;
    }

}
