package org.example;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class Main {
    static void main() {

    }

    public static List<Integer> returnOddsFromOneToN(int n) {
        List<Integer> oddNumbers = new ArrayList<>();

        if (n < 0) {
            throw new IllegalArgumentException("Input can not be minus!");
        }

        for (int i = 0; i < n; i++) {
            if (i % 2 != 0) {
                oddNumbers.add(i);
            }
        }

        return oddNumbers;
    }

    public static boolean hasKeywords(String word){
        List<String> keywords = List.of(
                "abstract", "continue", "for", "new", "switch",
                "assert", "default", "goto", "package", "synchronized",
                "boolean", "do", "if", "private", "this",
                "break", "double", "implements", "protected", "throw",
                "byte", "else", "import", "public", "throws",
                "case", "enum", "instanceof", "return", "transient",
                "catch", "extends", "int", "short", "try",
                "char", "final", "interface", "static", "void",
                "class", "finally", "long", "strictfp", "volatile",
                "const", "float", "native", "super", "while"
        );


        String[] words = word.trim().split(" ");
        for (String i : words) {
            if (keywords.contains(i)){
                return true;
            }
        }
        return false;
    }
}
