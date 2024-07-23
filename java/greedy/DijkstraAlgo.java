public class DijkstraAlgo {
    public static void main(String[] args) {

    int V = 9;
    int parent[] = new int[V];
    int cost[] = new int[V];
    int visited[] = new int[V];

    for(int i=0;i<V;i++){

        parent[i] = -1;
        cost[i] = Integer.MAX_VALUE;
        visited[i] = 0;
    }

    int graph[][] = { { 0, 4, 0, 0, 0, 0, 0, 8, 0 },
    { 4, 0, 8, 0, 0, 0, 0, 11, 0 },
    { 0, 8, 0, 7, 0, 4, 0, 0, 2 },
    { 0, 0, 7, 0, 9, 14, 0, 0, 0 },
    { 0, 0, 0, 9, 0, 10, 0, 0, 0 },
    { 0, 0, 4, 14, 10, 0, 2, 0, 0 },
    { 0, 0, 0, 0, 0, 2, 0, 1, 6 },
    { 8, 11, 0, 0, 0, 0, 1, 0, 7 },
    { 0, 0, 2, 0, 0, 0, 6, 7, 0 } };

// Function call
dijkstra(graph, 0,V,visited,cost,parent);
    
}

static void dijkstra(int graph[][],int src,int V,int visited[],int cost[],int parent[]){
    int k = V;
    parent[src]=src;
    cost[src]=0;
    visited[src]=1;
    while(k>0){
        int i = findMin(cost,visited,V);
        for(int j=0;j<V;j++){
            if(graph[i][j]!=0 && visited[j]!=1){
                if(cost[j]>cost[i]+graph[i][j]){
                    cost[j] = cost[i]+graph[i][j];
                    parent[j] = i;
                }
            }
        }
        visited[i] = 1;
        k--;
    }
    print(graph,parent,V);


}

static int findMin(int cost[],int visited[],int V){
    int min = Integer.MAX_VALUE;
    int min_index = -1;
    for(int i=0;i<V;i++){
        if(cost[i]<min && visited[i]!=1){
            min = cost[i];
            min_index = i;
        }
    }
    return min_index;

}

static void print(int graph[][],int parent[],int V){
    for(int i=1;i<V;i++){
        System.out.println(parent[i]+" "+i+" "+graph[i][parent[i]]);
    }
}
}
