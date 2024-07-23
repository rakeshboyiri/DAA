public class OBST {

    public static void main(String[] args) {
        int frequnecyyArray[] = {10, 20, 30, 40, 50};
        OptimalBinaySearchTree(frequnecyyArray,1,frequnecyyArray.length);


    }

    public static int OptimalBinaySearchTree(int frequnecyyArray[],int i,int j){
        if(i==j){
           return frequnecyyArray[i];
        }else{
            int min = Integer.MAX_VALUE;
            for(int k=i;k<j;k++){
                int val = OptimalBinaySearchTree(frequnecyyArray,i,k-1) + OptimalBinaySearchTree(frequnecyyArray,k+1,j) + sum(frequnecyyArray,i,j);
                if(val<min){
                    min = val;
                }
            }
            return min;
        }
       
    }

    public static int sum(int frequnecyyArray[],int i,int j){
        int sum = 0;
        for(int k=i;k<=j;k++){
            sum+=frequnecyyArray[k];
        }
        return sum;
    }

}