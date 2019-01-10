package com.xomute.euler007;

public class Euler007 {

  public static long prime() {
    int counter = 0;
    for (long i = 2; ; i++) {
      if (isPrime(i)) counter++;

      if (counter == 10001) return i;
    }
  }

  private static boolean isPrime(long n) {
    for (long i = 2; i <= Math.sqrt(n); i++) {

      if (n % i == 0) return false;
    }
    return true;
  }
}
