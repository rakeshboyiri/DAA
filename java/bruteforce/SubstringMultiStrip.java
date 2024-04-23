public class SubstringMultiStrip {
    public static void main(String[] args) {
        String main_string = "abcdefghijklmnopqrstuvwxyz";
        String sub_string = "bdgk";

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
        try{
        for(i=0;i<m-n+1;i++){ //outer loop runs m-n times
            
            if(main.charAt(i)==sub.charAt(0)){
                boolean flag1 = true;
                int k;
                int sum=0;
                for(j = 1;j<=sub.length();j++){
                    
               
                    sum =  i+(j*((j+1)))/2-1;
                    
                    if(main.charAt(sum)!=sub.charAt(j-1)){
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
        }catch(Exception e){System.out.println(e);}
        return index;
    }
}
