public class NQuuen {
    private int n;
    private int count = 0;
    private NQuuen(int n){
        this.n = n;
    }
    public static void main(String[] args) {
        int n = 5;
        int a[] = new int[n];
        NQuuen quuen = new NQuuen(n);
        quuen.fill(a, 0);
        System.out.println("No of possibilities for "+n+" Queens = "+quuen.count);
    }
    private void fill(int a[],int k){
        if(k==n){
            print(a);
        }
        for(int i =0 ;i<n;i++){
            if(isSafe(i,k,a)){
                a[k] = i;
                fill(a, k+1);
            }
        }
    }
    private boolean isSafe(int i,int k,int a[]){
        for(int j = 0;j<k;j++){
            if(i==a[j]){
                return false;
            }
            if(Math.abs(k-j)==Math.abs(i-a[j])){
                return false;
            }
        }

        return true;
    }
    private void print(int a[]){
        for(int i = 0;i<n;i++){
            System.out.print(a[i]+" ");
        }
        System.out.println();
        count++;
    }
}
