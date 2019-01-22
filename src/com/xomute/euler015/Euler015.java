package com.xomute.euler015;

public class Euler015 {

  public static long latticePath(int n) {
    long[][] dp = new long[n][n];
    for(int i = 0; i < dp.length; i++) {
      dp[i][0] = 1;
      dp[0][i] = 1;
    }

    for(int i = 1; i < n; i++) {
      for(int j = 1; j < n; j++) {
        dp[i][j] = dp[i - 1][j] + dp[i][j - 1];
      }
    }
    return dp[n-1][n-1];
  }
}
