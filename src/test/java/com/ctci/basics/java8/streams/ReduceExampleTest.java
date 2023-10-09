package com.ctci.basics.java8.streams;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class ReduceExampleTest {

    ReduceExample reduceExample;
    List<Integer> data;

    @Test
    void listOddNumbers() {
        assert reduceExample.listOddNumbers(data).size() == 3;
        assert reduceExample.listOddNumbers(null).size() == 0;
    }

    @Test
    void sumOfIntegers() {
        assert reduceExample.sumOfIntegers(null) == 0;
        assert reduceExample.sumOfIntegers(data) == 39;

    }

    @BeforeEach
    void setUp() {
        reduceExample = new ReduceExample();
        data = List.of(1,2,4,5,6,9,12);
    }


}