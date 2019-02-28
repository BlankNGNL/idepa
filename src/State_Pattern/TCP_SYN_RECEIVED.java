package State_Pattern;

/**
 * Created by Shaban on 30-09-16.
 */
public class TCP_SYN_RECEIVED implements PseudoTcpState {

    private PseudoTCPBase pseudoTCPBase;

    public TCP_SYN_RECEIVED(PseudoTCPBase pseudoTCPBase) {
        this.pseudoTCPBase = pseudoTCPBase;
    }

    @Override
    public String toString() {
        return "State: TCP_SYN_RECEIVED";
    }

    public void connect() {
        System.out.println("Error: cannot connect in TCP_SYN_RECEIVED state");
    }

    public void process() {
        System.out.println("Processing en change currentstate to: TCP_ESTABLISHED");
        pseudoTCPBase.setCurrentState( pseudoTCPBase.getEstablishedState() );
    }

    public void closedown() {
        System.out.println("Error: cannot connect in TCP_SYN_RECEIVED state");
    }
}
