package com.company.Lec26;

import java.util.ArrayList;
import java.util.Arrays;

public class Heaps {

    ArrayList<Integer> list = new ArrayList<>();


    public void insert(int element){
        list.add(element);
        upheap(list.size()-1);
    }

    private void upheap(int index) {

        if(index==0){
            return;
        }

        int parent = parent(index);

        if(list.get(parent)>list.get(index)){
            swap(parent,index);
            upheap(parent);
        }
    }

    public int remove() throws Exception{

        if(list.isEmpty()) {
            throw new Exception("Khaali he bhai");
        }

        int temp= list.get(0);
        int last =list.remove(list.size()-1);

        if(!list.isEmpty()){
            list.set(0,last);
            downheap(0);
        }

        return temp;
    }

    private void downheap(int index) {

        int min= index;

        int left =leftchild(index);
        int right = rightchild(index);

        if(left<list.size() && list.get(min)>list.get(left)){
            min = left;
        }

        if(right<list.size() && list.get(min)>list.get(right)){
            min = right;
        }

        if(min!=index){
            swap(min,index);
            downheap(min);
        }
    }


    private void swap(int first, int second) {

        int temp= list.get(first);
        list.set(first,list.get(second));
        list.set(second,temp);
    }

    public int parent(int index){
        return (index-1)/2;
    }

    public int leftchild(int index){
        return (2*index)+1;
    }

    public int rightchild(int index){
        return (2*index)+2;
    }

    public void display(){
        System.out.println(list);
    }

}
