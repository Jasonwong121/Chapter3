
import javax.swing.*;

public class ExceptionDemo {

    public static void main(String[] args) {
        boolean valid = false;
        do {
            try {
                

                String inputTxt = JOptionPane.showInputDialog("enter an interger");
                int number = Integer.parseInt(inputTxt);
                valid=true;
                JOptionPane.showMessageDialog(null, "the number entered is" + number);
            } catch (NumberFormatException ex) {
                JOptionPane.showMessageDialog(null, "an interger value is excepected", "invalid", JOptionPane.ERROR_MESSAGE);
            }

        } while (!valid);

    }

}
