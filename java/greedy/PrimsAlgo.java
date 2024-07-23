public class PrimsAlgo {

    public static void main(String[] args) {
        int V = 5;
        int parent[] = new int[V];
        int visited[] = new int[V];
        for(int i=0;i<V;i++){
            parent[i] = -1;
            visited[i] = 0;
        }
        int graph[][] = { { 0, 2, 0, 6, 0 },
        { 2, 0, 3, 8, 5 },
        { 0, 3, 0, 0, 7 },
        { 6, 8, 0, 0, 9 },
        { 0, 5, 7, 9, 0 } };


        primsAlgo(graph,V,parent,visited);
        print(graph, parent, V);
    }
    static void primsAlgo(int graph[][],int V,int parent[],int visited[]){

        visited[0] = 1;
        parent[0] = 0;
        int k = V;
        int u=-1,v=0;
        while(k>1){
            int min = Integer.MAX_VALUE;
           
            for(int i=0;i<V;i++){
                if(visited[i]==1){
                    for(int j=0;j<V;j++){
                        if(visited[j]==0 && graph[i][j]!=0){
                            if(graph[i][j]<min){
                                min = graph[i][j];
                                u = i;
                                v = j;
                            }
                        }
                    }
                }
            }
            visited[v] = 1;
            k--;
            parent[v] = u;
        }   
       
        
    }   
    static void print(int graph[][],int parent[],int V){

        for(int i=1;i<V;i++){
            System.out.println(parent[i]+" "+i+" "+graph[i][parent[i]]);
        }
    }
}