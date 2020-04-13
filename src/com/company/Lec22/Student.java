package com.company.Lec22;

public interface Student {

     void study();

     default void fun(){
         System.out.println("hello");
     }


}
