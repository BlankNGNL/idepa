package State_Pattern;

/**
 * Created by Shaban on 30-09-16.
 */
public interface PseudoTcpState {

    public void connect();
    public void process();
    public void closedown();
}
