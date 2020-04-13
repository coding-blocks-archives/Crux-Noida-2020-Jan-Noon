package com.company.Lec22;

public class TA implements Student,Teacher {


    @Override
    public void study() {
        System.out.println("hello bhai");
    }

    @Override
    public void fun() {

    }

    @Override
    public void teach() {
        System.out.println();
    }
}
