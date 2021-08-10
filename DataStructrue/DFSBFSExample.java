import java.util.*;

public class DFSBFSExample{
    public class Graph{
        int n = 0; //정점의 개수
        HashMap<Integer,ArrayList<Integer>> adj = new HashMap<>(); //인접 리스트
        HashMap<Integer,Boolean> visited = new HashMap<>(); //방문 여부 저장

        Graph(){};
        Graph(int n){
            this.n = n;
            for(int i = 0;i < n;i++){
                adj.put(i,new ArrayList<>());
                visited.put(i,false);
            }
        }
        void addOneWayEdge(int start,int end){
            ArrayList<Integer> adjVal = adj.get(start);
            adjVal.add(end);
            adj.put(start, adjVal);
        }
        void addEdge(int start, int end){
            addOneWayEdge(start, end);
            addOneWayEdge(end, start);
        }
        int dfs0(int curr){
            int nodes = 1;
            visited.put(curr,true);
            System.out.printf("node %d was visited\n",curr);
            for(int next:adj.get(curr)){
                if(!visited.get(next)){
                    nodes += dfs0(next);
                }
            }
            return nodes;
        }
        void bfs(){
            visited.forEach((k,v) -> v = false);
            Queue<Integer> q = new LinkedList<>();
            q.add(0);
            visited.put(0,true);
            //탐색 시작
            int level = 0;
            while(!q.isEmpty()){
                int qSize = q.size();
                System.out.printf("------ level %d ------\n",level);
                for(int i = 0;i < qSize;i++){
                    int curr = q.poll();
                    System.out.printf("node %d was visited\n",curr);
                    for(int next:adj.get(curr)){
                        if(!visited.get(next)){
                            visited.put(next,true);
                            q.add(next);
                        }
                    }
                }
                level++;
            }
        }
        int getComponents(){
            int components = 0;
            visited.forEach((k,v) -> v = false);
            for(int i = 0;i < visited.size();i++){
                if(!visited.get(i)){
                    System.out.println("-- new DFS begins --");
                    int nodes = dfs0(i);
                    components++;
                    System.out.printf("size is %d\n",nodes);
                }
            }
            return components;
        }
    }
    public static void main(String[] args) {
        DFSBFSExample example = new DFSBFSExample();
        Graph G = example.new Graph(9);
        G.addEdge(0, 1);
        G.addEdge(0, 2);
        G.addEdge(1, 3);
        G.addEdge(1, 5);
        G.addEdge(3, 4);
        G.addEdge(4, 5);
        G.addEdge(2, 6);
        G.addEdge(2, 8);
        G.addEdge(6, 7);
        G.addEdge(6, 8);
        G.bfs();
    }
}
