package Adapter_Pattern;

/**
 * Created by Mike on 30-Oct-16.
 */
public class UsbAdapter implements UsbTarget {

  private Mouse mouse;


    public UsbAdapter(Mouse mouse) {
        this.mouse = mouse;
    }

    @Override
    public void Connect() {
        mouse.Connect();
        System.out.println("Converting signal to USB");
        System.out.println("Sending new converted signals to Computer");
    }
}
