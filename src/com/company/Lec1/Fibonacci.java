package com.company.Lec1;

import java.util.Scanner;

public class Fibonacci {
    public static void main(String[] args) {

        Scanner s= new Scanner(System.in);
        int n=s.nextInt();

        int f=0;
        int s1=1;

        while(n>0){

            int t= f+s1;
            f=s1;
            s1=t;
            n=n-1;
        }
        System.out.println(f);
    }
}
