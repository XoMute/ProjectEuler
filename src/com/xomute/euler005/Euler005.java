package com.xomute.euler005;

public class Euler005 {

  public static int smallestDivisible() {
    for (int i = 2520; ; i++) {

      boolean noMod = true;
      for (int j = 1; j <= 20; j++) {
        if (i % j != 0) {
          noMod = false;
          break;
        }
      }
      if (noMod) return i;
    }
  }
}