package topInterview150;

/*
 * 121. Best Time to Buy and Sell Stock
Solved
Easy
Topics
Companies

You are given an array prices where prices[i] is the price of a given stock on the ith day.

You want to maximize your profit by choosing a single day to buy one stock and choosing a different day in the future to sell that stock.

Return the maximum profit you can achieve from this transaction. If you cannot achieve any profit, return 0.

 

Example 1:

Input: prices = [7,1,5,3,6,4]
Output: 5
Explanation: Buy on day 2 (price = 1) and sell on day 5 (price = 6), profit = 6-1 = 5.
Note that buying on day 2 and selling on day 1 is not allowed because you must buy before you sell.

Example 2:

Input: prices = [7,6,4,3,1]
Output: 0
Explanation: In this case, no transactions are done and the max profit = 0.

 

Constraints:

    1 <= prices.length <= 105
    0 <= prices[i] <= 104


 */

public class BestTimetoBuyandSellStock {
    public int maxProfit(int[] prices) {
        int currentLow = 0;
        int currentHi = 0;
        int currentMax = 0;

        for (int i = 0; i < prices.length; i++){
            /* //trial solution 1 
            if(i == 0){ // if index is zero
                currentHi = prices[i];
                currentLow = prices[i];
            }
            else if(prices[i] > currentHi){ // current prices[i] is greater than our current Hi
                currentHi = prices[i];
            }
            else if(prices[i] < currentLow){ // current prices[i] is lesser than our current Low
                currentLow = prices[i];
                currentHi = 0; //resetting max to compare min price to 
            }

            if (currentHi > currentLow){ // max calculation
                int tempMax = currentHi - currentLow;
                if (tempMax > currentMax){
                    currentMax = tempMax;
                }
            }
            */

            //trial solution 2
            if(i == 0){ // if index is zero
                currentLow = prices[i]; // new currentLow is starting index
            }
            else if (prices[i] < currentLow){
                currentLow = prices[i]; // new currentLow is current index
            }

            int tempMax = prices[i] - currentLow;

            if (tempMax > currentMax){ // if tempMax is greater than currentMax
                currentMax = tempMax; // current max is assigned as tempmax
            }

        }

        return currentMax;
    }
}
