package com.company.Lec7;

public class BulderIntro {

    public static void main(String[] args) {

        String s="";

        StringBuilder builder= new StringBuilder(s);

        for (int i = 0; i <1000000 ; i++) {
            builder.append("a");
        }

        System.out.println(builder);
    }
}
