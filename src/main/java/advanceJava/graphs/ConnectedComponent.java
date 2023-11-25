package advanceJava.graphs;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;

public class ConnectedComponent {
    public static void main(String[] args) {
        int v = 7;
        ArrayList<Edge>[] graph = new ArrayList[v];
        CreateAGraph aGraph = new CreateAGraph();
        aGraph.create(graph);

        boolean[] visited = new boolean[v];
        for(int i = 0; i < graph.length; i++) {
            if(!visited[graph[i].get(0).src]) {
                depthFirstSearch(graph, graph[i].get(0).src, visited);
            }
        }
    }

    public static void breadthFirstSearch(ArrayList<Edge>[] graph, int curr, boolean[] visited) {
        Queue<Integer> queue = new LinkedList<>();
        queue.add(curr);

        while (!queue.isEmpty()) {
            int removedNumber = queue.remove();
            if(!visited[removedNumber]) {
                System.out.print(removedNumber + " ");
                visited[removedNumber] = true;

                for (int i = 0; i < graph[removedNumber].size(); i++) {
                    Edge edge = graph[removedNumber].get(i);
                    if (!visited[edge.dest]) {
                        queue.add(edge.dest);
                    }
                }
            }
        }
    }

    public static void depthFirstSearch(ArrayList<Edge>[] graph, int curr, boolean[] visited) {
        System.out.print(curr+" ");
        visited[curr] = true;

        for(int i = 0; i < graph[curr].size(); i++) {
            Edge edge = graph[curr].get(i);
            if(!visited[edge.dest]) {
                depthFirstSearch(graph, edge.dest, visited);
            }
        }
    }
}
