package com.company.Lec3;

import java.util.Arrays;

public class ReversalAlgo {

    public static void main(String[] args) {

        int ar[]= {1,2,3,4,5};
        int k=2;
       reverse(ar,0,k-1);
        System.out.println(Arrays.toString(ar));
        reverse(ar,k,ar.length-1);
        System.out.println(Arrays.toString(ar));
        reverse(ar,0,ar.length-1);
        System.out.println(Arrays.toString(ar));

    }

    public static void reverse(int ar[],int start,int end){


        while(start<end){

            Arrayques.swap(ar,start,end);

            start++;
            end--;
        }
    }
}
