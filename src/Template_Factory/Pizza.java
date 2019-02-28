package Template_Factory;

/**
 * Created by Mike on 30-Oct-16.
 */
public abstract class Pizza {
    public Pizza() {
      addTop();
    }

    public  void addTop(){
        System.out.println("Adding nothing top");
    }

}
