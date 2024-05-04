
public class SumSubSetTab {
    int wt[] ;
    int n;
    int arr[][];
    public SumSubSetTab(int n,int wt[],int w){
        this.n = n;
        this.wt = wt;
    }
    public static void main(String[] args) {
        int n = 4;
        int wt[] = {1,2,3,3};
        int w =    6;
        int  no = new SubSetsSumRec(wt, n).subSet(n, w);
        System.out.println(no);
    }
    public int sumSubset(int n,int w){
        for(int i=0;i<=n;i++){
            for(int j=0;j<=w;j++){
                if(j==0) {
                    arr[i][j] = 1; continue;
                }
                if(i==0) {
                    arr[i][j] = 0; continue;
                }
                if(j>=wt[i-1]){
                    arr[i][j] = arr[i-1][j-wt[i-1]] + arr[i-1][j];
                }else{
                    arr[i][j] = arr[i-1][j];
                }
            }
        }

        return arr[n][w];
       
    }
}



