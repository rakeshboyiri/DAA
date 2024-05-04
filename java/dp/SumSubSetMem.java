public class SumSubSetMem {
    int wt[] ;
    int n;
    int arr[][];
    public SumSubSetMem(int n,int wt[],int w){
        this.n = n;
        this.wt = wt;
        for(int i=0;i<=n;i++){
            for(int j=0;j<=w;j++){
                arr[i][j] = -1;
            }
        }
    }
    public static void main(String[] args) {
        int n = 4;
        int wt[] = {1,2,3,3};
        int w =    6;
        int  no = new SubSetsSumRec(wt, n).subSet(n, w);
        System.out.println(no);
    }
    public int sumSubset(int n,int w){
        if(arr[n][w]!=-1) return arr[n][w];
        if(w==0) return arr[n][w] = 1;
        if(n==0) return arr[n][w] = 0;
        if(w<=wt[n-1]){
            return arr[n][w] = sumSubset(n-1, w-wt[n-1])+ sumSubset(n-1, w);
        }else{
            return arr[n][w] = sumSubset(n-1, w);
        }
    }
}
