class Points{
    int x;
    int y;

    Points(int x,int y){
        this.x=x;
        this.y=y;
    }
}


public class Hosptial {
    public static void main(String[] args) {
        int n= 5,i,j;
        Points p[] = new Points[n];
        int x[] = {3,5,5,3,4};
        int y[] = {2,2,4,4,3};

        for( i =0 ;i<n;i++){
           p[i] =new Points(x[i],y[i]);
        }
        int indexi =0;
        double min_avg = Double.MAX_VALUE;
        for(i=0;i<n;i++){
            double sum=0 ;
            for(j=0;j<n;j++){
                if(i==j)continue;

                sum+=Math.sqrt((Math.pow((p[j].x)-(p[i].x),2))+(Math.pow((p[j].y)-(p[i].y),2))); 


            }
            double avg = ((sum)/n-1);

            if((avg)<min_avg){
                min_avg = avg;
                indexi = i;
            }            
        }
        
        System.out.println("P("+p[indexi].x+" "+p[indexi].y+")");
        
        
    }
    
}
