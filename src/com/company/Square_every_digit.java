package com.company;

public final class Square_every_digit {
  public static int squareDigits(int n) {
    String result = "";
    for (int i = 0; String.valueOf(n).length() > i; i++){
      //takes every digit 1 by 1, adds the power of it to the result
      int num = Integer.parseInt(Integer.toString(n).substring(i, i+1));
      result +=  String.valueOf(num*num);
    }
    return Integer.parseInt(result);

  }
}
