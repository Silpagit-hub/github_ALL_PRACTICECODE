package com.java8Concept;

import java.util.Comparator;
import java.util.List;
import java.util.Map;
import java.util.MissingResourceException;
import java.util.stream.Collectors;

public class SortMarkBySubject {

    public static void main(String[] args) {
   List<Student> list=List.of(new Student("A","Physics",30),
           new Student("A","Physics",30),
           new Student("G","English",27),
           new Student("D","Math",45),
           new Student("P","Physics",39),
           new Student("R","English",41),
           new Student("C","Physics",43),
           new Student("F","Math",47)
           );

  Map<String,List<Integer>> subjectLists= list.stream().
                collect(Collectors.groupingBy(Student::getSubject,Collectors.mapping(Student::getMark,Collectors.toList())));

        subjectLists.forEach((k,v)->{
        double avg  =v.stream().mapToDouble(i->i).average().getAsDouble();
        System.out.println("avg of subjects "+k + " " +avg);
        });

        subjectLists.forEach((k,v)->{
           int i = v.stream().sorted(Comparator.reverseOrder()).collect(Collectors.toList()).get(0);
            System.out.println("Sorted marks of subjects "+k + " " +i);
        });

        subjectLists.forEach((k,v) -> {
            int sum=v.stream().mapToInt(i->i).sum();
            System.out.println("sum of subjects "+k+" "+sum);}
        );


    }
}

