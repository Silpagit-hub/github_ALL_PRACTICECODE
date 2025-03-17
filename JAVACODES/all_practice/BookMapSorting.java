package com.all_practice;

import java.util.Comparator;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.stream.Collectors;

public class BookMapSorting {
    public static void main(String[] args) {

        Map<Book, Integer> bookMap = new HashMap<>();
        bookMap.put(new Book("1984", "George Orwell"), 10);
        bookMap.put(new Book("To Kill a Mockingbird", "Harper Lee"), 15);
        bookMap.put(new Book("The Great Gatsby", "F. Scott Fitzgerald"), 7);
        bookMap.put(new Book("Moby Dick", "Herman Melville"), 5);
        bookMap.put(new Book("1984", "George Orwell"), 10);
        System.out.println(bookMap);

        Map<Book, Integer> result =
//               bookMap.entrySet().stream().sorted(((o1, o2) -> o1.getKey().getAuthor().compareTo(o2.getKey().getAuthor()))).
//                       collect(Collectors.toMap(k->k.getKey(),
//                               v->v.getValue(),
//                               (e1,e2)->e1,
//                               LinkedHashMap::new));

                bookMap.entrySet().stream().sorted(Map.Entry.comparingByKey(
                        Comparator.comparing(Book::getAuthor).thenComparing(Book::getTitle))).
                        collect(Collectors.toMap(
                        k -> k.getKey(),
                        v -> v.getValue(),
                        (e1, e2) -> e1,
                        LinkedHashMap::new
                ));

        System.out.println(result);
    }
}
