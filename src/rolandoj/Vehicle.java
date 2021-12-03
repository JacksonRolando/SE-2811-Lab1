/*
 * author: Jackson Rolando
 * Course: SE 2811
 * Date Created: 12/02/2021
 */
package rolandoj;

/**
 * This abstract class defines the general behaviors of a vehicle.
 */
public abstract class Vehicle {
    private int numWheels;
    private double weight;
    private String name;

    /**
     * This constructor is used by subclasses to initialize vehicle objects.
     *
     * @param name The name of the vehicle
     * @param numWheels The number of wheels the vehicle has
     * @param weight How much the vehicle weighs
     */
    public Vehicle(String name, int numWheels, double weight){
        this.name = name;
        this.numWheels = numWheels;
        this.weight = weight;
    }

    /**
     * This method makes the car go forward.
     *
     * @param speed The speed at which to go
     * @param acceleration The acceleration of the movement
     */
    public void goForward(double speed, double acceleration) {
        System.out.printf(getName() + " going forward with speed %f and acceleration %f\n", speed, acceleration);
    }

    /**
     * This method makes the car go backward.
     *
     * @param speed The speed at which to go
     * @param acceleration The acceleration of the movement
     */
    public void goBackward(double speed, double acceleration) {
        System.out.printf(getName() + " going backward with speed %f and acceleration %f\n", speed, acceleration);
    }

    /**
     * This method starts the vehicle.
     */
    public void start() {
        System.out.println(getName() + " starting...");
    }

    /**
     * This method stops the vehicle.
     */
    public void stop() {
        System.out.println(getName() + " stopping...");
    }

    public int getNumWheels() {
        return numWheels;
    }

    public void setNumWheels(int numWheels) {
        this.numWheels = numWheels;
    }

    public double getWeight() {
        return weight;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
