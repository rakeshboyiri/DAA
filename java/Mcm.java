class Mcm{
    public static void main(String[] args) {
        int a[] = {1,2,3,4,3};
        int val = mcm(1,a.length-1,a);
        System.out.println(val);
    }

    static int mcm(int i,int j,int a[]){
        if(i==j) return 0;
        int min = Integer.MAX_VALUE;
        for(int k=i;k<j;k++){
            int val = mcm(i,k,a)+mcm(k+1,j,a)+(a[i-1])*(a[k])*(a[j]);
            if(val<min){
                min = val;
            }
        }
        return min;
    }
}