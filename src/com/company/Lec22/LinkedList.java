package com.company.Lec22;

public class LinkedList {

    private Node head;

    private Node tail;

    private int size=0;

    public void insertfirst(int value){

        Node node = new Node(value);
        node.next= head;
        head= node;

        if(tail==null){
            tail=head;
        }

        size++;
    }

    public void insertlast(int value){

        if(size==0){
            insertfirst(value);
            return;
        }

        Node node = new Node(value);
        tail.next=node;
        tail=node;
        size++;
    }

    public int deletefirst(){

        if(size==0){
            System.out.println("khaali he be");
            return -1;
        }

        int value= head.value;

        head=head.next;

        if(head==null){
            tail=null;
        }

        size--;

        return value;
    }

    public int deletelast(){

        if(size<2){
           return deletefirst();
        }

        Node temp = head;

        while(temp.next!=tail){
            temp=temp.next;
        }

        int value= temp.next.value;

        temp.next=null;

        size--;

        return value;
    }

    public void display(){

        Node temp=head;

        while(temp!=null){
            System.out.print(temp.value+ " -> ");
            temp=temp.next;
        }
        System.out.print("null");
    }

    public Node get(int index){

        Node temp= head;

        for (int i = 0; i <index ; i++) {
            temp=temp.next;
        }
        return temp;
    }


    class Node{

        int value;
        Node next;

        public Node(int value) {
            this.value = value;
        }
    }
}


