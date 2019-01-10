package com.xomute.euler006;

public class Euler006 {

  public static int diff() {
    int sumOfSquares = 0;
    int sum = 0;
    for(int i = 1; i <= 100; i++) {
      sum += i;
      sumOfSquares += i * i;
    }
    return Math.abs(sumOfSquares - sum * sum);
  }
}
