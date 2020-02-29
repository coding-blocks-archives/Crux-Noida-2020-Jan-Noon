package com.company.Lec11;

public class Queen {

    public static void main(String[] args) {

        int n=4;

        boolean[][] board =new boolean[n][n];

//        for (int i = 0; i <board.length ; i++) {
//
//            for (int j = 0; j <board[i].length ; j++) {
//
//                System.out.println(board[i][j]);
//            }
//        }

        nqueens(board,0);
    }

    public static void nqueens(boolean[][] board, int row){

        if(row==board.length){
            display(board);
            return;
        }

        for (int col = 0; col <board.length ; col++) {
            if(isSafe(board,row,col)){

                board[row][col]=true;
                nqueens(board,row+1);
                board[row][col]=false;
            }
        }
    }

    private static boolean isSafe(boolean[][] board, int row, int col) {
        //need to be completed in next class

        return true;
    }

    private static void display(boolean[][] board) {


        for (int i = 0; i <board.length ; i++) {

            for (int j = 0; j <board[i].length; j++) {

                if(board[i][j]){
                    System.out.print("Q");
                }

                else{
                    System.out.print("X");
                }
            }
            System.out.println();
        }
        System.out.println();
    }
}
