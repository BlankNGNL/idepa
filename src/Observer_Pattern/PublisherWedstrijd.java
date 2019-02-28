import java.util.ArrayList;

public class PublisherWedstrijd implements SubjectWedstrijd {
    private int scoreThuis;
    private int scoreUit;
    private int tijdScore;
    private String gescoredSpeler;
    private ArrayList<SubjectObserver> sw_list;


    public PublisherWedstrijd(){
        sw_list = new ArrayList<SubjectObserver>();
    }
    public int getScoreThuis() {
        return scoreThuis;
    }
    public void setScoreThuis(int scoreThuis) {
        this.scoreThuis = scoreThuis;
    }
    public int getScoreUit() {
        return scoreUit;
    }
    public void setScoreUit(int scoreUit) {
        this.scoreUit = scoreUit;
    }
    public int getTijdScore() {
        return tijdScore;
    }
    public void setTijdScore(int tijdScore) {
        this.tijdScore = tijdScore;
    }
    public String getGescoredSpeler() {
        return gescoredSpeler;
    }
    public void setGescoredSpeler(String gescoredSpeler) {
        this.gescoredSpeler = gescoredSpeler;
    }


    public void update() {
        // TODO Auto-generated method stub
        for(SubjectObserver o : sw_list){
            o.update(scoreThuis, scoreUit, tijdScore, gescoredSpeler);
        }
    }


    public void registerObserver(SubjectObserver o) {
        // TODO Auto-generated method stub
        sw_list.add(o);
    }


    public void notifyObserver(SubjectObserver o) {
        // TODO Auto-generated method stub
        this.update();
    }

    public void removeObserver(SubjectObserver o) {
        // TODO Auto-generated method stub
        sw_list.remove(this);
    }

    public void scoreUpdate(int scoreThuis, int scoreUit, int tijdScore, String gescoredSpeler){
        this.scoreThuis = scoreThuis;
        this.scoreUit = scoreUit;
        this.tijdScore = tijdScore;
        this.gescoredSpeler = gescoredSpeler;
        this.update();
    }

}
