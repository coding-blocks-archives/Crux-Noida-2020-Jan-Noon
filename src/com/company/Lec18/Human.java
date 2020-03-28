package com.company.Lec18;


public class Human {

    String name;

    int age;
    int salary;

    public Human(){
        this("shubham");
    }

    public Human(String name) {
        this(11,name);

//        this.age=11;
    }

    public Human(int age, String name ){
        this.age=age;
        this.name=name;
    }

    public void loan(){

        int t= salary/10;

        salary=salary-t;

        System.out.println("Me gareeb ho gya "+ salary);
    }

    public static void fest(){
        System.out.println("Mze aagye");
    }

    public void eat(){

        if (salary<500){
            System.out.println("pese leke au");
            return;
        }
        salary=salary-500;
        System.out.println("me kha rha hun");

        fest();
    }


    //Stack and Queue + Inheritance

    //LinkedList    Tuesday


}
