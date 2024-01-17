import java.util.ArrayList;

public class HasPath {
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
        graph[0].add(new Edge(0, 1));
        graph[0].add(new Edge(0, 2));
        graph[1].add(new Edge(1, 0));
        graph[1].add(new Edge(1, 3));
        graph[2].add(new Edge(2, 0));
        graph[2].add(new Edge(2, 4));
        graph[3].add(new Edge(3, 1));
        graph[3].add(new Edge(3, 5));
        graph[4].add(new Edge(4, 2));
        graph[4].add(new Edge(4, 5));
        graph[5].add(new Edge(5, 4));
        graph[5].add(new Edge(5, 3));
        graph[6].add(new Edge(6, 5));
    }
    public static boolean hasPath(ArrayList<Edge> [] graph,int src,int dest,boolean visit[]){
        if(src==dest){
            return true;
        }
        visit[src] = true;
        for(int i=0;i<graph[src].size();i++){
            Edge e = graph[src].get(i);
            if(!visit[e.dest] && hasPath(graph, e.dest, dest, visit)){
                return true;
            }
        }
        return false;
    }
    public static void main(String[] args) {
        int v =7;
        ArrayList<Edge> graph[] = new ArrayList[v];
        crateGraph(graph);
        System.out.println(hasPath(graph, 0, 9,new boolean[v]));
    }
}
