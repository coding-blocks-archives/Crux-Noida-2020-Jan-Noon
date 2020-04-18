package com.company.Lec3;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class Main {

    public static void main(String[] args) {
//
//        System.out.println("hello");
//        System.out.println("hi");

        int a=5;

        Map<Integer,int[]> map =new HashMap<>();

        map.put(1, new int[]{1,2,3});

//        System.out.println(map);


        int ar[]=map.get(1);
        System.out.println(Arrays.toString(ar));

        ar[1]=3;

        int br[]=map.get(1);
        System.out.println(Arrays.toString(br));

        char c='a';
    }
}

