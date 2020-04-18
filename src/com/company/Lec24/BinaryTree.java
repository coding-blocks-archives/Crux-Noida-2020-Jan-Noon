package com.company.Lec24;

import java.util.Scanner;

public class BinaryTree {

    private Node root;

    public void insert(Scanner s){
        this.root = insert(root,s);
    }

    private Node insert(Node node, Scanner s) {

        if(node == null){
            System.out.println("Enter the value");
            int val = s.nextInt();
            return new Node(val);
        }

        System.out.println("Enter the direction");
        String dir = s.next();

        if(dir.equals("left")){
            node.left = insert(node.left,s);
        }
        else{
            node.right = insert(node.right,s);
        }

        return node;
    }

    public void display(){
        display(this.root,"");
    }

    private void display(Node node, String indent) {

        if(node==null){
            return;
        }

        System.out.println(indent+node.value);
        display(node.left, indent+"\t");
        display(node.right, indent+"\t");
    }

    public void postorder(){
        postorder(root,"");
    }

    private void postorder(Node node, String indent) {

        if(node==null){
            return;
        }

        postorder(node.left,indent+"\t");
        postorder(node.right,indent+"\t");

        System.out.println(node.value);

    }

    public int height(){
       return height(root);
    }

    private int height(Node node) {

        if(node==null){
            return 0;
        }

        return 1+Math.max(height(node.left),height(node.right));
    }


    class Node{

        int value;
        Node left;
        Node right;

        public Node(int value) {
            this.value = value;
        }
    }

}
