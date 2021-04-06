package Leetcode.Blind75;

public class MaxProfit {

	static int stockprice[] = { 3, 12, 1, 8, 15 };
	static int profit;
	static int maxprofit = 0;

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MaxProfit mp = new MaxProfit();

		System.out.println(mp.maxprofit(stockprice));
		System.out.println(mp.onePass(stockprice));
	}
	//One Pass Solution
	int onePass(int[] stockprice) {
		// TODO Auto-generated method stub
		int minprice = Integer.MAX_VALUE;

		int maxprofit = 0;
		for (int i = 0; i < stockprice.length; i++) {
			if (stockprice[i] < minprice) {
				minprice = stockprice[i];

			} else if (stockprice[i] - minprice > maxprofit)

				maxprofit = stockprice[i] - minprice;

		}
		return maxprofit;
	}

	// Brute Force
	int maxprofit(int[] stockprice) {

		for (int i = 0; i < stockprice.length - 1; i++) {
			for (int j = i + 1; j < stockprice.length; j++) {
				profit = (stockprice[j] - stockprice[i]);
				if (profit > maxprofit) {
					maxprofit = profit;
				}

			}
		}
		return maxprofit;
		// TODO Auto-generated method stub

	}

}
