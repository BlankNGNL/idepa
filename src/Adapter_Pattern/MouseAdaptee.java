package Adapter_Pattern;

/**
 * Created by Mike on 30-Oct-16.
 * ADAPTEEEEEE
 */
public class MouseAdaptee implements Mouse {
    @Override
    public  void Connect(){
        System.out.println("Sending signal to USB ");
    }
}
