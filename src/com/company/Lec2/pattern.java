package com.company.Lec2;

import java.util.Scanner;

public class pattern {

    public static void main(String[] args) {

        Scanner s= new Scanner(System.in);
        int n = s.nextInt();

        int row=1;
        int k=1;
//
        while(k<=2*n-1){

            int col=1;

            int side=1;

            while(side<=2*n-1){

                if(col<=row){
                    System.out.print("*");
                }
                else{
                    System.out.print(" ");
                }

                if(side<n){
                    col=col+1;
                }
                else{
                    col=col-1;
                }

                side=side+1;
            }

            System.out.println();
            if(k<n){
                row=row+1;
            }
            else{
                row=row-1;
            }
            k=k+1;
        }

    }
}
