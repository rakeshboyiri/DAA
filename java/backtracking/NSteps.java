public class NSteps {
    int n;
    int count = 0;
    public NSteps(int n){
        this.n = n;
    }
    public static void main(String[] args) {
        int n = 5;
        int a[] = new int[n];
        NSteps ns = new NSteps(n);
        ns.steps(a, 0);
        System.out.println(ns.count);
    }
    public void steps(int a[],int k){
        if(k==n){
            print(a);
            return;
        }
        for(int i=1;i<3;i++){
            a[k] = i;
            steps(a, k+1);
        }
    }
    public void print(int a[]){
        int sum=0;
        for(int i=0;i<n;i++){
            sum+=a[i];
        }
        if(sum==n){
            count++;
            for(int i=0;i<n;i++){
                System.out.print(a[i]);
            }
            System.out.println();
        }
    }
}
