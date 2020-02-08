package com.company.Lec3;

import java.util.Scanner;

public class Leapyear {

    public static void main(String[] args) {

        Scanner s= new Scanner(System.in);
        int n= s.nextInt();
        int yr=1998;

        if(yr%4==0){
            System.out.println("leap Year");
        }
        else{
            System.out.println("not a leap year");
        }
    }
}
