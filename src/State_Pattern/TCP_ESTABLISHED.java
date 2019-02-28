package State_Pattern;

/**
 * Created by Shaban on 30-09-16.
 */
public class TCP_ESTABLISHED implements PseudoTcpState {

    private PseudoTCPBase pseudoTCPBase;

    public TCP_ESTABLISHED(PseudoTCPBase pseudoTCPBase) {
        this.pseudoTCPBase = pseudoTCPBase;
    }

    @Override
    public String toString() {
        return "State: TCP_ESTABLISHED";
    }

    public void connect() {
        System.out.println("Error: cannot connect in TCP_ESTABLISHED state");
    }

    public void process() {
        System.out.println("Error: cannot process in TCP_ESTABLISHED state");
    }

    public void closedown() {
        System.out.println("Close connection en change currentstate to: TCP_CLOSED");
        pseudoTCPBase.setCurrentState( pseudoTCPBase.getClosedState());
    }
}
