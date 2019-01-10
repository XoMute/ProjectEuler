package com.xomute.euler001;

import java.util.stream.IntStream;

public class Euler001 {

  public static int count3and5(int n) {
    return IntStream.range(3, n)
                    .filter(a -> a % 3 == 0 || a % 5 == 0)
                    .sum();
  }
}
