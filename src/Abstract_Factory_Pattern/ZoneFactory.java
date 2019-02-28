package Abstract_Factory_Pattern;

/**
 * Created by drynl on 7-10-2016.
 */
public class ZoneFactory {
    int gebouwNummer =0;

    public Zone createZone(String naam){
       Zone zone = null;
        CoordinatenFactory coordinatenFactory = new ZoneCoordinaten(gebouwNummer++);

        if(naam.equals("boomerang")){
            zone = new Boomerang(coordinatenFactory);
            zone.setNaam("Boomerang");
        } else if(naam.equals("president")){
            zone = new President(coordinatenFactory);
            zone.setNaam("President");

        } else if(naam.equals("royal")){
            zone = new Royal(coordinatenFactory);
            zone.setNaam("Royal");
        } else{
            return  null;        }

        return zone;
    }

    public Zone setCoordinaten(String type){
        Zone zone = createZone(type);
        System.out.println("---- Aanmaken van een");
        zone.setCoordinatenFactory();
        System.out.println(zone.getNaam()+"\t"+zone.getR());
        System.out.println(zone.getNaam()+"\t"+zone.getY());
        System.out.println(zone.getNaam()+"\t"+zone.getX());

        return null;
    }
}
