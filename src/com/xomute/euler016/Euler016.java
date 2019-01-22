package com.xomute.euler016;

import java.math.BigDecimal;

public class Euler016 {

  public static long powerDigitSum(int n) {
    BigDecimal power = new BigDecimal(2);
    power = power.pow(n);
    System.out.println(power);
    return sumOfDigits(power);
  }

  private static long sumOfDigits(BigDecimal n) {
    long sum = 0;
    String number = n.toString();
    while (number.length() > 0) {
      sum += Long.valueOf(number.substring(0, 1));
      number = number.substring(1);
    }
    return sum;
  }
}
