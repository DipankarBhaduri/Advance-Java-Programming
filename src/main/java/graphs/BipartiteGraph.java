package graphs;

import java.util.ArrayList;

public class BipartiteGraph {
    public static void main(String[] args) {
        // Initialization the graph with 7 nodes & create a graph,
        ArrayList<Edge>[] graph = new ArrayList[7];
        CreateAGraph createAGraph = new CreateAGraph();
        createAGraph.create(graph);

        // Call checkBipartiteGraphOrNot function & this function will return boolean
        checkBipartiteGraphOrNot(graph);
    }
    private static boolean checkBipartiteGraphOrNot(ArrayList<Edge>[] graph) {

    }
}
