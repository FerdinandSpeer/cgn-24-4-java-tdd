package org.example;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class PlayerCharacterTest {
    @Test
    void getX_returnTheValue0(){
        //GIVEN
        int expected = 0;
        //WHEN
        int actual = PlayerCharacter.getX();
        //THEN
        assertEquals(expected, actual);
    }

    @Test
    void getY_returnTheValue0(){
        //GIVEN
        int expected = 0;
        //WHEN
        int actual = PlayerCharacter.getY();
        //THEN
        assertEquals(expected, actual);
    }

    @Test
    void move_returnY1_whenCalledW(){
        //GIVEN
        int expected = 1;
        //WHEN
        int actual = PlayerCharacter.move("W");
        //THEN
        assertEquals(expected, actual);
    }

}