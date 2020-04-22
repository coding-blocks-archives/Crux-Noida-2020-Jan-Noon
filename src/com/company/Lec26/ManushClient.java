package com.company.Lec26;


import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class ManushClient {


    public static void main(String[] args) {

        ArrayList<Human> humans= new ArrayList<>();
//        Human ar[] =new Human[3];
        humans.add(new Human(9,"Shubham"));
        humans.add(new Human(300,"Ekta"));
        humans.add(new Human(30,"Vartul"));


        for (Human human: humans) {
            System.out.println(human.name+ " " + human.age);
        }
        Collections.sort(humans);

        for (Human human: humans) {
            System.out.println(human.name+ " " + human.age);
        }



    }
}
