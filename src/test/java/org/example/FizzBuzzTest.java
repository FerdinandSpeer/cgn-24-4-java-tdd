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
    void play_shouldReturn1_CalledWith1(){
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
}