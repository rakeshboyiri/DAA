public class Test {
    int weights[] ;
    int rates[];
    public Test(int weights[],int rates[]){
        this.weights = weights;
        this.rates = rates;
    }
    public static void main(String args[]){
        int n  = 4;
        int maxWeight = 8;
        int arr1[] = {3,2,5,4};
        int arr2[] = {26,16,45,40};
        Test t1 = new Test(arr1,arr2);
        System.out.println(t1.ks(n, maxWeight));
    }
    public  int ks(int n ,int maxWeight){
        if(n==0 || maxWeight==0 ){
            return 0;
        }
        if(weights[n-1]<=maxWeight){
            return Math.max(rates[n-1]+ks(n-1, maxWeight-weights[n-1]), ks(n-1, maxWeight));
        }else{
            return ks(n-1, maxWeight);
        }
        
    }
}
