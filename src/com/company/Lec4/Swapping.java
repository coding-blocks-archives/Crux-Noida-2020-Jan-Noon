package com.company.Lec4;

public class Swapping {


    public static void main(String[] args) {

        int a=5;
        int b=7;

        System.out.println(a+ " " + b);
      swap(a,b);

        System.out.println(a+ " " + b);
    }

    public static int swap(int a, int b){

        int t=a;
        a=b;
        b=t;

        return a;
    }
}
