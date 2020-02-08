package com.company.Lec3;

import java.util.Arrays;

public class Reverse {

    public static void main(String[] args) {
        int ar[]={1,2,3,4,5};
        reverse(ar);
        System.out.println(Arrays.toString(ar));

    }

    public static void reverse(int ar[]){


        int start=0;
        int end=ar.length-1;

        while(start<end){

            Arrayques.swap(ar,start,end);

            start++;
            end--;
        }
    }
}
