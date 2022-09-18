

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.LinkedList;

public class Graph {
    private int V; // No. of vertices in graph.

    private LinkedList<Integer>[] adj; // Adjacency List
    // representation

    ArrayList<ArrayList<Integer> > components = new ArrayList<>();

    @SuppressWarnings("unchecked") Graph(int v) {
        V = v;
        adj = new LinkedList[v];
        for (int i = 0; i < v; i++)
            adj[i] = new LinkedList();
    }

    void addEdge(int u, int w)
    {
        adj[u].add(w);
        adj[w].add(u); // Undirected Graph.
        System.out.println(Arrays.toString(adj));
    }

    void DFSUtil(int v, boolean[] visited, ArrayList<Integer> al) {
        visited[v] = true;
        al.add(v);
        System.out.print(v + " ");
        Iterator<Integer> it = adj[v].iterator();

        while (it.hasNext()) {
            int n = it.next();
            if (!visited[n])
                DFSUtil(n, visited, al);
        }
    }

    void DFS() {
        boolean[] visited = new boolean[V];

        for (int i = 0; i < V; i++) {
            ArrayList<Integer> al = new ArrayList<>();
            if (!visited[i]) {
                DFSUtil(i, visited, al);
                components.add(al);
            }
        }
    }

    int ConnecetedComponents() { return components.size(); }
}
class Dang {
    public static void main(String[] args)
    {
        Graph g = new Graph(6);
        g.addEdge(1, 5);
        g.addEdge(0, 2);
        g.addEdge(2, 4);
        System.out.println("Graph DFS:");
        g.DFS();
        System.out.println(
                "\nNumber of Conneceted Components: "
                        + g.ConnecetedComponents());
    }

}
