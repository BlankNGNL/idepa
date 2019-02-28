package Abstract_Factory_Pattern;

/**
 * Created by drynl on 7-10-2016.
 */
public class Zone {
    private CoordinatenFactory coordinatenFactory;
    private String naam;
    protected XCoordinaat x;
    protected RCoordinaat r;
    protected YCoordinaat y;

    public Zone(CoordinatenFactory coordinatenFactory) {
        this.coordinatenFactory = coordinatenFactory;
    }

    public String getNaam() {
        return naam;
    }

    public void setNaam(String naam) {
        this.naam = naam;
    }

    public XCoordinaat getX() {
        return x;
    }

    public RCoordinaat getR() {
        return r;
    }

    public YCoordinaat getY() {
        return y;
    }


    public void setCoordinatenFactory(){
        x = coordinatenFactory.createXCoordinaat();
        y = coordinatenFactory.createYCoordinaat();
        r = coordinatenFactory.createRCoordinaat();
    }

}
