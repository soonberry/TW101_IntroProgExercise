package com.thoughtworks.primefactors;

import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.Assert.*;

public class PrimeFactorsTest {
    @Test
    public void testGenerate() throws Exception {
        PrimeFactors primeFactors=new PrimeFactors();
        List<Integer> list=new ArrayList<Integer>();
        list.add(2);

        assertEquals(null,primeFactors.generate(1));
        assertEquals(list,primeFactors.generate(2));

    }
}