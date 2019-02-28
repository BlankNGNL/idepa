package Strategy_Pattern.behaviors;

/**
 * Created by Mike on 14-Oct-16.
 */
public class Quack implements Strategy_Pattern.interfaces.QuackBehavior {

    @Override
    public void quack() {
        System.out.println("Quacking!");
    }
}
