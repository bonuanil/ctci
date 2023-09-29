package com.ctci.basics.java8.methodreferences;

import java.util.function.Supplier;

public class Student {
    Supplier<String> ageSupplier = () -> Math.random()+"";
    private String name;
    private String age;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAge() {
        return age;
    }

    public void setAge(String age) {
        this.age = age;
    }

    public Student(){
        this.age = ageSupplier.get();
        this.name = "Hello"+age;

    }

    public Student(String name, String age){
        this.name = name;
        this.age = age;
    }
}