package com.javaCore;

import java.util.Arrays;
import java.util.List;

public class MostUsedPrefix {
    public static void main(String[] args) {

        List<String> words = Arrays.asList("Greek", "Greekk", "Gre");
        String prefix = words.get(0);

        for (String word : words) {
            while (!word.startsWith(prefix)) {
                prefix = prefix.substring(0, prefix.length() - 1);
            }
        }
        System.out.println("Most Used Prefix: " + prefix);
    }
    }

