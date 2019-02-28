package Decorator_Pattern;
import java.io.*;

/**
 * Created by drynl on 4-10-2016.
 */
public class Decorator_Pattern_Main {
    public static void main(String[] args) {
        File filename = new File("D:\\JavaProjecten\\ideba\\src\\Decorator_Pattern\\Hallo.txt");
        try {
            LineNumberReader lineNmbr = new LineNumberReader(new FileReader(filename));

            for (String tekst; (tekst = lineNmbr.readLine()) != null;){
                System.out.print(lineNmbr.getLineNumber() + ":\t" + tekst +
                        "\n");
            }
        }
        catch(java.io.FileNotFoundException fnfx) {
            fnfx.printStackTrace();
        }
        catch(java.io.IOException iox) {
            iox.printStackTrace();
        }

    }
}
