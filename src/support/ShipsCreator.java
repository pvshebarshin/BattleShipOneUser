package support;

import ocean.Ocean;
import ships.*;

import java.util.Random;

/**
 * This is support class.
 * It helps to put ships in ocean
 */
public class ShipsCreator {
    private static final Random random = new Random();

    /**
     * This method puts Battleship
     *
     * @param ocean ocean there method will put Battleship
     */
    public static void putBattleship(Ocean ocean) {
        putShip(ocean, new Battleship());
    }

    /**
     * This method puts Cruisers
     *
     * @param ocean ocean there method will put Cruisers
     */
    public static void putCruiser(Ocean ocean) {
        for (int i = 0; i < 2; i++)
            putShip(ocean, new Cruiser());
    }

    /**
     * This method puts Destroyers
     *
     * @param ocean ocean there method will put Destroyers
     */
    public static void putDestroyer(Ocean ocean) {
        for (int i = 0; i < 3; i++)
            putShip(ocean, new Destroyer());
    }

    /**
     * This method puts Submarines
     *
     * @param ocean ocean there method will put Submarines
     */
    public static void putSubmarine(Ocean ocean) {
        for (int i = 0; i < 4; i++)
            putShip(ocean, new Submarine());
    }

    /**
     * This method puts in ocean
     *
     * @param ocean ocean there method will put ship
     * @param ship  ship that will be put in ocean
     */
    private static void putShip(Ocean ocean, Ship ship) {
        int row;
        int column;
        boolean horizontal;
        boolean checkShip;
        do {
            row = (int) (Math.random() * 10);
            column = (int) (Math.random() * 10);
            horizontal = random.nextBoolean();
            checkShip = ship.okToPlaceShipAt(row, column, horizontal, ocean);
            if (ship.okToPlaceShipAt(row, column, horizontal, ocean)) {
                ship.placeShipAt(row, column, horizontal, ocean);
            }
        } while (!checkShip);
    }
}
