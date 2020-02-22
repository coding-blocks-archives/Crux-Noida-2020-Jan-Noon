package com.company.Lec9;

import com.company.Lec5.Arrayques;

import java.util.Arrays;

public class Recursioneg {

        public static void main(String[] args) {
            int ar[] = {1, 2, 5, 2, 3};
            System.out.println(findelement(ar, 0, 3));
            System.out.println(lastfindelement(ar,ar.length-1,1));
            pattern(4,0);
            System.out.println(isSorted(ar,0));
        bubblesort(ar,ar.length-1,0);
            System.out.println(Arrays.toString(ar));
        }

        public static int findelement(int ar[], int index, int ele) {

            if (index == ar.length) {
                return -1;
            }

            if (ar[index] == ele) {
                return index;
            }

            return findelement(ar, index + 1, ele);
        }

        public static boolean isSorted(int ar[], int index) {

            if (index == ar.length - 1) {
                return true;
            }

            if (ar[index] > ar[index + 1]) {
                return false;
            }

            return isSorted(ar, index + 1);
        }

        public static void pattern(int row, int col){

            if(row==0){
                return;
            }

            if(col==row){
                System.out.println();
                pattern(row-1,0);
                return;
            }
            System.out.print("*");
            pattern(row,col+1);
        }

    public static void bubblesort(int[] ar,int row, int col){

        if(row==0){
            return;
        }

        if(col==row){
            bubblesort(ar,row-1,0);
            return;
        }

        if(ar[col]>ar[col+1]){
            Arrayques.swap(ar,col,col+1);
        }

        bubblesort(ar,row,col+1);
    }

    public static int lastfindelement(int ar[], int index, int ele) {

        if (index<0) {
            return -1;
        }

        if (ar[index] == ele) {
            return index;
        }

        return lastfindelement(ar, index - 1, ele);
    }

}


