package com.company.Lec19;

public class StackClient {

    public static void main(String[] args) throws Exception {

        Stack stack = new Stack();

        stack.push(1);
        stack.push(2);

       try {
           System.out.println(stack.pop());
           System.out.println(stack.pop());
           System.out.println(stack.pop());
       }

       finally {
           System.out.println("hello");
       }

    }
}
