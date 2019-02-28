package Abstract_Factory_Pattern;

/**
 * Created by drynl on 7-10-2016.
 */
public class VakCoordinaten implements CoordinatenFactory {
    @Override
    public XCoordinaat createXCoordinaat() {
        return new VakXCoordinaat();
    }

    @Override
    public YCoordinaat createYCoordinaat() {
        return new VakYCoordinaat();
    }

    @Override
    public RCoordinaat createRCoordinaat() {
        return  new VakRCoordinaat();
    }
}
