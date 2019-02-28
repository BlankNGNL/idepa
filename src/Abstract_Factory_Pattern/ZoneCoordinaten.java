package Abstract_Factory_Pattern;

/**
 * Created by drynl on 7-10-2016.
 */
public class ZoneCoordinaten implements CoordinatenFactory {
    private int teller;

    public ZoneCoordinaten(int teller) {
        this.teller = teller;
    }

    @Override
    public XCoordinaat createXCoordinaat() {
        return new ZoneXCoordinaat();
    }

    @Override
    public YCoordinaat createYCoordinaat() {
        return new ZoneYCoordinaat();
    }

    @Override
    public RCoordinaat createRCoordinaat() {
        return  new ZoneRCoordinaat
                (teller);
    }
}
