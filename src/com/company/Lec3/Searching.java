package com.company.Lec3;

public class Searching {

    public static void main(String[] args) {

    }

    public static int linear(int ar[], int element){

        for (int i = 0; i <ar.length ; i++) {

            if(ar[i]==element){
                return i;
            }
        }
        return -1;
    }


}
