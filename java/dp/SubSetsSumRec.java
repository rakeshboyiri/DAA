public class SubSetsSumRec {
    int wt[];
    int n;
    public SubSetsSumRec(int wt[],int n){
        this.wt=wt;
        this.n=n;
    }
    public static void main(String[] args) {
        int n = 4;
        int wt[] = {1,2,3,3};
        int s =    6;
        int  no = new SubSetsSumRec(wt, n).subSet(n, s);
        System.out.println(no);
    }
    public int subSet(int n,int s){
        if(s==0)
        return 1;
        if(n==0) return 0;
        if(wt[n-1]<=s){
            return subSet(n-1, s-wt[n-1])+subSet(n-1, s);
        }else{
            return subSet(n-1, s);
        }
    }
}
