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

}