package Facade_Pattern;

/**
 * Created by Mike on 30-Oct-16.
 */
public class Cheese {
    private String name;

    public Cheese(String name){
        this.name = name;
    }

    public String toString(){
        return name;
    }
}
