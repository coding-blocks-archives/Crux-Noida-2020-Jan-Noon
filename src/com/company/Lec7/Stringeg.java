package com.company.Lec7;

public class Stringeg {

    public static void main(String[] args) {

       String s= "hello";

       String f="hello";

       s= "hello";

       System.out.println(f);

        System.out.println(f==s);

        System.out.println(f.equals(s));
        System.out.println(s.charAt(0));

        int i = Integer.parseInt("1");
        System.out.println(i);

        System.out.println(s.substring(1,5));

        System.out.println(s.indexOf("l",3));

        occurences("hello","l");

        substring("hello");

        System.out.println(pallindrome("aba"));
    }

    public static void occurences(String s, String pattern){

        int index=0;

        while(true){

            index= s.indexOf(pattern,index);

            if(index==-1){
                break;
            }

            System.out.println(index);
            index=index+1;

        }
    }

    public static void substring(String s){

        for (int i = 0; i <s.length() ; i++) {

            for (int j = i+1; j <=s.length() ; j++) {

                System.out.println(s.substring(i,j));
            }
        }
    }

    public static boolean pallindrome(String str){

        int i=0;
        int j= str.length()-1;

        while(i<j){
            if(str.charAt(i)!=str.charAt(j)){
                return false;
            }

            i++;
            j--;
        }

        return true;
    }
}
