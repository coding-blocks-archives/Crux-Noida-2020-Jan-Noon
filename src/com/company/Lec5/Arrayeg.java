package com.company.Lec5;

import java.util.Scanner;

public class Arrayeg {

    public static void main(String[] args) {

        Scanner s= new Scanner(System.in);

        int[] ar = new int[6];

        System.out.println(ar);

        for (int i = 0; i <ar.length ; i++) {

            System.out.println(ar[i]);
        }

        for (int i = 0; i <ar.length ; i++) {
            ar[i]=s.nextInt();
        }



    }

}
