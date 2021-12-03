/*
 * author: Jackson Rolando
 * Course: SE 2811
 * Date Created: 12/02/2021
 */
package rolandoj;

/**
 * This class defines the behaviors of a very practical
 * pickup truck.
 */
public class Pickup extends Truck {
    /**
     * This constructor initializes a pickup truck.
     *
     * @param name         The name of the vehicle
     * @param numWheels    The number of wheels the vehicle has
     * @param weight       How much the vehicle weighs
     * @param loadCapacity How much the truck can carry
     * @param plowWidth    How wide the plow is
     */
    public Pickup(String name, int numWheels, double weight, double loadCapacity, double plowWidth) {
        super(name, numWheels, weight, loadCapacity, plowWidth);
    }
}
