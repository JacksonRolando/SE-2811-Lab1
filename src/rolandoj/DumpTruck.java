/*
 * author: Jackson Rolando
 * Course: SE 2811
 * Date Created: 12/02/2021
 */
package rolandoj;

/**
 * This class defines the behaviors of a dump truck
 */
public class DumpTruck extends Truck {

    /**
     * This constructor initializes a dump truck object
     *
     * @param name         The name of the vehicle
     * @param numWheels    The number of wheels the vehicle has
     * @param weight       How much the vehicle weighs
     * @param loadCapacity How much the truck can carry
     * @param plowWidth    How wide the plow is
     */
    public DumpTruck(String name, int numWheels, double weight, double loadCapacity, double plowWidth) {
        super(name, numWheels, weight, loadCapacity, plowWidth);
    }

    /**
     * This method raises the dump truck's load.
     */
    public void raiseLoad() {
        System.out.println(getName() + " raising load...");
    }

    /**
     * This method lowers the dump truck's load.
     */
    public void lowerLoad() {
        System.out.println(getName() + " lowering load...");
    }

}
