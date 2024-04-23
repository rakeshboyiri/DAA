class Item{
    int weight;
    int rate;
    public Item(int weight,int rate){
        this.weight = weight;
        this.rate = rate;
    }
}

public class knapsack {
    public static void main(String[] args) {
        int n = 4;
        Item items[] = new Item[n];
        // int weights [] = {4,5,2,6};weight = 10, ans : 90
        // int rates [] = {30,20,60,20};
        int weights [] = {3,2,5,4}; //weight = 8 ,ans : 65
        int rates [] = {20,16,45,40};
        int i;
        int weight = 8;
        for(i=0;i<n;i++){
            items[i] =new Item(weights[i], rates[i]);
        }

        // for(i=1;i<=n;i++){
        //     System.out.println("item"+i+": weight="+items[i].weight+" : rate = "+items[i].rate);
        // }
        System.out.println(ks(n,weight,items));
    }

    public static int ks(int n,int w,Item item[]){

        if(n==0 || w==0){
            return 0;
        }
        if(item[n-1].weight<=w){
            return Math.max(item[n-1].rate+ks(n-1,w-item[n-1].weight,item),ks(n-1,w,item));
        }else{
            return ks(n-1,w,item);
        }

    }
}

