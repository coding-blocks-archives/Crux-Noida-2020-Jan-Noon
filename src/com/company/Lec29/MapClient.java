package com.company.Lec29;

public class MapClient {

    public static void main(String[] args) {

        AdjacenyMapGraph<String> map = new AdjacenyMapGraph<>();
        map.addVertex("A");
        map.addVertex("B");
        map.addVertex("C");
        map.addVertex("D");

        map.addEdgeweight("A","B",4);
        map.addEdgeweight("B","C",2);
        map.addEdgeweight("C","D",1);
        map.addEdgeweight("A","D",2);

        AdjacenyMapGraph<String> mapGraph = map.Kruskal();

        mapGraph.display();
    }
}
