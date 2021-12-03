/*
 * author: Jackson Rolando
 * Course: SE 2811
 * Date Created: 12/02/2021
 */
package rolandoj;

/**
 * This class defines the behaviors of a family of vehicles,
 * the trucks.
 */
public abstract class Truck extends Vehicle implements Plower {

    private double loadCapacity;
    private double plowWidth;

    /**
     * This constructor is used by subclasses to initialize truck objects.
     *
     * @param name      The name of the vehicle
     * @param numWheels The number of wheels the vehicle has
     * @param weight    How much the vehicle weighs
     * @param loadCapacity How much the truck can carry
     * @param plowWidth How wide the plow is
     */
    public Truck(String name, int numWheels, double weight, double loadCapacity, double plowWidth) {
        super(name, numWheels, weight);
        this.loadCapacity = loadCapacity;
        this.plowWidth = plowWidth;
    }

    public double getLoadCapacity() {
        return loadCapacity;
    }

    public void setLoadCapacity(double loadCapacity) {
        this.loadCapacity = loadCapacity;
    }

    public double getPlowWidth() {
        return plowWidth;
    }

    public void setPlowWidth(double plowWidth) {
        this.plowWidth = plowWidth;
    }
}
