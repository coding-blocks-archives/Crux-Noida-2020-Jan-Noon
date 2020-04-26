package com.company.Lec28;

import java.util.*;

public class GraphpusingAdjacencyList<T> {


    LinkedList<Vertex> vertices;

    public GraphpusingAdjacencyList() {
        this.vertices = new LinkedList<>();
    }

    public void addVertex(T value){

        vertices.add(new Vertex(value));

    }

    public void addEdge(T first, T second){

        Vertex f= get(first);
        Vertex s= get(second);

        if(f!=null && s!=null){
            f.neighbours.add(s);
            s.neighbours.add(f);
        }
    }

    public void BFT(){

        Queue<Vertex> queue = new LinkedList<>();
        Set<Vertex> visited= new HashSet<>();

        Vertex vertex =vertices.get(0);

        queue.add(vertex);
        visited.add(vertex);

        while(!queue.isEmpty()){

            Vertex temp = queue.remove();

            System.out.println(temp.value);

            for (Vertex padosi:temp.neighbours) {

                if(!visited.contains(padosi)){

                    visited.add(padosi);
                    queue.add(padosi);
                }
            }

        }
    }

    public void connectedcomponents(){

        int cnt=0;
        Queue<Vertex> queue = new LinkedList<>();
        Set<Vertex> visited= new HashSet<>();

        for (Vertex vertex:vertices) {

            if(visited.contains(vertex)){
                continue;
            }
            cnt++;

            System.out.println();
        queue.add(vertex);
        visited.add(vertex);

        while(!queue.isEmpty()) {

            Vertex temp = queue.remove();

            System.out.println(temp.value);

            for (Vertex padosi : temp.neighbours) {

                if (!visited.contains(padosi)) {

                    visited.add(padosi);
                    queue.add(padosi);
                }
            }
        }
        }
    }

    public void DFT(){

        Stack<Vertex> stack = new Stack<>();
        Set<Vertex> visited= new HashSet<>();

        Vertex vertex =vertices.get(0);

        stack.push(vertex);
        visited.add(vertex);

        while(!stack.isEmpty()){

            Vertex temp = stack.pop();

            System.out.println(temp.value);

            for (Vertex padosi:temp.neighbours) {

                if(!visited.contains(padosi)){

                    visited.add(padosi);
                    stack.push(padosi);
                }
            }

        }
    }

    public void display(){

        for (Vertex vertex:vertices) {

            System.out.print( vertex.value +" => ");

            for (Vertex padosi:vertex.neighbours) {

                System.out.print(padosi.value + " ");
            }
            System.out.println();
        }
        System.out.println();
    }

    private Vertex get(T val) {

        for (Vertex vertex:vertices) {

            if(vertex.value.equals(val)){
                return vertex;
            }
        }
        return null;
    }

    class Vertex{

        T value;
        LinkedList<Vertex> neighbours;

        public Vertex(T value) {
            this.value = value;
            this.neighbours =  new LinkedList<>();
        }
    }
}
