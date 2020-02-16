package com.company.Lec8;

public class BulderIntro {

    public static void main(String[] args) {

        String s="";

        StringBuilder builder= new StringBuilder(s);

        for (int i = 0; i <10 ; i++) {
            builder.append("a");
        }

        System.out.println(builder);

        builder.setCharAt(1,'i');
        System.out.println(builder);

        builder.reverse();
        System.out.println(builder);

        builder.indexOf("a",1);
        System.out.println(builder.charAt(0));

        int n= 'c'-'a';

        System.out.println((int)('a'));

        int p=Integer.parseInt("1");

        System.out.println(p);

        System.out.println(n);


        int g= 'C'-'A';
        System.out.println(g);
        char ch =(char)('a'+g);
        System.out.println(ch);


        System.out.println((int) ('a'));
        System.out.println((int)('A'));
    }

    public static String toggle(String str){

        StringBuilder builder = new StringBuilder(str);

        for (int i = 0; i <str.length() ; i++) {

            char ch = str.charAt(i);

            if(ch>='A' && ch<='Z'){
                ch= (char)('a'+(ch - 'A'));
            }
            else{
                ch= (char)('A'+(ch - 'a'));
            }
            builder.setCharAt(i,ch);
        }
        return builder.toString();
    }
}
