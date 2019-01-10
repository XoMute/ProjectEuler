package com.xomute.euler004;

public class Euler004 {

  public static int largestPalindrome() {
    int max = 0;
    for(int i = 100; i < 1000; i++) {
      for(int j = i; j < 1000; j++) {
        if(isPalindrome(i * j) && i * j > max) max = i * j;
      }
    }
    return max;
  }

  private static boolean isPalindrome(int n) {
    String number = String.valueOf(n);
    for (int i = 0; i < number.length() / 2; i++) {
      if (number.charAt(i) != number.charAt(number.length() - i - 1)) return false;
    }
    return true;
  }
}
