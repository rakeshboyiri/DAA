/* 
Given n number of denominations and some amount amt, and find the number
of ways to  sum up the amt using n coin denominations( you can include 
multiple coins of same denominations )
        Coin change : Memorization approach
*/

#include<stdio.h>

#define Max 20

int coinChange(int a[][Max],int dn[],int n,int amt)
{
    if(a[n][amt]!=-1) return a[n][amt];
    if(amt==0) return a[n][amt]= 1;
    if(n==0) return a[n][amt] = 0;
    if(dn[n-1]<=amt)
        return a[n][amt] = coinChange(a,dn,n,amt-dn[n-1]) + coinChange(a,dn,n-1,amt);
    else
        return a[n][amt] = coinChange(a,dn,n-1,amt);    
}



void main()
{
    int n,amt;
    printf("Enter number of denominations : ");
    scanf("%d",&n);
    int dn[n];
    printf("Enter denominations : ");
    for(int i=0;i<n;i++)
    {
        scanf("%d",&dn[i]);
    }
    printf("Enter amount : ");
    scanf("%d",&amt);
    int a[n+1][Max];
    for(int i=0;i<=n;i++)
    {
        for(int j=0;j<=amt;j++)
        {
            a[i][j] = -1;
        }
    }
    int ways = coinChange(a,dn,n,amt);
    printf("No of ways to sum up denominations : %d\n",ways);
}