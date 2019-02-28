package Abstract_Factory_Pattern;

/**
 * Created by drynl on 7-10-2016.
 */
public class ZoneRCoordinaat implements RCoordinaat {
    private int teller;

    public ZoneRCoordinaat(int teller) {
        this.teller = teller;
    }

    @Override
    public String toString() {
        return "Dit is de R coordinaat van je Zone "+ teller;
    }
}
