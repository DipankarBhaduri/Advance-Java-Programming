package graphs;

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
        // Creating a boolean array to maintain visited nodes & initializing with default value,
        boolean[] visited = new boolean[graph.length];
        for(int i = 0; i < graph.length; i++) {
            visited[i] = false;
        }

        // Using BFS so using Queue Data Structure & adding the first nodes,
        Queue<Integer> queue = new LinkedList<>();
        queue.add(graph[0].get(0).src);

        // Using two sets to check bipartite or Not this graph,
        Set<Integer> uSet = new HashSet<>();
        Set<Integer> vSet = new HashSet<>();

        while(!queue.isEmpty()) {
            int curr = queue.remove();
            visited[curr] = true;

            for(int i = 0; i < graph[curr].size(); i++) {
                Edge edge = graph[curr].get(i);

                int dest = edge.dest;
                if(!uSet.contains(curr) && !vSet.contains(dest)) {
                    uSet.add(curr);
                    vSet.add(dest);
                } else if (uSet.contains(curr) || vSet.contains(curr)) {
                    if(!uSet.contains(dest) && uSet.contains(curr)){
                        vSet.add(dest);
                    } else if (!vSet.contains(dest) && vSet.contains(curr)) {
                        uSet.add(dest);
                    } else {
                        return false;
                    }
                }

                if(!visited[dest]) {
                    queue.add(dest);
                }
            }
        }
        return true;
    }
}
