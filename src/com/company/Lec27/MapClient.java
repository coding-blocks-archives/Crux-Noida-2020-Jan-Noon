package com.company.Lec27;

public class MapClient {

    public static void main(String[] args) {

        HashMapArray map =new HashMapArray();
        map.put("apple", "mast he");
        map.put("mango", "bekaar he");
        map.put("grapes", "khatte he");

        System.out.println(map.get("apple"));
        System.out.println(map.get("mango"));
        System.out.println(map.get("grapes"));

        System.out.println(map);

    }
}
