package com.company.Lec22;

public interface Teacher {

   public void study();

   public void teach();

   default void fun(){
      System.out.println("hello");
   }

}
