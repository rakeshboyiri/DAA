class McmMem{
    public static void main(String[] args) {
        int a[] = {1,2,3,4,3};
        int dp[][] = new int[a.length][a.length];
        for(int i=0;i<a.length;i++){
            for(int j=0;j<a.length;j++){
                dp[i][j]=-1;
            }
        } 
        int val = mcm(1,a.length-1,a,dp);
        System.out.println(val);
    }

    static int mcm(int i,int j,int a[],int dp[][]){
        if(dp[i][j]!=-1)return dp[i][j];
        if(i==j) return dp[i][j] = 0;
        int min = Integer.MAX_VALUE;
        for(int k=i;k<j;k++){
            int val = mcm(i,k,a,dp)+mcm(k+1,j,a,dp)+(a[i-1])*(a[k])*(a[j]);
            if(val<min){
                min = val;
            }
        }
        return dp[i][j] =  min;
    }
}