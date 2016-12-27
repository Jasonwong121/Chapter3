import javax.swing.*;
public class Uncheckedexception {

    
    public static void main(String[] args) {
        
        try{
     String[] students={"clark kent","natalie teeger","adrian monk","kevin rudd","jessica tandy"};
     
     String prompt="enter index [1.."+students.length+"]";
     String input =JOptionPane.showInputDialog(prompt);
     int index=Integer.parseInt(input)-1;
     JOptionPane.showMessageDialog(null, "student #"+input+":"+students[index]);
     
     
    }
    catch(ArrayIndexOutOfBoundsException ex){
    JOptionPane.showMessageDialog(null, "student not found","error",JOptionPane.ERROR_MESSAGE );
}catch(NumberFormatException ex){
    JOptionPane.showMessageDialog(null, "student not found","error",JOptionPane.ERROR_MESSAGE );
}
}
    
}