package Abstract_Factory_Pattern;

/**
 * Created by drynl on 7-10-2016.
 */
public interface CoordinatenFactory {
    public XCoordinaat createXCoordinaat();
    public YCoordinaat createYCoordinaat();
    public RCoordinaat createRCoordinaat();
}
