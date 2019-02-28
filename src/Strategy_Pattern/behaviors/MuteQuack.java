package Strategy_Pattern.behaviors;

import Strategy_Pattern.interfaces.QuackBehavior;

/**
 * Created by Mike on 14-Oct-16.
 */
public class MuteQuack implements QuackBehavior {
    @Override
    public void quack() {
        System.out.println("I cant Quack!");
    }
}
