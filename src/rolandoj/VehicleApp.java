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
        Car vroom1 = new Car("Kelly", 4, 3200);
        testVehicle(vroom1);
        //vroom1.raisePlow();
        //vroom1.lowerPlow();
        //vroom1.raiseRoof();
        //vroom1.lowerRoof();

        System.out.println();
        Convertible vroom2 = new Convertible("Kerry", 5, 2600);
        testConvertible(vroom2);

        System.out.println();
        ConvertiblePlower vroom3 = new ConvertiblePlower("Kacy", 4, 2600, 48);
        System.out.println("Plow width: " + vroom3.getPlowWidth());
        testConvertible(vroom3);
        testPlower(vroom3);

        System.out.println();
        Pickup vroom4 = new Pickup("Kim", 4, 4000, 1200, 52);
        testTruck(vroom4);

        System.out.println();
        DumpTruck vroom5 = new DumpTruck("Big Kim", 4, 12000, 14000, 52);
        testTruck(vroom5);
        vroom5.raiseLoad();
        vroom5.lowerLoad();
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

    public static void testConvertible(Convertible convertible) {
        testVehicle(convertible);
        convertible.raiseRoof();
        convertible.lowerRoof();
    }

    public static void testTruck(Truck truck) {
        testVehicle(truck);
        System.out.println("Load capacity: " + truck.getLoadCapacity());
        System.out.println("Plow width: " + truck.getPlowWidth());
        testPlower(truck);
    }

    public static void testPlower(Plower plower) {
        plower.raisePlow();
        plower.lowerPlow();
    }
}
