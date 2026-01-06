import java.util.Arrays;

public class StockSpan {
  public int[] calculateSpan(int[] stockPrices) {
    int n = stockPrices.length;
    int[] span = new int[n];
    span[0] = 1; // the span of the first day is always 1
    for (int i = 1; i < n; i++) {
      span[i] = 1;
      int j = i - 1;
      while (j >= 0 && stockPrices[i] >= stockPrices[j]) {
        span[i] += 1;
        j -= 1;
      }

    }
    return span;

  }

  public static void main(String[] args) {
    StockSpan cS = new StockSpan();
    int[] stockPrices = { 100, 80, 60, 70, 60, 75, 85 };
    int[] span = cS.calculateSpan(stockPrices);
    System.out.println("Stock Prices: " + Arrays.toString(stockPrices));
    System.out.println("Stock Spans: "+ Arrays.toString(span));
  }
  
}
