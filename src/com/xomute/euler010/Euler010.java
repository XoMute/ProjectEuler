package com.xomute.euler010;

public class Euler010 {

  public static long sum(int n) {
    long sum = 0;
    for(long i = n; i >= 2; i--) {
      sum += isPrime(i) ? i : 0;
    }
    return sum;
  }

  private static boolean isPrime(long n) {
    for(int i = 2; i <= Math.sqrt(n); i++) {
      if(n % i == 0) return false;
    }
    return true;
  }
}
