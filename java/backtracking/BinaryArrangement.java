import java.util.Scanner;;

public class BinaryArrangement {
    int n ;
    public BinaryArrangement(int n){
        this.n = n;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number of bin digits : ");
       int n = sc.nextInt();   
       char bin_arr[] = new char[n];
        new BinaryArrangement(n).bin(bin_arr,0);
        
        
    }
    public  void bin(char bin_arr[],int pos){
        if(pos==n){
            System.out.println(bin_arr);
            
            return;
        }
        for(int i =0;i<2;i++){
            bin_arr[pos] = Character.forDigit(i, 10);
                bin(bin_arr,pos+1); 
            }
          
        }
    
}
