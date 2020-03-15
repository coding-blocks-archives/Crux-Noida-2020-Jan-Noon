package com.company.Lec13_14;

public class setbitcount {

    public static void main(String[] args) {

        System.out.println(count(5));

        System.out.println(Integer.bitCount(5));
    }


    public static int count(int n){

        int cnt=0;

        while(n!=0){

            if((n&1)==1){
                cnt=cnt+1;
            }
            n=n>>1;
        }

        return cnt;
    }
}
