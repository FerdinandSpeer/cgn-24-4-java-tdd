package org.example;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class PlayerCharacterTest {
    @Test
    void getX_returnTheValue0(){
        int expected = 0;
        int actual = PlayerCharacter.getX();
        assertEquals(expected, actual);
    }

    @Test
    void getY_returnTheValue0(){
        int expected = 0;
        int actual = PlayerCharacter.getY();
        assertEquals(expected, actual);
    }

    @Test
    void move_increaseYby1_whenCalledW(){
        PlayerCharacter.x = 0;
        PlayerCharacter.y = 0;
        PlayerCharacter.move('w');

       assertEquals(1, PlayerCharacter.y);
    }

    @Test
    void move_decreaseYby1_whenCalledS(){
        PlayerCharacter.x = 0;
        PlayerCharacter.y = 0;
        PlayerCharacter.move('s');

        assertEquals(-1, PlayerCharacter.y);
    }
    @Test
    void move_increaseXby1_whenCalledD(){
        PlayerCharacter.x = 0;
        PlayerCharacter.y = 0;
        PlayerCharacter.move('d');

        assertEquals(1, PlayerCharacter.x);
    }
    @Test
    void move_decreaseXby1_whenCalledA(){
        PlayerCharacter.x = 0;
        PlayerCharacter.y = 0;
        PlayerCharacter.move('a');

        assertEquals(-1, PlayerCharacter.x);
    }
}