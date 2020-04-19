package com.company.Lec25;

public class BSTclient {

    public static void main(String[] args) {

        BinarySearchTree tree = new BinarySearchTree();
        tree.insert(5);
        tree.insert(3);
        tree.insert(6);
        tree.insert(2);
        tree.insert(4);
//        tree.display();
        tree.inrange(2,6);
//        System.out.println(tree.successor(100));
//        tree.inorder();
    }
}
