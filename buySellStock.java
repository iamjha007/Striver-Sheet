 public int maxProfit(int[] prices) {
        int n=prices.length;
        
        int maxprofit=0;
        int minprice=prices[0];
        
            for(int i=1;i<n;i++){
                
               if(prices[i]<minprice)
                   minprice=prices[i];
                else
                    if(prices[i]-minprice>maxprofit)
                        maxprofit=prices[i]-minprice;
            }
        return maxprofit;
        
    }