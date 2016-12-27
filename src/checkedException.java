
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.*;

public class checkedException {

    public static void main(String[] args) {
        PrintWriter output = null;
        try {
            output = new PrintWriter("testfile.txt");
            output.println("welcome");
            if (output != null) {
                output.close();
                
            }
        } catch (FileNotFoundException ex) {
            JOptionPane.showMessageDialog(null, "file not found","error",JOptionPane.ERROR_MESSAGE );
        } finally {
            output.close();
        }

    }

}
