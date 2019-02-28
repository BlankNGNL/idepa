package Adapter_Pattern;

/**
 * Created by Mike on 30-Oct-16.
 */
public class Main {
    public static void main(String[] args){
        Mouse mouseAdaptee = new MouseAdaptee();
        UsbTarget usbTarget = new UsbAdapter(mouseAdaptee);
        usbTarget.Connect();

        System.out.println("Got the Signal!");
        System.out.println("-----------------------------");

        Mouse mouseTurk = new MouseTurk();
        UsbTarget usbTarget1 = new UsbAdapter(mouseTurk);
        usbTarget1.Connect();
        System.out.println("Got the Signal!");

    }
}
