
import javax.swing.*;
import java.awt.*;

public class p4q2 extends JFrame {

    private JLabel jlblindex = new JLabel("array index");
    private JTextField jtfindex = new JTextField(5);
    private JLabel jlblelement = new JLabel("array element");
    private JTextField jtfelement = new JTextField(5);
    private JButton jbtshow = new JButton("show element");
     private int[]numArr=new int [100];
    public p4q2() {
        JPanel p1 = new JPanel(new GridLayout(2, 2));
        p1.add(jlblindex);
        p1.add(jtfindex);
        p1.add(jlblelement);
        p1.add(jtfelement);
        jtfelement.setEditable(false);

        JPanel p2 = new JPanel();
        p2.setLayout(new FlowLayout(FlowLayout.CENTER));
        p2.add(jbtshow);

        
        add(p1, BorderLayout.CENTER);
        add(p2, BorderLayout.SOUTH);
        setSize(350, 120);
        setVisible(true);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocationRelativeTo(null);
    }

    public void initializeArray(){
    for (i=0;i<numArr.length:i++){
        numArr[i]=(1000+)
    }
    }
    
    public static void main(String[] args) {
        new p4q2();
    }

}
