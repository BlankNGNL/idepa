package Facade_Pattern;

/**
 * Created by Mike on 30-Oct-16.
 */
public class Main {

    public static void main(String[] args){

        FacadePizza facadePizza = new FacadePizza("Kaas","Deeg","Kip");
        facadePizza.createPizza();

        FacadePizza facadePizza2 = new FacadePizza("NLKaas","DeegDab","Varken");
        facadePizza2.createPizza();
    }
}
