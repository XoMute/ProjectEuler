package com.xomute.euler009;

public class Euler009 {

  public static long prod(int n) {
    for (int a = 4; ; a++) {
      for (int b = a + 1; b < 1000; b++) {
        long c = a * a + b * b;
        if(Math.sqrt(c) - (int)Math.sqrt(c) != 0) continue;
        long csqrt = (int)Math.sqrt(c);
        if (csqrt > b && a + b + csqrt == n) {
          System.out.println("a = " + a + " b = " + b + " c = " + csqrt);
          return a * b * csqrt;
        }
      }
    }
  }
}
