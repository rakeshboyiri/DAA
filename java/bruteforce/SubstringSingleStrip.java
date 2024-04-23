public class SubstringSingleStrip {
    public static void main(String[] args) {
        String main_string = "abcdefghijklmnopqrstuvwxyz";
        String sub_string = "abcd";

        int check = checkSubString(main_string, sub_string);
        
        if(check==-1){
            System.out.println("String not matched");
        }else{
            System.out.println("String matched at "+check+" index");
        }
        
    }

    public static int checkSubString(String main,String sub){

        int i,j;
        int m = main.length(); //Length of the main String 
        int n = sub.length(); //Length od sub string 
        int index =-1;
        
        for(i=0;i<m-n+1;i++){ //outer loop runs m-n times
            
            if(main.charAt(i)==sub.charAt(0)){
                boolean flag1 = true;
                
                for(j = 0;j<sub.length();j++){
                
                    
                    if(main.charAt(i+j)!=sub.charAt(j)){
                        flag1 = false;
                        break;
                    }
                    
                   
                    
                }
                if(flag1){
                    index = i;
                    break;
                }
            }
        }
        
        return index;
    }
}
