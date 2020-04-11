package com.company.Lec21;

import com.company.Lec19.Stack;

public class DynamicStack extends Stack {

    @Override
    public void push(int element) {

        if(this.isFull()){
            System.out.println("Me bad gya");
            int ar[] = new int[2*data.length];

            for (int i = 0; i <data.length ; i++) {
                ar[i]=data[i];
            }

            data =ar;
        }
        super.push(element);
    }
}
