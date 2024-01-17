import java.util.ArrayList;

public class Dfs {
    static class Edge{
        int src;
        int dest;
        Edge(int s,int d){
            this.src = s;
            this.dest = d;
        }
    }
    public static void crateGraph(ArrayList<Edge> [] graph){
        for(int i=0;i<graph.length;i++){
            graph[i] = new ArrayList<>();
        }
        // 0- vertices
        graph[0].add(new Edge(0, 1));
        graph[0].add(new Edge(0, 2));
        // 1- vertices
        graph[1].add(new Edge(1, 3));
        graph[1].add(new Edge(1, 0));
        // 2- vertices
        graph[2].add(new Edge(2, 0));
        graph[2].add(new Edge(2, 4));
        // 3- vertices
        graph[3].add(new Edge(3, 1));
        graph[3].add(new Edge(3, 4));
        graph[3].add(new Edge(3, 5));
        // 4- vertices
        graph[4].add(new Edge(4, 2));
        graph[4].add(new Edge(4, 3));
        graph[4].add(new Edge(4, 5));
        // 5- vertices
        graph[5].add(new Edge(5, 3));
        graph[5].add(new Edge(5, 4));
        graph[5].add(new Edge(5, 6));
        // 6- vertices
        graph[6].add(new Edge(6, 5));
    }
    public static void dfs(ArrayList<Edge> []graph ,int curr,boolean visit[]){
        // visit
        System.out.print(curr+" ");
        visit[curr] = true;
        for(int i=0;i<graph[curr].size();i++){
            Edge e = graph[curr].get(i);
            if(!visit[e.dest]){
                dfs(graph, e.dest, visit);
            }
        }
    }
    public static void main(String[] args) {
        int v = 7;
        ArrayList<Edge> [] graph = new ArrayList[v];
        crateGraph(graph);
        dfs(graph, 0, new boolean[v]);
    }
}
