package com.nautilus;

import java.util.Arrays;

public class Anagram {
    public boolean isAnagram(String firstWord, String secondWord) {
        boolean result = false;
        char[] firstWordArray = firstWord.trim().toLowerCase().toCharArray();
        char[] secondWordArray = secondWord.trim().toLowerCase().toCharArray();
        Arrays.sort(firstWordArray);
        Arrays.sort(secondWordArray);
        if (firstWordArray.length != secondWordArray.length) {
        } else {
            result = Arrays.equals(firstWordArray, secondWordArray);
        }
        return result;
    }
}
