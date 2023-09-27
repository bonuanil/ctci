package com.ctci.basics.java8.lambda;

public class StringContainsOnlyAlphabet {

    public static boolean isStringContainsOnlyAlphabet(String input){
        System.out.println("Input Str " + input + " is alphabetic ");
        return ( input != null && input.trim().length() > 0
        && input.chars().allMatch(Character::isAlphabetic));
    }

    public static void main(String[] args) {
        System.out.println(isStringContainsOnlyAlphabet("Abcdf"));
        System.out.println(isStringContainsOnlyAlphabet("aaaaaaaa"));
        System.out.println(isStringContainsOnlyAlphabet("oasddf9"));
        System.out.println(isStringContainsOnlyAlphabet("11233"));
    }
}
