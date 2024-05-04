/* 
Given n number of denominations and some amount amt, and find the number
of ways to  sum up the amt using n coin denominations( you can include 
multiple coins of same denominations )
        Coin change : Tabular approach
*/

#include <stdio.h>

int coinChange(int dn[],int n,int amt)
{
    int a[n+1][amt+1];
    for(int i=0;i<=n;i++)
    {
        for(int j=0;j<=amt;j++)
        {
            if(j==0)
            {
                a[i][j] = 1;
            }
            else if(i==0)
            {
                a[i][j] = 0;
            }
            else if(dn[i-1]<=j)
            {
                a[i][j] = a[i][j-dn[i-1]] + a[i-1][j];
            }
            else 
            {
                a[i][j] = a[i-1][j];
            }
        }
    }
    return a[n][amt];
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