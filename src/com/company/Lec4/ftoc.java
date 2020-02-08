package com.company.Lec4;

import java.util.Scanner;

public class ftoc {

    public static void main(String[] args) {

        Scanner s= new Scanner(System.in);
        int start = s.nextInt();
        int end =s.nextInt();
        int step= s.nextInt();

        conversion(start,end,step);
    }

    public static void conversion(int start, int end, int step) {

        while(start<=end){

            float c= (5f/9) *(start-32);
            System.out.println(c);
            start=start+step;

        }
    }


}
