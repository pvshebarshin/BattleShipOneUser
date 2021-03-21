package support;

import ocean.Ocean;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class ShipsCreatorTest {

    @Test
    void putBattleshipTest() {
        Ocean ocean = new Ocean();
        ShipsCreator.putBattleship(ocean);
        for (int i = 0; i < 10; i++) {
            for (int j = 0; j < 10; j++) {
                ocean.shootAt(i, j);
            }
        }
        Assertions.assertEquals(4, ocean.getHitCount());
        Assertions.assertEquals(1, ocean.getShipsSunk());
        Assertions.assertTrue(ocean.isGameOver());
    }

    @Test
    void putCruiserTest() {
        Ocean ocean = new Ocean();
        ShipsCreator.putCruiser(ocean);
        for (int i = 0; i < 10; i++) {
            for (int j = 0; j < 10; j++) {
                ocean.shootAt(i, j);
            }
        }
        Assertions.assertEquals(6, ocean.getHitCount());
        Assertions.assertEquals(2, ocean.getShipsSunk());
        Assertions.assertTrue(ocean.isGameOver());
    }

    @Test
    void putDestroyerTest() {
        Ocean ocean = new Ocean();
        ShipsCreator.putDestroyer(ocean);
        for (int i = 0; i < 10; i++) {
            for (int j = 0; j < 10; j++) {
                ocean.shootAt(i, j);
            }
        }
        Assertions.assertEquals(6, ocean.getHitCount());
        Assertions.assertEquals(3, ocean.getShipsSunk());
        Assertions.assertTrue(ocean.isGameOver());
    }

    @Test
    void putSubmarineTest() {
        Ocean ocean = new Ocean();
        ShipsCreator.putSubmarine(ocean);
        for (int i = 0; i < 10; i++) {
            for (int j = 0; j < 10; j++) {
                ocean.shootAt(i, j);
            }
        }
        Assertions.assertEquals(4, ocean.getHitCount());
        Assertions.assertEquals(4, ocean.getShipsSunk());
        Assertions.assertTrue(ocean.isGameOver());
    }
}