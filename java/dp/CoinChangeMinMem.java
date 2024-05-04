public class CoinChangeMinMem {
    int arr[][];
    int wt[];
    public CoinChangeMinMem(int n,int w,int wt[]){
        arr = new int[n+1][w+1];
        this.wt = wt;
        for(int i=0;i<=n;i++){
            for(int j=0;j<=w;j++){
                arr[i][j] = -1;
            }
        }
    }
    public static void main(String[] args) {
        int n = 4;
        int arr[] = {9,6,5,1};
        int w = 11 ;
        int a = new CoinChangeRecMin(arr).coinChangeMin(n, w);
        System.out.println(a);
        
    }

    public int coinChangeMin(int n,int w){
        if(arr[n][w]!=-1) return arr[n][w];
        if(w==0){
            return arr[n][0] =  0;
        }
        if(n==0){
            return arr[n][w] =  Integer.MAX_VALUE-1000;
        }
        if(w>=wt[n-1]){
            return arr[n][w] = Math.min(1+coinChangeMin(n, w-wt[n-1]),coinChangeMin(n-1, w));
        }else{
            return arr[n][w] =  coinChangeMin(n-1, w);
        }
    }
}
