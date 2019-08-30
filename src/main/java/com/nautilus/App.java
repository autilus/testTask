package com.nautilus;

import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Anagram anagram = new Anagram();
        String firstWord = scanner.nextLine();
        String secondWord = scanner.nextLine();
        System.out.println(anagram.isAnagram(firstWord, secondWord));
    }
}

