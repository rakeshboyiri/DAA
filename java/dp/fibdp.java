public class fibdp {
    public static void main(String[] args) {
        int n = 5,i;
        int val[] = new int[n+1];
        for(i=0;i<n+1;i++){
            val[i]=-1;
        }
        for( i=0;i<=n;i++){
            System.out.println(fib(i,val));
            
        }
        
        
    }

    public static int fib(int n,int val[]){
        

        if(val[n]!=-1){
            return val[n];
        }
        if(n==0 || n==1)
        return val[n] = 1;

        return val[n] = fib(n-1,val)+fib(n-2,val);
        
    }
}
