package advanceJava.graphs;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;

public class CycleDetection {
    public static void main(String[] args) {
        // Assume the length of graph is 7 and & creating new graph,
        ArrayList<Edge>[] graph = new ArrayList[4];
        CreateAGraph createAGraph = new CreateAGraph();
        createAGraph.create(graph);

        // Maintaining a boolean array because of don't want to rotate in a cycle,
        boolean [] visited = new boolean[graph.length];
        for(int i = 0; i < visited.length; i++) {
            visited[i] = false;
        }

        // Called the cycleDetection function and print the output,
        boolean cycleDetected = cycleDetection(graph, visited);
        System.out.println(cycleDetected);
    }

    private static boolean cycleDetection(ArrayList<Edge>[] graph, boolean[] visited) {
        // Using for loop to traverse because if any separated undirected graph is present ,
        for(int i = 0; i < graph.length; i++) {

            // If not visited the source then passing the source value to the breadthFirstSearch function,
            if(!visited[graph[i].get(0).src]) {

                // If breadthFirstSearch function return true then cycle exists otherwise not exists,
                if(breadthFirstSearch(graph, graph[i].get(0).src, visited, -1)) {
                    return true;
                }
            }
        }
        return false;
    }

    private static boolean breadthFirstSearch(ArrayList<Edge>[] graph, int curr, boolean[] visited, int immediateParent) {
        // Creating a new queue for traverse the whole graph, immediate
        Queue<Integer> queue = new LinkedList<>();
        queue.add(curr);

        // Using a while loop until complete the traversal of all element,
        while(!queue.isEmpty()) {
            int temp = queue.remove();

            // If temp is not visited then visit that element and check the same for neighbors,
            if(!visited[temp]) {
                visited[temp] = true;
                for(int i = 0; i < graph[temp].size(); i++) {
                    Edge edge = graph[temp].get(i);
                    if(!visited[edge.dest]) {
                        breadthFirstSearch(graph, edge.dest, visited, curr);
                    } else if (edge.dest != immediateParent) {
                        return true;
                    }
                }
            }
        }
        return false;
    }
}
