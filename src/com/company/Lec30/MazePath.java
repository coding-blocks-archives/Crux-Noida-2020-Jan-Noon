package com.company.Lec30;

public class MazePath {

    public static void main(String[] args) {
        int r=4;
        int c=4;
        int[][] mem = new int[r+1][c+1];
        System.out.println(mazepath(r,c));
//        System.out.println(mazePathDpRec(r,c,mem));
        System.out.println(mazePathitr(r,c,mem));
    }

    public static int mazepath(int row, int col){

        if(row==1 || col==1){
            return 1;
        }

        return mazepath(row-1,col) + mazepath(row,col-1);
    }


    public static int mazePathDpRec(int row, int col, int mem[][]){

        if(row==1 || col==1){
            return 1;
        }

        if(mem[row][col]!=0){
            return mem[row][col];
        }

        mem[row][col]= mazePathDpRec(row-1,col,mem)+mazePathDpRec(row,col-1,mem);

        return mem[row][col];
    }

    public static int mazePathitr(int row, int col, int mem[][]){

        for (int i = 1; i <=row ; i++) {

            for (int j = 1; j <=col ; j++) {

                if(i==1 || j==1){
                    mem[i][j]=1;
                }

                else{
                    mem[i][j] = mem[i-1][j] + mem[i][j-1];
                }
            }
        }

        return mem[row][col];
    }
}
