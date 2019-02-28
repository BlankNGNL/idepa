
public interface SubjectWedstrijd {
    public void registerObserver(SubjectObserver o);
    public void notifyObserver(SubjectObserver o);
    public void removeObserver(SubjectObserver o);
}
