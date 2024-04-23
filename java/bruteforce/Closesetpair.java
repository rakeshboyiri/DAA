class Points {
    int x;
    int y;
    Points(int x,int y){
        this.x = x;
        this.y = y;
    }


}

public class Closesetpair{
    public static void main(String args[]){
        int n = 5;
        int x[] = {2,4,4,2,3};
        int y[] = {1,1,3,3,1};
        Points p[] = new Points[n];
        int i,j,k,indexi=0,indexj=0;
        for(i=0;i<n;i++){
            p[i] = new Points(x[i], y[i]);
        } 

        for(i=0;i<n;i++){
            System.out.println("P"+(i+1)+"("+p[i].x+","+p[i].y+")");
        }

        double min = Double.MAX_VALUE;
        for(i=0;i<n-1;i++){
            double d =0;
            for(j=i+1;j<n;j++){
                d = Math.sqrt((Math.pow(p[j].x-p[i].x,2)+Math.pow(p[j].y-p[i].y,2)));
                if(d<min){
                    min = d;
                    indexi = i;
                    indexj = j;
                }
            }
        }
        System.out.println("Min distance = "+min);
        System.out.println("p1("+p[indexi].x+","+p[indexi].y+")");
        System.out.println("p2("+p[indexj].x+","+p[indexj].y+")");

    }
}