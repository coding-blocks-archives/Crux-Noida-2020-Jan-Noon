package com.company.Lec11;

import java.util.ArrayList;

public class Mazepath {

    public static void main(String[] args) {
        mazepath(3,3,"");
        mazepathcount(3,3,"");
    }

    public static void mazepath(int row,int col,String processed){

        if(row==1 && col==1){
            System.out.println(processed);
            return;
        }

        if(row>1){
            mazepath(row-1,col,processed+"V");
        }

        if(col>1){
            mazepath(row,col-1,processed+"H");
        }
    }

    public static int mazepathcount(int row,int col,String processed){

        if(row==1 && col==1){
            System.out.println(processed);
            return 1;
        }

        int cnt=0;

        if(row>1){
          cnt+= mazepathcount(row-1,col,processed+"V");
        }

        if(col>1){
           cnt+= mazepathcount(row,col-1,processed+"H");
        }

        return cnt;
    }

    public static ArrayList mazepathlist(int row, int col, String processed){

        if(row==1 && col==1){
            ArrayList list= new ArrayList();
            list.add(processed);
            return list;
        }

        ArrayList list= new ArrayList();

        if(row>1){
            list.addAll(mazepathlist(row-1,col,processed+"V"));
        }

        if(col>1){
            list.addAll(mazepathlist(row,col-1,processed+"H"));
        }

        return list;
    }
}
