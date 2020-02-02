package com.company.Lec1;


import java.util.Scanner;

public class Pattern2 {

    public static void main(String[] args) {

        Scanner s = new Scanner(System.in);
        int n= s.nextInt();

        int row=1;

        while(row<=n){

            int space=1;

            while(space<=n-row){
                System.out.print(" ");
                space=space+1;
            }

            int col=1;

            while(col<=2*row-1){
                System.out.print("*");
                col=col+1;
            }

            System.out.println();
            row=row+1;
        }
    }
}
