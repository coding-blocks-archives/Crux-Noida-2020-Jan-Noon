package com.company.Lec26;

public class HeapClient {

    public static void main(String[] args) throws Exception {

        Heaps heap = new Heaps();
        heap.insert(5);
        heap.insert(2);
        heap.insert(1);
        heap.display();

        System.out.println(heap.remove());
        heap.display();
        System.out.println(heap.remove());
        heap.display();
    }
}
