package com.company.Lec13_14;

public class Bitmasking {

    public static void main(String[] args) {

        int ar[]={1,1,2,2,3,6,3};
        oddeven(5);
        System.out.println(uniqueelement(ar));
    }

    public static void oddeven(int n){

        if((n&1)==1){
            System.out.println("odd");
        }
        else{
            System.out.println("even");
        }
    }

    private static int uniqueelement(int[] nums) {
        int res = 0;
        for (int i = 0; i < nums.length; i++) {
            res = res ^ nums[i];
        }

        return res;
    }
}

