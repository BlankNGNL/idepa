package Strategy_Pattern.behaviors;

import Strategy_Pattern.interfaces.FlyBehavior;

/**
 * Created by Mike on 14-Oct-16.
 */
public class FlyWithRocket implements FlyBehavior {
    @Override
    public void fly() {
        System.out.println("Flying with Rockets!!!!!");
    }
}
