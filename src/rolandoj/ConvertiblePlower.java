/*
 * author: Jackson Rolando
 * Course: SE 2811
 * Date Created: 12/02/2021
 */
package rolandoj;

/**
 * This class defines the behaviors of a very practical
 * convertible that can plow.
 */
public class ConvertiblePlower extends Convertible implements Plower {

    private double plowWidth;

    /**
     * This constructor initializes a ConvertiblePlower object.
     *
     * @param name The name of the vehicle
     * @param numWheels The number of wheels the vehicle has
     * @param weight How much the vehicle weighs
     * @param plowWidth The width of the plow
     */
    public ConvertiblePlower(String name, int numWheels, double weight, double plowWidth) {
        super(name, numWheels, weight);
        this.plowWidth = plowWidth;
    }

    public double getPlowWidth() {
        return plowWidth;
    }

    public void setPlowWidth(double plowWidth) {
        this.plowWidth = plowWidth;
    }
}
