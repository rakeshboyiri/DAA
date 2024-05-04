public class NSteps {
    
    public static void main(String[] args) {
        int n = 4;
        System.out.println(steps(n));
    }
    public static int  steps(int n){
        if(n==0){
            return 1;
        }
        if(n<0) return 0;

        return steps(n-1) + steps(n-2);
    }
}
