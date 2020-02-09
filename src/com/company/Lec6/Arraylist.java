package com.company.Lec6;

import java.util.ArrayList;

public class Arraylist {

    public static void main(String[] args) {

        ArrayList<Integer> list = new ArrayList();


        list.add(5);
        list.add(7);

        System.out.println(list.get(0));

        System.out.println(list.size());

        System.out.println(list.set(1,6));


        System.out.println(list);
    }


}
