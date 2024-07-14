import java.util.Scanner;

public class Permutation{
    String main;
    int n ;
    public Permutation(String main,int n){
        this.main = main;
        this.n = n;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a string : ");
        String str = sc.next();

        char s[] = new char[str.length()];        
        new Permutation(str, str.length()).per(s,0);
        
        
    }
    public  void per(char s[],int pos){
        if(pos==n){
            System.out.println(s);
            return;
        }
        for(int i =0;i<n;i++){
            boolean check = true;
            for(int j=0;j<pos;j++){
                if(main.charAt(i)==s[j]){
                    check = false;
                    break;
                }
            }
            if(check){
                s[pos] = main.charAt(i);
                per(s,pos+1);
            }
        }
    }

}