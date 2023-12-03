package com.advanceJava.graphs;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;

public class HasPath {
    public static boolean hasPath(int src, int dest) {
        CreateAGraph createAGraph = new CreateAGraph();
        int v = 7;
        ArrayList<Edge>[] graph = new ArrayList[v];
        createAGraph.create(graph);

        Boolean[] visited = new Boolean[v];
        for(int i = 0; i < visited.length; i++) {
            visited[i] = false;
        }

        Queue<Integer> queue = new LinkedList<>();
        queue.add(graph[0].get(0).src);
        boolean hasSrc = false;
        boolean hasDest = false;

        while(!queue.isEmpty()) {
            int curr = queue.remove();

            if(!visited[curr]) {
                if (src == curr) {
                    hasSrc = true;
                }
                if(dest == curr) {
                    hasDest = true;
                }
                if(hasSrc && hasDest) {
                    break;
                }

                visited[curr] = true;
                for(int i = 0; i < graph[curr].size(); i++) {
                    Edge edge = graph[curr].get(i);
                    queue.add(edge.dest);
                }
            }
        }
        return hasSrc && hasDest;
    }
    public static void main(String[] args) {
        boolean b = hasPath(0, 7);
        System.out.println(b);
    }
}
