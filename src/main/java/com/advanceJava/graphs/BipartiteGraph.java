package com.advanceJava.graphs;

import java.util.*;

public class BipartiteGraph {
    public static void main(String[] args) {
        // Initialization the graph with 7 nodes & create a graph,
        ArrayList<Edge>[] graph = new ArrayList[5];
        CreateAGraph createAGraph = new CreateAGraph();
        createAGraph.create(graph);

        // Call checkBipartiteGraphOrNot function & this function will return boolean,
        boolean ans = checkBipartiteGraphOrNot(graph);

        // Print the ans which we are reseveing from checkBipartiteGraphOrNot function,
        System.out.println("The graph is Bipartite : "+ans);
    }
    private static boolean checkBipartiteGraphOrNot(ArrayList<Edge>[] graph) {
        // Creating a integer array and initilizing with -1 value with the all indexes,
        int[] color = new int[graph.length];
        for(int i = 0; i < graph.length; i++) {
            color[i] = -1;
        }

        // Using BFS so using Queue Data Structure & adding the first nodes,
        Queue<Integer> queue = new LinkedList<>();
        queue.add(graph[0].get(0).src);

        for(int i = 0; i < graph.length; i++) {
            if(color[i] == -1) {
                queue.add(i);
                color[i] = 1; // yellow
                while (!queue.isEmpty()) {
                    int curr = queue.remove();
                    for(int j = 0; j < graph[curr].size(); j++) {
                        Edge edge = graph[curr].get(j);
                        if(color[edge.dest] == -1) {
                            int nextCol = (color[curr] == 1) ? 0 : 1;
                            queue.add(edge.dest);
                            color[edge.dest] = nextCol;
                        } else if (color[edge.dest] == color[curr]) {
                            return false;
                        }
                    }
                }
            }
        }
        return true;
    }
}
