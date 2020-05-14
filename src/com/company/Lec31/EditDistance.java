package com.company.Lec31;

public class EditDistance {

    public static void main(String[] args) {
        String s1="abc";
        String s2="abed";
        int[][] mem = new int[s1.length()+1][s2.length()+1];
        System.out.println(EditDistanceRec(s1,s2));
        System.out.println(EditdistanceItr(s1,s2,mem));
    }

    public static int EditDistanceRec(String s1, String s2){

        if(s1.length()==0){
            return s2.length();
        }

        if(s2.length()==0){
            return s1.length();
        }

        char f = s1.charAt(0);
        char s = s2.charAt(0);

        if(f==s){
            return EditDistanceRec(s1.substring(1),s2.substring(1));
        }

        else {
            return 1+Math.min(EditDistanceRec(s1,s2.substring(1)),
                    Math.min(EditDistanceRec(s1.substring(1),s2),
                            EditDistanceRec(s1.substring(1),s2.substring(1))));
        }

    }

    public static int EditdistanceItr(String s1, String s2, int[][] mem){

        for (int i = 0; i <=s1.length() ; i++) {

            for (int j = 0; j <=s2.length() ; j++) {

                if(i==0){
                    mem[i][j]=j;
                }
                else if(j==0){
                    mem[i][j]=i;
                }

                else{

                    if(s1.charAt(i-1) ==s2.charAt(j-1)){
                        mem[i][j]=mem[i-1][j-1];
                    }

                    else{
                        mem[i][j]= 1+ Math.min(mem[i-1][j],Math.min(mem[i][j-1],mem[i-1][j-1]));
                    }
                }
            }
        }

        return mem[s1.length()][s2.length()];
    }


}
