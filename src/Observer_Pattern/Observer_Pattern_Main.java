/**
 * Created by drynl on 22-9-2016.
 */
public class Observer_Pattern_Main {
    public static void main(String[] args) {
        // TODO Auto-generated method stub
        PublisherWedstrijd pw = new PublisherWedstrijd();
        ObserverTV tv = new ObserverTV(pw);
        ObserverMobiel mobiel = new ObserverMobiel(pw);

        pw.scoreUpdate(1, 1, 45, "Messi");
        pw.scoreUpdate(1, 2, 78, "CR7");
    }
}
