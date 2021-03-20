package ocean;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import ships.Ship;
import ships.Submarine;

class OceanTest {

    @Test
    void isOccupied() {
        Ocean ocean = new Ocean();
        Ship ship = new Submarine();
        ship.placeShipAt(1, 1, true, ocean);
        Assertions.assertTrue(ocean.isOccupied(1, 1));
        Assertions.assertFalse(ocean.isOccupied(2, 1));
    }

    @Test
    void shootAt() {
        Ocean ocean = new Ocean();
        Ship ship = new Submarine();
        ship.placeShipAt(1, 1, true, ocean);
        Assertions.assertFalse(ship.isSunk());
        ocean.shootAt(1, 1);
        Assertions.assertTrue(ship.isSunk());
    }

    @Test
    void getShotsFired() {
        Ocean ocean = new Ocean();
        Assertions.assertEquals(0, ocean.getShotsFired());
        for (int i = 0; i < 10; i++) {
            ocean.shootAt(1, i);
        }
        Assertions.assertEquals(10, ocean.getShotsFired());
    }

    @Test
    void getHitCount() {
        Ocean ocean = new Ocean();
        ocean.placeAllShipsRandomly();
        Assertions.assertEquals(0, ocean.getHitCount());
        for (int i = 0; i < 10; i++) {
            for (int j = 0; j < 10; j++) {
                ocean.shootAt(i, j);
            }
        }
        Assertions.assertEquals(0, ocean.getHitCount());
    }

    @Test
    void getShipsSunk() {
        Ocean ocean = new Ocean();
        ocean.placeAllShipsRandomly();
        Assertions.assertEquals(0, ocean.getShipsSunk());
        for (int i = 0; i < 10; i++) {
            for (int j = 0; j < 10; j++) {
                ocean.shootAt(i, j);
            }
        }
        Assertions.assertEquals(0, ocean.getShipsSunk());
    }

    @Test
    void isGameOver() {
        Ocean ocean = new Ocean();
        ocean.placeAllShipsRandomly();
        Assertions.assertFalse(ocean.isGameOver());
        for (int i = 0; i < 10; i++) {
            for (int j = 0; j < 10; j++) {
                ocean.shootAt(i, j);
            }
        }
        Assertions.assertTrue(ocean.isGameOver());
    }
}