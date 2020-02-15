package com.company.Lec7;

import java.util.Scanner;

public class MultiArray {

    public static void main(String[] args) {

        Scanner s = new Scanner(System.in);


//        int[][] ar= new int[3][3];

        int[][] ar1= { {1,2,3},{4,5,6},{7,8,9}};
//
//
//        for (int i = 0; i <ar.length ; i++) {
//            for (int j = 0; j <ar[i].length ; j++) {
//
//                System.out.println(ar[i][j]);
//            }
//        }
//
//        for (int i = 0; i <ar.length ; i++) {
//            for (int j = 0; j <ar[i].length ; j++) {
//
//              ar[i][j]=s.nextInt();
//            }
//        }

        spiral(ar1);
    }

    public static void spiral(int[][] ar){

        int left=0;
        int top=0;
        int right=ar[0].length-1;
        int bottom=ar.length-1;

        while(top<=bottom && left<=right){

            for (int i = left; i <=right ; i++) {
                System.out.println(ar[top][i]);
            }
            top=top+1;

            for (int i = top; i <=bottom ; i++) {
                System.out.println(ar[i][right]);
            }
            right=right-1;

            for (int i = right; i>=left ; i--) {
                System.out.println(ar[bottom][i]);
            }
            bottom=bottom-1;

            for (int i = bottom; i >=top ; i--) {
                System.out.println(ar[i][left]);
            }
            left=left+1;
        }
    }



}
