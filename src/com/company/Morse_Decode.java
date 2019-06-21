package com.company;

public final class Morse_Decode {
  static String decode(String morse){

    String[] morseWords = morse.trim().split("\\s+\\s+\\s+");
    String result = "";
    for (int i=0;morseWords.length > i; i++){
      String[] morseCharacters = morseWords[i].split("\\s");
      for (int x=0;morseCharacters.length > x; x++){
        /*result += MorseCode.get(morseCharacters[x]);*/
        result += (morseWords.length > i+1 && morseCharacters.length ==x+1) ? " " : "";
      }
    }
    return result;
  }
}
