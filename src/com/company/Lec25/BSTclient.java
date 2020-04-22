package com.company.Lec25;

public class BSTclient {

    public static void main(String[] args) {

        GenericBST<String> tree = new GenericBST<>();
        tree.insert("ada");
        tree.insert("aaa");
        tree.insert("aca");

        tree.display();
//        tree.inrange(2,6);
//        System.out.println(tree.successor(5));
//        tree.inorder();

//        int pre[] = {5,3,2,4,6};
//        int in[] ={2,3,4,5,6};
//
//        tree.makefromprein(pre,in);
//        tree.display();


    }
}
