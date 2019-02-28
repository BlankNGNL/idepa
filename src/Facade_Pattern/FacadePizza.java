package Facade_Pattern;

/**
 * Created by Mike on 30-Oct-16.
 */
public class FacadePizza {
    private Cheese cheese;
    private Dough dough;
    private Meat meat;

    public FacadePizza(String cheeseName, String doughName, String meatName) {

       cheese = new Cheese(cheeseName);
       dough = new Dough(doughName);
        meat = new Meat(meatName);
    }

    public void createPizza(){
        System.out.println("Created a Pizza with these ingredients! " +cheese+"-"+dough+"-"+meat);
    }

}
