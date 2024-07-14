import java.util.*;

class Point {
    int x;
    int y;
    public  Point(int x,int y){
      this.x = x;
      this.y = y;
    }
}

public class closestpair{
static int index_x;
static int index_y;
  public static void main(String args[]){
  Scanner sc = new Scanner(System.in);
  System.out.print("Enter the size of array : ");
    int n=sc.nextInt();
    
    Point p[] = new Point[n];
    
    for(int i=0;i<n;i++){
      System.out.print("Enter "+(i+1)+" point x and y :");
  int  x = sc.nextInt();
 int y  = sc.nextInt();
      p[i] = new Point(x,y);
      
    }
    double val = closeset(p,n);
    System.out.println(String.format("%.2f",val));
    
  }
  
  static double closeset(Point p[],int n){
    double min = Double.MAX_VALUE;
    for(int i=0;i<n;i++){
      for(int j=i+1;j<n;j++){
        double d = Math.sqrt(Math.pow(p[j].y-p[i].y,2)+Math.pow(p[j].x-p[i].x,2));
        if(d<min) min = d;
      }
    }
    
    return min;
  }
} 
  
