package com.company.Lec28;

public class GrapgClient {

    public static void main(String[] args) {

        GraphpusingAdjacencyList<String> graph = new GraphpusingAdjacencyList<>();

        graph.addVertex("A");
        graph.addVertex("B");
        graph.addVertex("C");
        graph.addVertex("D");
        graph.addVertex("E");
        graph.addVertex("F");
        graph.addEdge("A","B");
        graph.addEdge("C","D");
        graph.addEdge("A", "C");

//
//        graph.display();
////        graph.BFT();
//        graph.DFT();

        graph.connectedcomponents();

    }
}
