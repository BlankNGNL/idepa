package State_Pattern;

/**
 * Created by Shaban on 30-09-16.
 */
public class TCP_LISTEN implements PseudoTcpState {

    private PseudoTCPBase pseudoTCPBase;

    public TCP_LISTEN(PseudoTCPBase pseudoTCPBase) {
        this.pseudoTCPBase = pseudoTCPBase;
    }

    @Override
    public String toString() {
        return "State: TCP_LISTEN";
    }


    public void connect() {
        System.out.println("Connecting en changing currentstate to: TCP_SYN_SENT");
        pseudoTCPBase.setCurrentState( pseudoTCPBase.getSentState() );
    }

    public void process() {
        System.out.println("Processing en change currentstate to: TCP_SYN_RECEIVED");
        pseudoTCPBase.setCurrentState( pseudoTCPBase.getReceivedState() );
    }

    public void closedown() {
        System.out.println("Error: cannot close in TCP_LISTEN state");
    }
}
