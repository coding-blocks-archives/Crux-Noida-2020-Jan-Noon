package com.company.Lec30;

public class LCS {

    public static void main(String[] args) {

        String r="abcd";
        String c="abec";
        int[][] mem = new int[r.length()+1][c.length()+1];
        System.out.println(LCS("abcd","abec"));
    }

    public static int LCS(String s1, String s2){

        if(s1.length()==0 ||s2.length()==0){
            return 0;
        }

        char f = s1.charAt(0);
        char s =s2.charAt(0);

        if(f==s){
            return 1 +LCS(s1.substring(1),s2.substring(1));
        }
        else{
            return Math.max(LCS(s1.substring(1),s2),LCS(s1,s2.substring(1)));
        }
    }

    public static int LCSItrDp(String s1, String s2, int[][] mem){

        for (int i = 0; i <=s1.length() ; i++) {

            for (int j = 0; j <=s2.length() ; j++) {

                if(i==0 || j==0){
                    mem[i][j]=0;
                }
                else{

                    if(s1.charAt(i-1)==s2.charAt(j-1)){
                        mem[i][j]= 1+ mem[i-1][j-1];
                    }
                    else{
                        mem[i][j]= Math.max(mem[i-1][j],mem[i][j-1]);
                    }
                }
            }
        }
        return mem[s1.length()][s2.length()];
    }



}
