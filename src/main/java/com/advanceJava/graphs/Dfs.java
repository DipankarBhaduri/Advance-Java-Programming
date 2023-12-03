package com.advanceJava.graphs;

import java.util.ArrayList;

public class Dfs {
    public static void depthFirstSearch(ArrayList<Edge>[]graph, int curr, Boolean[] visited) {
        System.out.print(curr+" ");
        visited[curr] = true;

        for(int i = 0; i < graph[curr].size(); i++) {
            Edge e = graph[curr].get(i);
            if(!visited[e.dest]) {
                depthFirstSearch(graph, e.dest, visited);
            }
        }
    }

    public static void main(String[] args) {
        int v = 7;
        CreateAGraph createAGraph = new CreateAGraph();
        Boolean [] visited = new Boolean[v];
        for(int i = 0; i < visited.length; i++) {
            visited[i] = false;
        }
        ArrayList<Edge>[] graph = new ArrayList[v];
        createAGraph.create(graph);
        depthFirstSearch(graph, graph[0].get(0).src, visited);
    }
}
