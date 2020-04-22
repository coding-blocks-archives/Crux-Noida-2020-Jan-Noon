package com.company.Lec26;

public class Human implements Comparable<Human>{

    public int age;
    public String name;


    public Human(int age, String name) {
        this.age = age;
        this.name = name;
    }

    @Override
    public int compareTo(Human old) {
        return this.age-old.age;
    }
}

// Study about Comparator