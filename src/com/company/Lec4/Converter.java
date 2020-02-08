package com.company.Lec4;

public class Converter {

    public static void main(String[] args) {

        System.out.println(bin2dec(1011));
    }

    public static int bin2dec(int bin){

        int deci=0;

        int place= 1;

        while(bin>0){

            int r= bin%10;
            bin=bin/10;

            deci=deci+r*place;
            place=place*2;
        }

        return deci;
    }

    public static int any2dec(int any, int base){

        int deci=0;

        int place= 1;

        while(any>0){

            int r= any%10;
            any=any/10;

            deci=deci+r*place;
            place=place*base;
        }

        return deci;
    }

    public static int deci2bin(int deci){

        int bin=0;
        int place=1;

        while(deci>0){

            int r= deci%2;
            deci=deci/2;

            bin=bin + r*place;

            place=place*10;
        }

        return bin;
    }

    public static int deci2any(int deci,int base){

        int any=0;
        int place=1;

        while(deci>0){

            int r= deci%base;
            deci=deci/base;

            any=any + r*place;

            place=place*10;
        }

        return any;
    }

    public static int any2any(int any,int fbase, int sbase){

              int deci= any2dec(any,fbase);

              return deci2any(deci,sbase);
    }


}
