package com.finepointstudios;

public class Main {

    private static String word = "DanielA";
    private static boolean[] list = new boolean[128];

    public static void main(String[] args) {
        if (search()) {
            System.out.println("Duplicates found!");
        } else {
            System.out.println("No duplicates found!");
        }
    }

    private static boolean search() {
        for (int i = 0; i < word.length(); i++) {
            char value = word.charAt(i);
            if (list[value]) {
                return true;
            }
            list[value] = true;
        }
        return false;
    }
}
