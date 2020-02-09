package com.company.Lec6;

import com.company.Lec5.Arrayques;

import java.util.Arrays;

public class Sorting {

    public static void main(String[] args) {

        int ar[]={5,4,3,2,1};
//        bubble(ar);
        selection(ar);
        System.out.println(Arrays.toString(ar));
    }

    public static void bubble(int ar[]){

        for (int i = 0; i <ar.length ; i++) {

            for (int j = 0; j <ar.length-i-1 ; j++) {

                if(ar[j]>ar[j+1]){

                    Arrayques.swap(ar,j,j+1);
                }
            }
        }
    }

    public static void selection(int ar[]){

        for (int i = 0; i <ar.length ; i++) {

            int max= maxIndex(ar,0,ar.length-i-1);
            swap(ar,max,ar.length-i-1);
        }
    }

    private static void swap(int[] ar, int start, int end) {
        int t= ar[start];
        ar[start]=ar[end];
        ar[end]=t;
    }

    private static int maxIndex(int[] ar, int start, int end) {

        int max=0;

        for (int j =start ; j <=end ; j++) {

            if(ar[j]>ar[max]){
                max=j;
            }
        }
        return max;
    }

    public static void insertion(int ar[]){

        for (int i = 0; i <ar.length-1 ; i++) {

            for (int j =i+1; j>0 ; j--) {

                if(ar[j]<ar[j-1]){
                    swap(ar,j,j-1);
                }
                else{
                    break;
                }
            }
        }
    }

}
