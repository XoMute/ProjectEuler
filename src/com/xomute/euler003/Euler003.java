package com.xomute.euler003;

public class Euler003 {

  public static int largestPrimeFactor(long n) {

    int largest = 0;
    if(n % 2 == 0) largest = 2;
    while (n % 2 == 0) {
      n /= 2;

    }
    for(int i = 3; i < Math.sqrt(n); i+=2) {
      if(n % i == 0) largest = i;
      while(n % i == 0) {
        n /= i;
      }
    }
    return n > 2 ? (int)n : largest;
  }
}
