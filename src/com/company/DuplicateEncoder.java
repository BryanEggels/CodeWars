package com.company;

public final class DuplicateEncoder {


  static String encode(String word){
    word = word.toLowerCase();
    String encoded = "";
    for (char character: word.toCharArray()) {
      encoded += word.indexOf(character) == word.lastIndexOf(character) ? "(" : ")";
    }
    return encoded;
  }
}
