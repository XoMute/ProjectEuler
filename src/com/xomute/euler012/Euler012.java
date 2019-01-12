package com.xomute.euler012;

public class Euler012 {

  public static long firstTriangleNumber(int n) {
    long number = 0;
    for(int i = 1; ; i++) {
      number += i;
      if(number == Long.MAX_VALUE) {
        System.out.println("TOP BORDER!!!");
        return 0;
      }
      System.out.println(numberOfDivisors(number));
      if(numberOfDivisors(number) >= n) return number;
    }

  }

  private static int numberOfDivisors(long n) {
    int count = 0;
    for(long i = 1; i <= Math.sqrt(n); i++) {
      if(n % i == 0) count+=2;
    }
    return count;
  }
}
