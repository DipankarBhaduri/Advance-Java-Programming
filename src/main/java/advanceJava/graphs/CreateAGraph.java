package advanceJava.graphs;

import java.util.ArrayList;

public class CreateAGraph {
    public void create(ArrayList<Edge>[] graph) {
        for(int i = 0; i < graph.length; i++) {
            graph[i] = new ArrayList<>();
        }

        //                   0
        //                  / \
        //                 1  2
        //                 |  |
        //                 3--4

        // 0th Index
        graph[0].add(new Edge(0, 1, 0));
        graph[0].add(new Edge(0, 2, 0));

        // 1st Index
        graph[1].add(new Edge(1, 3, 0));
        graph[1].add(new Edge(1, 0, 0));

        // 2nd Index
        graph[2].add(new Edge(2, 4, 0));
        graph[2].add(new Edge(2, 0, 0));

        // 3rd Index
        graph[3].add(new Edge(3, 4, 0));
        graph[3].add(new Edge(3, 1, 0));
//        graph[3].add(new Edge(3, 5, 0));

        // 4th Index
        graph[4].add(new Edge(4, 2, 0));
//        graph[4].add(new Edge(4, 3, 0));
        graph[4].add(new Edge(4, 3, 0));

//        // 5th Index
//        graph[5].add(new Edge(5, 3, 0));
//        graph[5].add(new Edge(5, 4, 0));
//        graph[5].add(new Edge(5, 6, 0));
//
////        // 6th Index
//        graph[6].add(new Edge(6, 5, 0));
    }
}
