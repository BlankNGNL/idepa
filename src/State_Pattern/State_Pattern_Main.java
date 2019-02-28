package State_Pattern;

public class State_Pattern_Main {

    public static void main(String[] args) {

        PseudoTCPBase pseudoTCPBase = new PseudoTCPBase();

        System.out.println(pseudoTCPBase.getCurrentState());
        pseudoTCPBase.connect();
        System.out.println(pseudoTCPBase.getCurrentState());
        pseudoTCPBase.process();
        System.out.println(pseudoTCPBase.getCurrentState());
        pseudoTCPBase.closedown();
        System.out.println(pseudoTCPBase.getCurrentState());




    }

}
