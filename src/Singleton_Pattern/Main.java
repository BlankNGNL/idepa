package Singleton_Pattern;

/**
 * Alleen als je 1 object van een klasse wilt hebben, bijvoorbeeld een logging file
 * Private Constructor
 * GetInstance
 * Referanctie naar zichzelf
 */
public class Main {
    public static void main(String[] args) {

    /*Dit is niet mogelijk*/
    //Logger logger = new Logger();

        Logger logger = Logger.GetInstance();
        logger.WriteToFile();
    }
}
