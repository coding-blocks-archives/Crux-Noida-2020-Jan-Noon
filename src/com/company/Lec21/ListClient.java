package com.company.Lec21;

import java.util.LinkedList;

public class ListClient {

    public static void main(String[] args) {



        ArrayList list = new ArrayList();

        for (int i = 0; i <100 ; i++) {
            list.add(i);
        }

        for (int i = 0; i <100 ; i++) {
            System.out.println(list.get(i));
        }

    }


}
