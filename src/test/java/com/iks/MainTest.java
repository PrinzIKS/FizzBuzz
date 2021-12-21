package com.iks;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class MainTest {

    @Test
    void test1() {
        String expected = "1";
        String actual = Main.fizzBuzz(1);
        assertEquals(expected, actual);
    }

    @Test
    void test2() {
        String expected = "2";
        String actual = Main.fizzBuzz(2);
        assertEquals(expected, actual);
    }

    @Test
    void test3() {
        String expected = "Fizz";
        String actual = Main.fizzBuzz(3);
        assertEquals(expected, actual);
    }

    @Test
    void test4() {
        String expected = "4";
        String actual = Main.fizzBuzz(4);
        assertEquals(expected, actual);
    }

    @Test
    void test5() {
        String expected = "Buzz";
        String actual = Main.fizzBuzz(5);
        assertEquals(expected, actual);
    }

    @Test
    void test6() {
        String expected = "Fizz";
        String actual = Main.fizzBuzz(6);
        assertEquals(expected, actual);
    }

    @Test
    void test10() {
        String expected = "Buzz";
        String actual = Main.fizzBuzz(10);
        assertEquals(expected, actual);
    }

    @Test
    void test15() {
        String expected = "FizzBuzz";
        String actual = Main.fizzBuzz(15);
        assertEquals(expected, actual);
    }

    @Test
    void test7() {
        String expected = "Whizz";
        String actual = Main.fizzBuzz(7);
        assertEquals(expected, actual);
    }

    @Test
    void test21() {
        String expected = "FizzWhizz";
        String actual = Main.fizzBuzz(21);
        assertEquals(expected, actual);
    }

    @Test
    void test105() {
        String expected = "FizzBuzzWhizz";
        String actual = Main.fizzBuzz(105);
        assertEquals(expected, actual);
    }

    @Test
    void test13() {
        String expected = "Fizz";
        String actual = Main.fizzBuzz(13);
        assertEquals(expected, actual);
    }

    @Test
    void test35() {
        String expected = "FizzBuzzWhizz";
        String actual = Main.fizzBuzz(35);
        assertEquals(expected, actual);
    }

    @Test
    void test57() {
        String expected = "FizzBuzzWhizz";
        String actual = Main.fizzBuzz(57);
        assertEquals(expected, actual);
    }

    @Test
    void test71() {
        String expected = "Whizz";
        String actual = Main.fizzBuzz(71);
        assertEquals(expected, actual);
    }

    @Test
    void test33() {
        String expected = "Fizz";
        String actual = Main.fizzBuzz(33);
        assertEquals(expected, actual);
    }

}
