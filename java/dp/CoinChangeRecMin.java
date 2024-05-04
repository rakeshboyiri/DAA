

public class CoinChangeRecMin{
    int wt[];
    CoinChangeRecMin(int wt[]){
        this.wt = wt;

    }

    public static void main(String args[]){
        int n = 4;
        int arr[] = {9,6,5,1};
        int w = 11 ;
        int a = new CoinChangeRecMin(arr).coinChangeMin(n, w);
        System.out.println(a);


    }

    public int coinChangeMin(int n,int w){
        if(w==0){
            return 0;
        }
        if(n==0){
            return Integer.MAX_VALUE-1000;
        }
        if(w>=wt[n-1]){
            return Math.min(1+coinChangeMin(n, w-wt[n-1]),coinChangeMin(n-1, w));
        }else{
            return coinChangeMin(n-1, w);
        }
    }
}