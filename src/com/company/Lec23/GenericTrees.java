package com.company.Lec23;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class GenericTrees {

    private Node root;

    public void insert(Scanner s){

        System.out.println("Enter the value for root : ");
        int val =s.nextInt();
        this.root =new Node(val);
        insert(root,s);
    }

    private void insert(Node node, Scanner s) {

        while (true){

            System.out.println("Do you want to add child of "+ node.value);
            boolean yes =s.nextBoolean();

            if(yes){
                System.out.println("Enter the value for children");
                int val = s.nextInt();
                Node child =new Node(val);
                node.children.add(child);
                insert(child,s);
            }

            else{
                break;
            }
        }
    }

    public void display(){
        display(root,"");
    }

    public void display(Node node, String indent){

        System.out.println(indent+node.value);

        for (int i = 0; i <node.children.size() ; i++) {

            display(node.children.get(i), indent+"\t");
        }
    }

    public int count(){
       return count(root);
    }

    private int count(Node node) {

        int cnt = 1;

        for (int i = 0; i <node.children.size() ; i++) {
           cnt+= count(node.children.get(i));
        }
        return cnt;
    }

    public int max(){

        int max=root.value;
        return max(root,max);
    }

    private int max(Node node, int max) {

        if(max<node.value){
            max=node.value;
        }

        for (int i = 0; i <node.children.size(); i++) {
           max= max(node.children.get(i),max);
        }
        return max;
    }

    public void atlevel(int k){
        atlevel(root,k);
    }

    private void atlevel(Node node, int k) {

        if(k==0){
            System.out.println(node.value);
        }

        for (int i = 0; i <node.children.size() ; i++) {
            atlevel(node.children.get(i),k-1);
        }
    }

    public void levelorder(){

        Queue<Node> queue = new LinkedList<>();
        queue.add(root);

        while(!queue.isEmpty()){

            Node temp = queue.remove();
            System.out.println(temp.value);

            for (int i = 0; i <temp.children.size() ; i++) {
                queue.add(temp.children.get(i));
            }
        }
    }

    class Node{

        int value;
        ArrayList<Node> children;

        public Node(int value) {
            this.value = value;
            this.children = new ArrayList<>();
        }
    }
}
