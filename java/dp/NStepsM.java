public class NStepsM {
    int nn;
    int a[];
    public NStepsM(int n){
        this.nn = n;
        a = new int[n+1];
        for(int i=0;i<=n;i++){
            a[i] = -1;
        }
    }
    public static void main(String[] args) {
        int n = 4;
        NStepsM nsm = new NStepsM(n);
        System.out.println(nsm.steps(n));
    }

    public  int  steps(int n){
        if(n<0) return 0;
        if(a[n]!=-1) return a[n];        
        if(n==0){
            return a[n] = 1;
        }

        return a[n] = steps(n-1) + steps(n-2);
    }
}
