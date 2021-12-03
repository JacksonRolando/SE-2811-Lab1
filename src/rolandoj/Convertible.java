/*
 * author: Jackson Rolando
 * Course: SE 2811
 * Date Created: 12/02/2021
 */
package rolandoj;

/**
 * This class defines the behaviors of a convertible car.
 */
public class Convertible extends Car {

    /**
     * This constructor initializes a Convertible object.
     *
     * @param name The name of the vehicle
     * @param numWheels The number of wheels the vehicle has
     * @param weight How much the vehicle weighs
     */
    public Convertible(String name, int numWheels, double weight) {
        super(name, numWheels, weight);
    }

    /**
     * This method raises the roof.
     */
    public void raiseRoof() {
        System.out.println(getName() + " raising roof...");
    }

    /**
     * This method lowers the roof.
     */
    public void lowerRoof() {
        System.out.println(getName() + " lowering roof...");
    }

}
