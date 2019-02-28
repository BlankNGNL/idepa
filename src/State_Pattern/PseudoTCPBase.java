package State_Pattern;

/**
 * Created by Shaban on 30-09-16.
 */
public class PseudoTCPBase {

    private PseudoTcpState listenState;
    private PseudoTcpState sentState;
    private PseudoTcpState receivedState;
    private PseudoTcpState establishedState;
    private PseudoTcpState closedState;
    private PseudoTcpState currentState;

    public PseudoTCPBase() {
        this.listenState = new TCP_LISTEN(this);
        this.sentState = new TCP_SYN_SENT(this);
        this.receivedState = new TCP_SYN_RECEIVED(this);
        this.establishedState = new TCP_ESTABLISHED(this);
        this.closedState = new TCP_CLOSED(this);
        this.currentState = listenState;

    }

    public PseudoTcpState getListenState() {
        return listenState;
    }

    public PseudoTcpState getSentState() {
        return sentState;
    }

    public PseudoTcpState getReceivedState() {
        return receivedState;
    }

    public PseudoTcpState getEstablishedState() {
        return establishedState;
    }

    public PseudoTcpState getClosedState() {
        return closedState;
    }

    public PseudoTcpState getCurrentState() {
        return currentState;
    }

    public void setCurrentState(PseudoTcpState currentState) {
        this.currentState = currentState;
    }

    public void connect() {
        this.currentState.connect();
    }

    public void process() {
        this.currentState.process();
    }

    public void closedown() {
        this.currentState.closedown();
    }
}
