package com.company.Lec21;

public class StackClient {

    public static void main(String[] args) throws Exception {

        DynamicStack stack =new DynamicStack();

        for (int i = 0; i <100 ; i++) {
            stack.push(i);
        }

        for (int i = 0; i <100 ; i++) {
            System.out.println(stack.pop());
        }
    }
}
