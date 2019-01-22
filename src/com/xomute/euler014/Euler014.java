package com.xomute.euler014;

public class Euler014 {

  public static long collatzSequence(long n) {
    long maxCount = 0, maxNumber = 0;
    for(long i = 1; i <= n; i++) {
      long count = 1;
      long number = i;
      while(number > 1) {
        if(number % 2 == 0) number /= 2;
        else number = 3 * number + 1;
        count++;
      }
      if (count > maxCount) {
        maxCount = count;
        maxNumber = i;
      }
    }
    return maxNumber;
  }
}
