package com.ctci.basics.java8.methodreferences;

import com.ctci.utils.CTCIUtils;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.function.Supplier;

public class StaticMethodReferenceExample {



    public static int compareName(Student a, Student b){
        return a.getName().compareTo(b.getName());
    }

    public int compareAge(Student a, Student b){
        return a.getAge().compareTo(b.getAge());
    }

    public static <T> List<T> getStudents(int count, Supplier<T> supplier){
        List<T> list = new ArrayList<>();
        for(int i=0; i<count; i++){
            list.add(supplier.get());
        }
        return list;
    }


    public static void main(String[] args) {

        List<Student> students = new ArrayList<>();
        students.add(new Student("ABC", "26"));
        students.add(new Student("XABC", "23"));
        students.add(new Student("YABC", "27"));


        // Static method reference
        Collections.sort(students, StaticMethodReferenceExample::compareName);

        students.stream().map(x -> x.getName()).forEach(System.out::println);

        // instance method Reference
        StaticMethodReferenceExample staticMethodReferenceExample = new StaticMethodReferenceExample();

        Collections.sort(students, staticMethodReferenceExample::compareAge);

        students.stream().map(x -> x.getName()).forEach(System.out::println);


        //Constructor Reference
        List<Student> newStudents = getStudents(10, Student::new);
        newStudents.stream().map(x -> x.getName()).forEach(System.out::println);


    }


}
