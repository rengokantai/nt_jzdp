public class CoinChange {
    /**
     * @param amount: a total amount of money amount
     * @param coins: the denomination of each coin
     * @return: the number of combinations that make up the amount
     */
    public int change(int amount, int[] coins) {
        // write your code here
        int n = coins.length;
        int[] f = new int[amount+1];
        int i,j;
        f[0]=0;
        for(i=1;i<=amount;++i){
            f[i]=Integer.MAX_VALUE;
            for(j=0;j<n;++j){
                if(coins[j]<=i&&f[i-coins[j]]!=Integer.MAX_VALUE&&f[i-coins[j]]+1<f[i]){
                    f[i]=f[i-coins[j]]+1;
                }
            }
        }
        if(f[amount]==Integer.MAX_VALUE){
            return -1;
        }else{
            return f[amount];
        }
    }
}
