package graphs;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;

public class Bfs {
    public static void breadthFirstSearch() {
        int v = 7;
        ArrayList<Edge>[] graph = new ArrayList[v];
        CreateAGraph createAGraph = new CreateAGraph();
        createAGraph.create(graph);

        Queue<Integer> queue = new LinkedList<>();
        Boolean[] visited = new Boolean[v];
        for(int i = 0; i < visited.length; i++) {
            visited[i] = false;
        }
        queue.add(0);

        while(!queue.isEmpty()) {
            int curr = queue.remove();
            if(!visited[curr]) {
                System.out.print(curr+" ");
                visited[curr] = true;
                for(int i = 0; i < graph[curr].size(); i++) {
                    Edge e = graph[curr].get(i);
                    queue.add(e.dest);
                }
            }
        }
    }

    public static void main(String[] args) {
        breadthFirstSearch();
    }
}
