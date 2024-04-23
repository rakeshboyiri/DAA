public class SubstringCount {
    public static void main(String[] args) {
        String main_string = "abcdefghfgh";
        String sub_string = "fgh";

        int count = SubStringCount(main_string, sub_string);
        
        System.out.println("Number of occurence of substring : "+count);
        
    }

    public static int SubStringCount(String main,String sub){

        int i,j;
        int m = main.length(); //Length of the main String 
        int n = sub.length(); //Length od sub string 
        int count=0;
        
        for(i=0;i<m-n+1;i++){ //outer loop runs m-n times
            
            if(main.charAt(i)==sub.charAt(0)){
                boolean flag1 = true;
                for(j = 0;j<n;j++){
                    if(main.charAt(i+j)!=sub.charAt(j)){
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
