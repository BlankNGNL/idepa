package Strategy_Pattern.Duck;

import Strategy_Pattern.interfaces.FlyBehavior;
import Strategy_Pattern.interfaces.QuackBehavior;

/**
 * Created by Mike on 14-Oct-16.
 */
public class DecoyDuck extends Duck {
    public DecoyDuck(FlyBehavior flyBehaviour, QuackBehavior quackBehavior) {
        super(flyBehaviour, quackBehavior);
    }

    @Override
    public void display() {
        System.out.println("Im a DecoyDuck");
    }
}
