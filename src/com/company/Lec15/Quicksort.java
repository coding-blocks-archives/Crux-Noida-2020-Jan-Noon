package com.company.Lec15;

import java.util.Arrays;

import static com.company.Lec5.Arrayques.swap;

public class Quicksort {

    public static void main(String[] args) {

        int ar[]= {5,4,3,2,1};

        quick(ar,0,ar.length);

        System.out.println(Arrays.toString(ar));
    }


    public static void quick(int ar[], int start, int end){

        if(end<=start){
            return;
        }

        int pivot=end-1;

        pivot= pivotupdate(ar,start,pivot);

        quick(ar,start,pivot);
        quick(ar,pivot+1,end);

    }

    public static int pivotupdate(int ar[], int start,int pivot){

        int j=start;

        for (int i = start; i <pivot; i++) {

            if(ar[i]<ar[pivot]){
                swap(ar,i,j);
                j++;
            }
        }

        swap(ar, j, pivot);

        return j;
    }
}
