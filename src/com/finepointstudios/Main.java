package com.finepointstudios;

public class Main {

    private static String word = "aa";
    private static boolean[] list = new boolean[128];

    public static void main(String[] args) {
        for (int i = 0; i < word.length(); i++) {
            char value = word.charAt(i);
            if (list[value]) {
                System.out.println("Duplicate value found!");
            }
            list[value] = true;
        }
    }
}
