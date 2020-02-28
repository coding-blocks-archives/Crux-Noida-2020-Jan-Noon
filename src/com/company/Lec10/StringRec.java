package com.company.Lec10;

public class StringRec {

    public static void main(String[] args) {
        subsequence("","abc");
        skipi("","hihihi");
        dice("",4);
          numpad("","19");
    }

    public static void subsequence(String processed,String unprocessed){
        if(unprocessed.isEmpty()){
            System.out.println(processed);
            return;
        }

        char ch= unprocessed.charAt(0);
        unprocessed=unprocessed.substring(1);

        subsequence(processed+ch,unprocessed);
        subsequence(processed,unprocessed);
    }

    public static void skipi(String processed,String unprocessed){
        if(unprocessed.isEmpty()){
            System.out.println(processed);
            return;
        }

        char ch= unprocessed.charAt(0);
        unprocessed=unprocessed.substring(1);

        if(ch!='i'){
            skipi(processed+ch,unprocessed);
        }

        else {
            skipi(processed, unprocessed);
        }
    }

    public static void dice(String processed,int target){


        if(target==0){
            System.out.println(processed);
            return;
        }

        for (int i =1 ; i <=6 && i<=target ; i++) {

            dice(processed+i,target-i);
        }
    }

    public static void numpad(String processed, String unprocessed){

        if(unprocessed.isEmpty()){

            System.out.println(processed);
            return;
        }

        int digit= unprocessed.charAt(0)-'0';
        unprocessed= unprocessed.substring(1);

        for (int i = 3*(digit-1); i <3*digit ; i++) {

            if(i==26){
                continue;
            }

            numpad(processed+(char)(i+'a'),unprocessed);
        }
    }
}
