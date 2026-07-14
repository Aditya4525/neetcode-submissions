class Solution {
    public int maxProfit(int[] prices) {
        int maxProfit=0;
        if(prices.length==1){
            return 0;
        }
        int sp=prices[0];
        int cp=prices[0];
        for(int i=1;i<prices.length;i++){
           if(prices[i]>cp){
            int profit=prices[i]-cp;
            if(profit>maxProfit){
                maxProfit=profit;
            }
           }else{
            cp=prices[i];
           }
        }
        return maxProfit;
    }
}
