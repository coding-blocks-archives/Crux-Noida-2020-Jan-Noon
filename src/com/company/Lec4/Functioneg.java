package com.company.Lec4;

public class Functioneg {


    public static void main(String[] args) {

        Functioneg eg= new Functioneg();

        int a=7;
        {
            a=5;
        }


        System.out.println(a);

        eg.fun();
    }

    public static void fun(){

        System.out.println("party de");
    }
}
