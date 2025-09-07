/*
 * Time complexity: O(n)
 * Space complexity: O(1)
 *
 * The logic:
 * So, we could be using nested loops for brute-force solution, which compares
 * one price with all other prices in the array in one iteration, which is exausting.
 *
 * The problem states 'Also, you are allowed to perform any number of transactions
 * but can hold at most one share of the stock at any time.', which means
 * that we might simply capture every single profit
 * (treat each price as single instance) and add to the max total.
 *
 * We'll simply iterate through the array once and, whenever we see a price
 * increase from one day to the next, we capture that profit and add it the total.
 *
 */

package Java.BestTimeToBuyAndSellStockII;

public class BestTimeToBuyAndSellGreedy {
  public static int maxProfit(int[] prices) {
    int profit = 0;
    for (int i = 1; i < prices.length; i++) {
      if (prices[i] > prices[i - 1]) {
        profit += prices[i] - prices[i - 1];
      }
    }
    return profit;
  }

  public static void main(String[] args) {
    int[] nums = { 7, 1, 5, 3, 6, 4 };
    int profit = maxProfit(nums); // 7
    System.out.println(profit);
  }
}
