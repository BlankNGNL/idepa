
public class ObserverMobiel implements SubjectObserver{
    private int scoreThuis;
    private int scoreUit;
    private int tijdScore;
    private String gescoredSpeler;
    private PublisherWedstrijd pw;

    public ObserverMobiel(PublisherWedstrijd pw){
        this.pw = pw;
        pw.registerObserver(this);
    }

    public void display() {
        // TODO Auto-generated method stub
        System.out.println("-------------------");
        System.out.println("Mobiel");
        System.out.println("Score Thuis: " + this.scoreThuis);
        System.out.println("Score Uit: " + this.scoreUit);
        System.out.println("Tijd gescored(min): " + this.tijdScore);
        System.out.println("Gescored Speler: " + this.gescoredSpeler);
    }

    public void update(int scoreThuis, int scoreUit, int tijdScore, String gescoredSpeler) {
        // TODO Auto-generated method stub
        this.scoreThuis = scoreThuis;
        this.scoreUit = scoreUit;
        this.tijdScore = tijdScore;
        this.gescoredSpeler = gescoredSpeler;
        this.display();
    }

}
