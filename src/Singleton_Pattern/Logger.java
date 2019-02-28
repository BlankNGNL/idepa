package Singleton_Pattern;

/**
 * Created by Mike on 18-Oct-16.
 */
public class Logger {
    private static Logger logger = null;

    private Logger(){

    }

    /* als het al bestaat dan return die dezelfde logger*/
    public static Logger GetInstance(){
        if(logger == null){
            logger = new Logger();
        }
        return logger;
    }

    public void WriteToFile(){
        System.out.println("Write to File!");
    }
}
