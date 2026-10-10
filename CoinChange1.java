package Ddynamic;

import java.lang.reflect.Array;
import java.util.Arrays;

public class CoinChange1 {
    public static void main(String[] args) {
        int []coins={1,2,5};
        int amount=7;
        System.out.println(coinChange(coins,amount));
    }
    public  static int coinChange(int[]coins,int amount){

        int n=coins.length;
        //make 2d dp n-1 index ke liye n anad amount ke liye amount +1
        int dp[][]=new  int[n][amount+1];
        //fill the dp
        for (int i = 0; i <n ; i++) {
            Arrays.fill(dp[i],-1);

            
        }
        int res=recur(coins,amount,n-1,dp);
        if (res==(int) 1e9){
            return -1;
        }
        else
            return res;
    }

    private static int recur(int[] coins, int amount,int index,int[][]dp) {
        //base case
        if (index==0){
            //agar bacha hua amount pahle index se divisible hain to divide jitni bar hoga vo solution hain
            if (amount%coins[index]==0){
                //when u get return u store in dp
                dp[index][amount]=amount/coins[index];
                return amount/coins[index];
            }
            //other wise sabse chhotivalue 1e9 return karo
            dp[index][amount]=(int) (1e9);
             return (int) (1e9);
        }
        if (dp[index][amount]!=-1){
            return dp[index][amount];
        }
        int pick=(int) 1e9;
        if(amount>=coins[index]){
            //one coin pick kiye so add one but not change oin index
            pick=1+recur(coins,amount-coins[index],index,dp);
        }
        int noPick=recur(coins,amount,index-1,dp);
        //pick aur nopick main jo minimum dega usko lengen

        dp[index][amount]=Math.min(pick,noPick);
        return dp[index][amount];
    }

}

