package com.company.Lec25;

import java.util.LinkedList;
import java.util.Queue;

public class BinarySearchTree {

  private Node root;


    public void insert(int val){
        this.root = insert(root,val);
    }

    private Node insert(Node node, int val) {

        if(node == null){
            return new Node(val);
        }

        if(node.value>val){
            node.left = insert(node.left,val);
        }

        else{
            node.right = insert(node.right,val);
        }

        return node;
    }

    public void display(){
        display(root,"");
    }

    private void display(Node node, String indent) {

        if(node==null){
            return;
        }

        System.out.println(indent+node.value);
        display(node.left, indent+"\t");
        display(node.right, indent+"\t");
    }

    public void inorder(){
        inorder(root);
    }

    private void inorder(Node node) {

        if(node==null){
            return;
        }

        inorder(node.left);
        System.out.println(node.value);
        inorder(node.right);
    }

    public int successor(int val){

        Node succ =null;
        Node curr =root;

        while(curr!=null){

            if(curr.value>val){

                if(succ==null || curr.value<succ.value){
                    succ=curr;
                }

                curr=curr.left;
            }
            else{
                curr=curr.right;
            }
        }

        return succ.value;
    }
    public void inrange(int k1, int k2){
        inrange(root,k1,k2);
    }

    public void inrange(Node node, int k1, int k2){


        if(node==null){
            return;
        }

        if(node.value>k1 && node.value<k2){
            System.out.println(node.value);
        }

        if(node.value>k1){
            inrange(node.left,k1,k2);
        }

        if(node.value<k2){
            inrange(node.right,k1,k2);
        }

    }

    public void makefromsorted(int ar[], int start, int end){

        if(start>end){
            return;
        }

        int mid = (start+end)/2;

        insert(ar[mid]);

        makefromsorted(ar,start,mid-1);
        makefromsorted(ar,mid+1,end);
    }

    public void levelorder(Node node){

        Queue<Node> queue = new LinkedList<>();

        queue.add(root);

        while(!queue.isEmpty()){

            Node temp= queue.remove();
            System.out.println(temp.value);

            if(temp.left!=null){
                queue.add(temp.left);
            }

            if(temp.right!=null){
                queue.add(temp);
            }
        }
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
