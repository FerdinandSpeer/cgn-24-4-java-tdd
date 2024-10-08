package org.example;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class FizzBuzzTest {
    @Test
    void play_shouldReturn1_CalledWith1(){
        //GIVEN
        int number = 1;
        String expected = "1";
        //WHEN
        String actual = FizzBuzz.play(number);
        //THEN
        assertEquals(expected, actual);
    }
    @Test
    void play_shouldReturn4_CalledWith4(){
        //GIVEN
        int number = 4;
        String expected = "4";
        //WHEN
        String actual = FizzBuzz.play(number);
        //THEN
        assertEquals(expected, actual);
    }

    @Test
    void play_shouldReturnFizz_CalledWith3(){
        //GIVEN
        int number = 3;
        String expected = "Fizz";
        //WHEN
        String actual = FizzBuzz.play(number);
        //THEN
        assertEquals(expected, actual);
    }
    @Test
    void play_shouldReturnFizz_CalledWith6(){
        //GIVEN
        int number = 6;
        String expected = "Fizz";
        //WHEN
        String actual = FizzBuzz.play(number);
        //THEN
        assertEquals(expected, actual);
    }

    @Test
    void play_shouldReturnBuzz_CalledWith5(){
        //GIVEN
        int number = 5;
        String expected = "Buzz";
        //WHEN
        String actual = FizzBuzz.play(number);
        //THEN
        assertEquals(expected, actual);
    }

    @Test
    void play_shouldReturnBuzz_CalledWith10(){
        //GIVEN
        int number = 10;
        String expected = "Buzz";
        //WHEN
        String actual = FizzBuzz.play(number);
        //THEN
        assertEquals(expected, actual);
    }

    @Test
    void play_shouldReturnFizzBuzz_CalledWith15(){
        //GIVEN
        int number = 15;
        String expected = "FizzBuzz";
        //WHEN
        String actual = FizzBuzz.play(number);
        //THEN
        assertEquals(expected, actual);
    }

    @Test
    void play_shouldReturnFizzBuzz_CalledWith0(){
        //GIVEN
        int number = 0;
        String expected = "FizzBuzz";
        //WHEN
        String actual = FizzBuzz.play(number);
        //THEN
        assertEquals(expected, actual);
    }

    @Test
    void play_shouldReturnFizzBuzz_CalledWithMinus1(){
        //GIVEN
        int number = -1;
        String expected = "-1";
        //WHEN
        String actual = FizzBuzz.play(number);
        //THEN
        assertEquals(expected, actual);
    }

    @Test
    void play_shouldReturnFizzBuzz_CalledWithMinus15(){
        //GIVEN
        int number = -15;
        String expected = "FizzBuzz";
        //WHEN
        String actual = FizzBuzz.play(number);
        //THEN
        assertEquals(expected, actual);
    }

}