public class SubstringMultiStripCount {
    public static void main(String[] args) {
        String main_string = "abcdefghijklmnopqrstuvwxyzabcdefghi";
        String sub_string = "acf";

        int count = checkSubString(main_string, sub_string);
        
        System.out.println("The substring occured : "+count+" times");
        
    }

    public static int checkSubString(String main,String sub){

        int i,j;
        int m = main.length(); //Length of the main String 
        int n = sub.length(); //Length od sub string 
        int count =0;
        
        for(i=0;i<=m-n;i++){ //outer loop runs m-n times
            
            if(main.charAt(i)==sub.charAt(0)){
                boolean flag1 = true;
                int sum;
                for(j = 1;j<=sub.length();j++){
                    
               
                    sum =  i+(j*((j+1)))/2-1;
                    
                    if(main.charAt(sum)!=sub.charAt(j-1)){
                        flag1 = false;
                        break;
                    }
                    
                   
                    
                }
                if(flag1){
                    count++;
                    
                }
            }
        }
        return count;
    }
}
