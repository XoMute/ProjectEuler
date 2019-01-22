package com.xomute.euler017;

public class Euler017 {

  public static long numberLetterCounts(int n) {
    long count = 0;
    for (int i = 1; i <= n; i++) {
      count += countOfLetters(i);
    }
    return count;
  }

  private static int countOfLetters(int n) {
    if (n == 1000) return 11;
    if (n < 10) return countOfLettersFrom1to9(n);
    if (n < 100) return countOfLettersFrom10To99(n);
    return countOfLettersFrom100To999(n);
  }

  private static int countOfLettersFrom1to9(int n) {
    switch (n) {
      case 1:
      case 2:
      case 6:
        return 3;
      case 4:
      case 5:
      case 9:
        return 4;
      case 3:
      case 7:
      case 8:
        return 5;
      default:
        return 0;
    }
  }

  private static int countOfLettersFrom10To99(int n) {
    int count = 0;
    switch (n / 10) {
      case 1:
        {
          switch (n) {
            case 10:
              return 3;
            case 11:
              return 6;
            case 12:
              return 6;
            case 13:
              return 8;
            case 14:
              return 8;
            case 15:
              return 7;
            case 16:
              return 7;
            case 17:
              return 9;
            case 18:
              return 8;
            case 19:
              return 8;
          }
          break;
        }
      case 4:
      case 5:
      case 6:
        count += 5;
        break;
      case 2:
      case 3:
      case 8:
      case 9:
        count += 6;
        break;
      case 7:
        count += 7;
    }
    count += countOfLettersFrom1to9(n % 10);
    return count;
  }

  private static int countOfLettersFrom100To999(int n) {
    int count = countOfLettersFrom1to9(n / 100) + 7;
    if (n % 100 == 0) {
      return count;
    }
    if (n % 100 > 9) {
      count += countOfLettersFrom10To99(n % 100) + 3; // + 3 for 'and'
    } else {
      count += countOfLettersFrom1to9(n % 100) + 3;
    }

    return count;
  }
}
