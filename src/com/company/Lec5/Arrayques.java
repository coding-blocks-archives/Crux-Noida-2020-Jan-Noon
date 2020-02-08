package com.company.Lec5;

public class Arrayques {

    public static void main(String[] args) {

        int ar[] = {5,4,6,9,7,8};


    }

    public static int maxElement(int[] ar){

        int max=ar[0];

        for (int i = 1; i <ar.length ; i++) {

            if(ar[i]>max){
                max=ar[i];
            }
        }

        return max;
    }

    public static int maxIndex(int[] ar){

        int maxindex=0;

        for (int i = 1; i <ar.length ; i++) {

            if(ar[i]>ar[maxindex]){
                maxindex=i;
            }
        }

        return maxindex;
    }

    public static void swap(int ar[],int start,int end){

        int t= ar[start];
        ar[start]=ar[end];
        ar[end]=t;
    }

}
