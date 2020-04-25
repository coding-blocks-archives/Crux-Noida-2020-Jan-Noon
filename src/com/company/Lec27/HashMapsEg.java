package com.company.Lec27;

import java.util.HashMap;

public class HashMapsEg {

    public static void main(String[] args) {

        HashMap<String,String> map = new HashMap<>();

        map.put("apple","Theek");
        map.put("banana","mast");
        map.put("mango","bekaar");

        System.out.println(map);

        for (String str:map.keySet()) {
            System.out.println(str);
        }

        for (String val:map.values()) {
            System.out.println(val);
        }

        System.out.println(freq("abaaa"));
    }

    public static HashMap<Character,Integer> freq(String str){

        HashMap<Character,Integer> map = new HashMap<>();
        for (int i = 0; i <str.length() ; i++) {

            char ch = str.charAt(i);

            if(!map.containsKey(ch)){
                map.put(ch,1);
            }

            else{
                map.put(ch,map.get(ch)+1);
            }

        }
        return map;
    }
}
