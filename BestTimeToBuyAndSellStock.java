import java.util.Arrays;

public class BestTimeToBuyAndSellStock {
    public int maxProfit(int[] prices) {
        int max = 0;
        for (int i = 0;i < prices.length-1;i++){
            innerloop:
            for (int j = i +1; j < prices.length;j++){
                if (prices[j] - prices[i] >0){
                    max = prices[j] - prices[i] > max ? prices[j] - prices[i]:max;
                }else break;
            }
        }
        return max;
        }
    }
