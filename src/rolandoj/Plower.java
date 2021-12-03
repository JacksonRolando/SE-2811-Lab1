/*
 * author: Jackson Rolando
 * Course: SE 2811
 * Date Created: 12/02/2021
 */
package rolandoj;

/**
 * This interface defines actions that a
 * vehicle with a plow can perform.
 */
public interface Plower {

    /**
     * This method raises the plow.
     */
    default void raisePlow() {
        System.out.println(getName() + " raising plow...");
    }

    /**
     * This method lowers the plow.
     */
    default void lowerPlow() {
        System.out.println(getName() + " lowering plow...");
    }

    /**
     * This gets the name of the object implementing the interface.
     *
     * @return name of the object
     */
    String getName();
}
