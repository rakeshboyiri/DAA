public class fibonacci {
    public static void main(String[] args) {
        int n = 5;
        for(int i=0;i<n;i++){
            System.out.println(fib(i));
        }
        
    }

    public static int fib(int n){
        if(n==0 || n==1) return 1;

        return fib(n-1)+fib(n-2);
        
    }
}
