package graphs;

import java.util.ArrayList;

public class HasPathUsingRecursion {
    public static void main(String[] args) {
        int v = 7;
        ArrayList<Edge>[] graph = new ArrayList[v];
        CreateAGraph createAGraph = new CreateAGraph();
        createAGraph.create(graph);

        boolean[] visited = new boolean[v];
        for(int i = 0; i < visited.length; i++){
            visited[i] = false;
        }

        boolean ans = hasPath(graph, 1, 7, visited);
        System.out.println("The path is exists in between 1 & 7 is : "+ans);
    }

    public static boolean hasPath (ArrayList<Edge>[] graph, int src, int target, boolean[] visited) {
        if(src == target) {
            return true;
        }

        visited[src] = true;
        for(int i = 0; i < graph[src].size(); i++) {
            Edge edge = graph[src].get(i);
            if(!visited[edge.dest] && hasPath(graph, edge.dest, target, visited)) {
                return true;
            }
        }
        return false;
    }
}
