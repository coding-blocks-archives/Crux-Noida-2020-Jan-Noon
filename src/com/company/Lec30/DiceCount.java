package com.company.Lec30;

public class DiceCount {

    public static void main(String[] args) {
        int target=4;
        int[] mem = new int[target+1];

        System.out.println(dicecount(4));
//        System.out.println(diceRecDp(4,mem));
        System.out.println(diceItrDp(4,mem));
    }

    public static int dicecount(int target){

        if(target==0){
            return 1;
        }

        int cnt =0;
        for (int i = 1; i <=6 && i<=target ; i++) {

            cnt+=dicecount(target-i);
        }
        return cnt;
    }

    public static int diceRecDp(int target, int[] mem){

        if(target==0){
            return 1;
        }
        if(mem[target]!=0){
            return mem[target];
        }

        int cnt=0;

        for (int i = 1; i <=6 && i<=target ; i++) {

            cnt+=diceRecDp(target-i,mem);
        }

        mem[target]=cnt;

        return mem[target];
    }

    public static int diceItrDp(int target, int[] mem){

        mem[0] = 1;

        for (int i = 1; i <=target ; i++) {

            for (int j = 1; j <=6 && j<=i ; j++) {

                mem[i]= mem[i] + mem [i-j];
            }
        }
       return mem[target];
    }
}
