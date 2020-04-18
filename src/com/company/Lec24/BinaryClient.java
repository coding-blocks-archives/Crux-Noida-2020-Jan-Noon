package com.company.Lec24;

import java.util.Scanner;

public class BinaryClient {

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        BinaryTree tree = new BinaryTree();

        tree.insert(s);
        tree.insert(s);
        tree.insert(s);

        tree.display();
    }
}
