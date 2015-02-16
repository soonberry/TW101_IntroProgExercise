package com.thoughtworks.fizzbuzz;

import org.junit.Test;

import static org.junit.Assert.*;

public class FizzBuzzTest {

    @Test
    public void testFizzBuzz() throws Exception {
        FizzBuzz fizzBuzz=new FizzBuzz();

        assertEquals("1\n2\nFizz\n", fizzBuzz.FizzBuzz(3));
        assertEquals("1\n2\nFizz\n4\nBuzz\n",fizzBuzz.FizzBuzz(5));
        assertEquals("1\n2\nFizz\n4\nBuzz\nFizz\n7\n8\nFizz\nBuzz\n11\nFizz\n13\n14\nFizzBuzz\n",fizzBuzz.FizzBuzz(15));
    }
}