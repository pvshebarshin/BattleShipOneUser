package ships;

import ocean.Ocean;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class ShipTest {

    @Test
    void getLengthTest() {
        Ship b = new Battleship();
        Ship c = new Cruiser();
        Ship d = new Destroyer();
        Ship s = new Submarine();
        Assertions.assertEquals(4, b.getLength());
        Assertions.assertEquals(3, c.getLength());
        Assertions.assertEquals(2, d.getLength());
        Assertions.assertEquals(1, s.getLength());
    }

    @Test
    void getBowRowTest() {
        Ship ship = new Ship();
        ship.setBowRow(4);
        Assertions.assertEquals(4, ship.getBowRow());
    }

    @Test
    void getBowColumnTest() {
        Ship ship = new Ship();
        ship.setBowColumn(4);
        Assertions.assertEquals(4, ship.getBowColumn());
    }

    @Test
    void isHorizontalTest() {
        Ship ship = new Ship();
        ship.setHorizontal(true);
        Assertions.assertTrue(ship.isHorizontal());
    }

    @Test
    void setBowRowTest() {
        Ship ship = new Ship();
        ship.setBowRow(4);
        Assertions.assertEquals(4, ship.getBowRow());
    }

    @Test
    void setBowColumnTest() {
        Ship ship = new Ship();
        ship.setBowColumn(4);
        Assertions.assertEquals(4, ship.getBowColumn());
    }

    @Test
    void setHorizontalTest() {
        Ship ship = new Ship();
        ship.setHorizontal(true);
        Assertions.assertTrue(ship.isHorizontal());
    }

    @Test
    void okToPlaceShipAtTest() {
        Ocean ocean = new Ocean();
        Ship ship = new Battleship();
        Assertions.assertTrue(ship.okToPlaceShipAt(1, 1, true, ocean));
        Assertions.assertFalse(ship.okToPlaceShipAt(9, 9, true, ocean));
    }

    @Test
    void placeShipAtTest() {
        Ocean ocean = new Ocean();
        Ship battleship = new Battleship();
        battleship.placeShipAt(1, 2, true, ocean);
        Assertions.assertEquals(1, battleship.getBowRow());
        Assertions.assertEquals(2, battleship.getBowColumn());
        Assertions.assertTrue(battleship.isHorizontal());
    }

    @Test
    void isSunkAndShootAtTest() {
        Ocean ocean = new Ocean();
        Ship ship = new Submarine();
        ship.placeShipAt(1, 1, true, ocean);
        Assertions.assertFalse(ship.isSunk());
        ship.shootAt(1, 1, ocean);
        Assertions.assertTrue(ship.isSunk());
    }

    @Test
    void getShipTypeTest() {
        Ship b = new Battleship();
        Ship c = new Cruiser();
        Ship d = new Destroyer();
        Ship s = new Submarine();
        Ship e = new EmptySea();
        Assertions.assertEquals("battleship", b.getShipType());
        Assertions.assertEquals("cruiser", c.getShipType());
        Assertions.assertEquals("destroyer", d.getShipType());
        Assertions.assertEquals("submarine", s.getShipType());
        Assertions.assertEquals("emptysea", e.getShipType());
    }
}