public class NStepsTab {
    
    public static void main(String[] args) {
        int n = 4;
        System.out.println(steps(n));
    }
    public static int  steps(int n){
        int a[] = new int[n+1];

        for(int i=0;i<n;i++){
            if(i==0 || i ==1){
                a[i] = 1;
            }else{
                a[i] = a[i-1] + a[i-2];
            }
        }
        return a[n];        
    }
}
