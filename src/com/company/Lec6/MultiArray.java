package com.company.Lec6;

import java.util.Scanner;

public class MultiArray {

    public static void main(String[] args) {

        Scanner s = new Scanner(System.in);


        int[][] ar= new int[3][3];

        int[][] ar1= { {1,2,3},{4,5,6},{7,8,9}};


        for (int i = 0; i <ar.length ; i++) {
            for (int j = 0; j <ar[i].length ; j++) {

                System.out.println(ar[i][j]);
            }
        }

        for (int i = 0; i <ar.length ; i++) {
            for (int j = 0; j <ar[i].length ; j++) {

              ar[i][j]=s.nextInt();
            }
        }



    }
}
