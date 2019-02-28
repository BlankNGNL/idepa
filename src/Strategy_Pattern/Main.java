package Strategy_Pattern;

import Strategy_Pattern.Duck.Duck;
import Strategy_Pattern.Duck.MallardDuck;
import Strategy_Pattern.behaviors.FlyWithRocket;
import Strategy_Pattern.behaviors.FlyWithWings;
import Strategy_Pattern.behaviors.Quack;

/**
 * Created by Mike on 14-Oct-16.
 */
public class Main {
    public static void main(String[] args) {

        Duck mallardDuck = new MallardDuck(new FlyWithWings(),new Quack());

        mallardDuck.performFly();
        mallardDuck.performQuack();
        mallardDuck.display();

        System.out.println("-------------");

        mallardDuck.setFlyBehavior(new FlyWithRocket());
        mallardDuck.performFly();
        mallardDuck.performQuack();
        mallardDuck.display();

    }
}
