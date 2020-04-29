package com.company.Lec29;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

public class AdjacenyMapGraph<T> {

    Map<T,Vertex> vertexMap = new HashMap<>();
    Map<Vertex,Vertex> parent =new HashMap<>();

    public void addVertex(T value){

        vertexMap.put(value, new Vertex(value));
    }

    public void addEdge(T first, T second){

        if(vertexMap.containsKey(first) && vertexMap.containsKey(second)){

            vertexMap.get(first).neighbours.put(vertexMap.get(second),1);
            vertexMap.get(second).neighbours.put(vertexMap.get(first),1);

        }
    }
    public void addEdgeweight(T first, T second, int weight){

        if(vertexMap.containsKey(first) && vertexMap.containsKey(second)){

            vertexMap.get(first).neighbours.put(vertexMap.get(second),weight);
            vertexMap.get(second).neighbours.put(vertexMap.get(first),weight);

        }
    }

    public void setParent(){
        for (Vertex vertex: vertexMap.values()) {
            parent.put(vertex, null);
        }
    }

    public AdjacenyMapGraph<T> Kruskal(){

        setParent();

        AdjacenyMapGraph<T> map = new AdjacenyMapGraph<>();

        ArrayList<Edge> edges = new ArrayList<>();

        for (T vertex:vertexMap.keySet()) {
            map.addVertex(vertex);
        }

        for(Vertex vertex: vertexMap.values()){

            for (Vertex padosi: vertex.neighbours.keySet()) {

                edges.add(new Edge(vertex,padosi,vertex.neighbours.get(padosi)));
            }
        }

        Collections.sort(edges);

        for (Edge e: edges) {

            if(union(e.first,e.second)){
                map.addEdgeweight(e.first.value, e.second.value, e.weight);
            }
        }
        return map;

    }

    public void display(){

        for (Vertex vertex:vertexMap.values()) {

            System.out.print(vertex.value +" => ");

            for (Vertex padosi:vertex.neighbours.keySet()) {

                System.out.print(padosi.value + " ");
            }
            System.out.println();
        }
        System.out.println();
    }

    public boolean union(Vertex first,  Vertex second){

        Vertex f = find(first);
        Vertex s= find(second);

        if(f!=s){
            parent.put(f,s);
            return true;
        }

        return false;
    }

    private Vertex find(Vertex vertex) {

        while(parent.get(vertex)!=null){
            vertex= parent.get(vertex);
        }

        return vertex;
    }

    class Edge implements Comparable<Edge>{

        Vertex first;
        Vertex second;
        Integer weight;

        public Edge(Vertex first, Vertex second, Integer weight) {
            this.first = first;
            this.second = second;
            this.weight = weight;
        }

        @Override
        public int compareTo(Edge o) {
            return this.weight-o.weight;
        }
    }

    class Vertex{

        T value;
        Map<Vertex,Integer> neighbours;

        public Vertex(T value) {
            this.value = value;
            this.neighbours =new HashMap<>();
        }
    }


}
