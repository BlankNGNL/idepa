package Abstract_Factory_Pattern;


/**
 * Created by drynl on 7-10-2016.
 */
public class Main {
    public static void main(String[] args) {
        ZoneFactory zoneFactory = new ZoneFactory();
        zoneFactory.setCoordinaten("boomerang");
        zoneFactory.setCoordinaten("royal");

    }
}
