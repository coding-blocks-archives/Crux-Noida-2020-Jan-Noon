package com.company.Lec21;

import com.company.Lec20.CircularQueue;

public class DynamicQueue extends CircularQueue {

    @Override
    public void enqueue(int element) {

        if(this.isFull()){
            System.out.println("Me bad gya");
            int ar[] = new int[2*data.length];

            for (int i = 0; i <size ; i++) {

                ar[i]=data[(front+i)%data.length];
            }

            front=0;
            end=data.length;
            data=ar;

        }
        super.enqueue(element);
    }
}
