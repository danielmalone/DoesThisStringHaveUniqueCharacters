package com.finepointstudios;

import java.util.ArrayList;

public class Main {

    private static String word = "a";
    private static ArrayList<Character> list;

    public static void main(String[] args) {
        System.out.println(isStringUnique(word));
    }

    private static String isStringUnique(String word) {
        list = new ArrayList<>();

        for (int i = 0; i < word.length(); i++) {
            if (isAlreadyUsed(word.charAt(i))) {
                return "Duplicate characters found!";
            }
            list.add(word.charAt(i));
        }
        return "All characters unique!";
    }

    private static boolean isAlreadyUsed(char c) {
        for (int i = 0; i < list.size(); i++) {
            if (list.get(i).equals(c)) {
                return true;
            }
        }
        return false;
    }
}
