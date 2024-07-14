public class McmTab {
    
    public static void main(String[] args) {
        int a[] = {1,2,3,4,3};
        int dp[][] = new int[a.length][a.length];
        int val = mcm(a,dp);
        System.out.println(val);
    }

    static int mcm(int a[],int [][]dp){
        for(int k=0;k<a.length-1;k++){
            for(int i=1;i<=a.length-k-1;i++){
                
                int  j = i+k;
                if(i==j){ dp[i][j]=0;
                            continue;
                }
                int min = Integer.MAX_VALUE;    
                for(int l=i;l<=j-1;l++){
                    int val = dp[i][l] + dp[l+1][j] + a[i-1]*a[l]*a[j];
                    if(val<min){
                        min = val;
                    }
                }
                dp[i][j] = min;
            }
            
        }
        return dp[1][a.length-1];
    }
}
