package Adapter_Pattern;

/**
 * Created by Mike on 30-Oct-16.
 */
public class MouseTurk implements Mouse {
    @Override
    public  void Connect(){
        System.out.println("MouseTurk connecting to USB ");
    }
}
