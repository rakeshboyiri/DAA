public class fibtabulation {
    public static void main(String[] args) {
        int n = 6,i;
        int val[] = new int[n+1];
        for(i=0;i<n+1;i++){
            val[i]=-1;
        }
        fib(n, val);
        for( i=0;i<=n;i++){
            
            System.out.println(val[i]);
        }
        
        
    }

    public static void fib(int n,int val[]){
        
        for(int i = 0;i<=n;i++){            
             
            if(i==0 || i==1){
                val[i] = 1;
            }else{

            val[i] = val[i-1]+val[i-2];
            }
        
    }
}

}
