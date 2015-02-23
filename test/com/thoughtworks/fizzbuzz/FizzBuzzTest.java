package com.thoughtworks.fizzbuzz;

import org.junit.Test;

import static org.junit.Assert.*;

public class FizzBuzzTest {

    @Test
    public void testFizz() throws Exception {
        FizzBuzz fizzBuzz = new FizzBuzz();

        assertEquals("Fizz", fizzBuzz.isFizzBuzz(3));
    }

    @Test
    public void testBuzz() throws Exception {
        FizzBuzz fizzBuzz = new FizzBuzz();

        assertEquals("Buzz", fizzBuzz.isFizzBuzz(5));

    }

    @Test
    public void testFizzBuzz() throws Exception {
        FizzBuzz fizzBuzz = new FizzBuzz();

        assertEquals("1\n2\nFizz\n", fizzBuzz.fizzBuzz(3));
        assertEquals("1\n2\nFizz\n4\nBuzz\n", fizzBuzz.fizzBuzz(5));
        assertEquals("1\n2\nFizz\n4\nBuzz\nFizz\n7\n8\nFizz\nBuzz\n11\nFizz\n13\n14\nFizzBuzz\n", fizzBuzz.fizzBuzz(15));
    }
}