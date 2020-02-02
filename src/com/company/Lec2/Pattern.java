package com.company.Lec2;

import java.util.Scanner;

public class Pattern {


    public final static void main(String[] args) {
        Functioneg fun1 =new Functioneg();


        Scanner s= new Scanner(System.in);
        int n = s.nextInt();

        int row=1;
        int k=1;

        while(k<=2*n-1){

            int col=1;

            while(col<=row){
                System.out.print("*");
                col=col+1;
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
