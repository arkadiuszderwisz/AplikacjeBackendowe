package com.company;

public class ZadanieTrzy {
    public static void main(String[] args) {
        String text = "line 1\nline 2";
        String[] lines = text.split("/\r?\n/");
        for (int i = 0; i < lines.length; i++) {
            System.out.println(lines[i]);
        }
    }
}
