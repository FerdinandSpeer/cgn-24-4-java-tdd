package org.example;

public class PlayerCharacter {

    static int y = 0;
    static int x = 0;

    /**
 * Anforderungen 2D Spiel:
 * 1. Spielfeldgröße auf 5x5 festlegen
 * 2. 0-Position des Spieler festlegen
 * 3. Movement up auf Key W festlegen
 * 4. Movement down auf Key S festlegen
 * 5. Movement left auf Key A festlegen
 * 6. Movement right auf Key D festlegen
 */

    public static int getX() {
        return 0;
    }

    public static int getY() {
        return 0;
    }

    public static void move(char move) {
        if (move == 'w'){
            y++;
        }else if (move == 's'){
            y--;
        } else if (move == 'd') {
            x++;
        } else if (move == 'a') {
            x--;
        }
    }

}
