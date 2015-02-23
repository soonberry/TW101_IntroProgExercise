package com.thoughtworks.primefactors;

import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.Assert.*;

public class PrimeFactorsTest {
    @Test
    public void testGenerate() throws Exception {
        PrimeFactors primeFactors = new PrimeFactors();
        List<Integer> list1 = new ArrayList<Integer>();
        list1.add(2);
        List<Integer> list2 = new ArrayList<Integer>();
        list2.add(2);
        list2.add(3);
        list2.add(5);

        assertEquals(null, primeFactors.generate(1));
        assertEquals(list1, primeFactors.generate(2));
        assertEquals(list2, primeFactors.generate(30));

    }
}