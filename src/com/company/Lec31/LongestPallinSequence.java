package com.company.Lec31;

public class LongestPallinSequence{
    public static void main(String[] args) {
        String s1= "aceddbaabdea";
        int[][] mem = new int[s1.length()+1][s1.length()+1];
        System.out.println(longPallinSeq(s1,0,s1.length()-1));

        System.out.println(longPallinSeqDPRec(s1,0,s1.length()-1,mem));

    }

    public static int longPallinSeq(String line, int start, int end){
        if (start == end){
            return 1;
        }

        if (start > end){
            return 0;
        }

        int res = 0;

        if (line.charAt(start) == line.charAt(end)){
            res = 2 + longPallinSeq(line, start + 1, end - 1);
        } else {
            int left = longPallinSeq(line, start + 1, end);
            int right = longPallinSeq(line, start, end - 1);
            res = Math.max(left, right);
        }

        return res;
    }


    public static int longPallinSeqDPRec(String line, int start, int end, int[][] mem){
        if (start == end){
            return 1;
        }

        if (start > end){
            return 0;
        }

        if(mem[start][end]!=0){
            return mem[start][end];
        }

        int res = 0;

        if (line.charAt(start) == line.charAt(end)){
            res = 2 + longPallinSeqDPRec(line, start + 1, end - 1,mem);
        } else {
            int left = longPallinSeq(line, start + 1, end);
            int right = longPallinSeqDPRec(line, start, end - 1,mem);
            res = Math.max(left, right);
        }

        mem[start][end]=res;
        return mem[start][end];
    }

    //  Iterative Soln discussed


}
