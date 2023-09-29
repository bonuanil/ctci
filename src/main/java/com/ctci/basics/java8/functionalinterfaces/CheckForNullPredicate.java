package com.ctci.basics.java8.functionalinterfaces;

import java.util.function.Predicate;

public class CheckForNullPredicate implements Predicate {
    @Override
    public boolean test(Object o) {
        return o != null;
    }
}
