package com.thoughtworks.primefactors;

import org.junit.Test;

import static org.junit.Assert.*;

public class PrimeFactorsTest {
    @Test
    public void testGenerate() throws Exception {
        PrimeFactors primeFactors=new PrimeFactors();

        assertEquals(null,primeFactors.generate(1));

    }
}