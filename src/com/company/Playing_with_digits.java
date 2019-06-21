package com.company;

public final class Playing_with_digits {


  public static long digPow2(int n, int p){
    Long result = 0L;
    for (int i = 0; String.valueOf(n).length() > i; i++){
      int num = Integer.parseInt(Integer.toString(n).substring(i, i+1));
      result += (long)Math.pow(num,p);
      p++;
    }
    //if result mod n results 0, return result / n, else return -1
    return (result % n == 0) ? result / n : -1;

  }
}
