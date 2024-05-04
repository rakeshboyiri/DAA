public class CoinChangeMInTab {
    int wt[];
    public CoinChangeMInTab( int wt[]){

        this.wt = wt;
    }
    public static void main(String[] args) {
        int n = 4;
        int wt[] = {9,6,5,1};
        int w = 11 ;
        int a = new CoinChangeMInTab(wt).coinChangeMin(n, w);
        System.out.println(a);
    }

    public int coinChangeMin(int n,int w){
        int arr[][] = new int[n+1][w+1];
        for(int i=0;i<=n;i++){
            for(int j=0;j<=w;j++){
               if(j==0){ arr[i][j] = 0; continue;}
               if(i==0){ arr[i][j] = Integer.MAX_VALUE-1000; continue;}

               if(wt[i-1]<=j){
                arr[i][j] = Math.min(1+arr[i][j-wt[i-1]], arr[i-1][j]);
               }
               else{
                arr[i][j] = arr[i-1][j];
               }
            }
        }
        return arr[n][w];

        
    }
}
