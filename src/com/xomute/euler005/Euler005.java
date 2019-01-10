package com.xomute.euler005;

public class Euler005 {

  public static int smallestDivisible() {
    boolean noMod;
    for (int i = 2520; ; i+=20) {

      noMod = true;
      if(i % (11 * 13 * 17) != 0) continue;
      for (int j = 19; j >= 12; j--) {
        if (i % j != 0) {
          noMod = false;
          break;
        }
      }
      if (noMod) return i;
    }
  }
}
