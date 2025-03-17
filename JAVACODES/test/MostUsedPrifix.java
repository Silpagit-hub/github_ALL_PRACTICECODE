package com.test;

import java.util.List;

public class MostUsedPrifix {
    public static void main(String[] args) {
        String[] arr = {"Silpa", "Silpu", "Silpa"};
        //String[] arr = {"Apple", "Orange", "Silpa"};

        String prefix = arr[0];

        for (int i = 1; i < arr.length; i++) {
            while (!arr[i].startsWith(prefix)) {
                prefix = prefix.substring(0, prefix.length() - 1);
                if (prefix.isEmpty()) {
                    System.out.println("");
                    return;
                }
            }
        }
        System.out.println(prefix);
    }
}
