class Item{
    int weight;
    int rate;
    public Item(int weight,int rate){
        this.weight = weight;
        this.rate = rate;
    }
}

public class knapsackMemory {
    public static void main(String[] args) {
        int n = 4;
        Item items[] = new Item[n];
        // int weights [] = {4,5,2,6};weight = 10, ans : 90
        // int rates [] = {30,20,60,20};
        int weights [] = {3,2,5,4}; //weight = 8 ,ans : 65
        int rates [] = {20,16,45,40};
        int i,j;
        int weight = 8;
        int memory[][] = new int[n+1][weight+1];
        for(i=0;i<=n;i++){
            for(j=0;j<=weight;j++){
                memory[i][j] = -1;
            }
        }
        for(i=0;i<n;i++){
            items[i] =new Item(weights[i], rates[i]);
        }

        // for(i=1;i<=n;i++){
        //     System.out.println("item"+i+": weight="+items[i].weight+" : rate = "+items[i].rate);
        // }
        System.out.println(ks(n,weight,items,memory));
    }

    public static int ks(int n,int w,Item item[],int memory[][]){
        if(memory[n][w]!=-1) return memory[n][w];

        if(n==0 || w==0){
            return memory[n][w] =  0;
        }
        if(item[n-1].weight<=w){
            return memory[n][w] =  Math.max(item[n-1].rate+ks(n-1,w-item[n-1].weight,item,memory),ks(n-1,w,item,memory));
        }else{
            return memory[n][w] = ks(n-1,w,item,memory);
        }

    }
}

