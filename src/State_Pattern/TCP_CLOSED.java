package State_Pattern;

/**
 * Created by Shaban on 30-09-16.
 */
public class TCP_CLOSED implements PseudoTcpState {

    private PseudoTCPBase pseudoTCPBase;

    public TCP_CLOSED(PseudoTCPBase pseudoTCPBase) {
        this.pseudoTCPBase = pseudoTCPBase;
    }

    @Override
    public String toString() {
        return "State: TCP_CLOSED";
    }

    public void connect() {
        System.out.println("Error: cannot connect in TCP_CLOSED state");
    }

    public void process() {
        System.out.println("Error: cannot process in TCP_CLOSED state");
    }

    public void closedown() {
        System.out.println("Error: cannot close in TCP_CLOSED state");
    }
}
