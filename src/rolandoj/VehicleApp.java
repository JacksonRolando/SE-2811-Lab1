/*
 * author: Jackson Rolando
 * Course: SE 2811
 * Date Created: 12/02/2021
 */
package rolandoj;

/**
 * This app instantiates many vehicles of different types.
 */
public class VehicleApp {
    public static void main(String[] args) {
        //Car vroom1 = new Car("", )
    }

    public static void testVehicle(Vehicle vehicle) {
        System.out.println(vehicle.getName() + ": ");
        vehicle.start();
        vehicle.stop();
        vehicle.goForward(25, 10);
        vehicle.goBackward(25, 10);
        System.out.println("Wheels: " + vehicle.getNumWheels());
        System.out.println("Weight: " + vehicle.getWeight());
    }

    public static void testPlower(Plower plower) {
        plower.raisePlow();
        plower.lowerPlow();
    }
}
