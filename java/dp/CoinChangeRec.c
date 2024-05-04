/* 
Given n number of denominations and some amount amt, and find the number
of ways to  sum up the amt using n coin denominations( you can include 
multiple coins of same denominations )
        Coin change : Recursive approach
*/

#include <stdio.h>

int coinChange(int dn[],int n,int amt)
{
    if(amt==0)
        return 1;
    if(n==0)
        return 0;
    if(dn[n-1]<=amt)
        return coinChange(dn,n,amt-dn[n-1]) + coinChange(dn,n-1,amt);
    else
        return coinChange(dn,n-1,amt);          
}
void main()
{
    int n,amt;
    printf("Enter number denominations : ");
    scanf("%d",&n);
    int dn[n];
    printf("Enter denominations : ");
    for(int i=0;i<n;i++)
    {
        scanf("%d",&dn[i]);
    }
    printf("Enter amount : ");
    scanf("%d",&amt);
    int ways = coinChange(dn,n,amt);
    printf("No of ways to sum up denominations : %d\n",ways);
}