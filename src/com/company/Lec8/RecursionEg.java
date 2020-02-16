package com.company.Lec8;

public class RecursionEg {

    public static void main(String[] args) {
//        both(4);

        System.out.println(fact(4));

        fibo(4);
    }

    public static void dec(int n){

        if(n==0){
            return;
        }

        System.out.println(n);
        dec(n-1);
    }

    public static void both(int n){

        if(n==0){
            return;
        }

        System.out.println(n);
        both(n-1);
        System.out.println(n);
    }


    public static int fact(int n){

        if(n==0){
            return 1;
        }

        return n*fact(n-1);
    }


    public static int fibo(int n){

        if(n<2){
            return n;
        }

        return fibo(n-2)+fibo(n-1);
    }
}
