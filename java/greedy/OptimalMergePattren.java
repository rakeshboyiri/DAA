public class OptimalMergePattren {

    public static void main(String[] args) {
        int arr[] = {5, 10, 20, 30, 30};
        System.out.println(mergePattren(arr));
    }
    public static int mergePattren(int arr[]){
        int sum = 0 ;
        int n = arr.length;
        while(n>1)  {
            int min =arr[0];
            int mi = 0;
            for(int i=1;i<n;i++){
                if(arr[i]<min){
                    min = arr[i];
                    mi = i;
                }
            }
            swap(arr, mi, n-1);
            min =arr[0];
             mi = 0;
            for(int i=1;i<n-1;i++){
                if(arr[i]<min){
                    min = arr[i];
                    mi = i;
                }
            }
            swap(arr, mi, n-2); 
            arr[n-2] = arr[n-2] + arr[n-1];
            sum+=arr[n-2];
            n = n-1;
            
        }
        return  sum;
    }

    public static void swap(int arr[],int i,int j){
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }
}