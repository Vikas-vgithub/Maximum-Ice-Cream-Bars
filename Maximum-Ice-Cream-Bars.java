class Solution {
    public int maxIceCream(int[] costs, int coins) {
        
        Arrays.sort(costs);
        int ans = 0;

        for(int i=0; i<costs.length; i++){
            if(costs[i]<=coins){
                coins = coins-costs[i];
                ans++;
            }
        }
        return ans;
    }
}
