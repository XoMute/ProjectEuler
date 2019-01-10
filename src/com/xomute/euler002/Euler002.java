package com.xomute.euler002;

public class Euler002 {

  private static int fibonacci(int n) {
    if(n == 0)
      return 0;
    else if (n == 1) {
      return 1;
    } else {
     return fibonacci(n - 1) + fibonacci(n - 2);
    }
  }

  public static int fibonacciSum(int limit) {
    int sum = 0;
    for(int i = 0;; i++) {
      int a = fibonacci(i);
      if(a > limit) break;
      if(a % 2 == 0) sum += a;
    }
    return sum;
  }
}
