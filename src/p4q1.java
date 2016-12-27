
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import javax.swing.border.*;

public class p4q1 extends JFrame {

    private JLabel jlblAnnual = new JLabel("Annual Interest Rate");
    private JTextField jtfAnnual = new JTextField(5);
    private JLabel jlblNumOfYears = new JLabel("Number of Years");
    private JTextField jtfNumOfYears = new JTextField(5);
    private JLabel jlblLoan = new JLabel("Loan Amount");
    private JTextField jtfLoan = new JTextField(10);
    private JLabel jlblMonthly = new JLabel("Monthly Payment");
    private JTextField jtfMonthly = new JTextField(10);
    private JLabel jlblTotal = new JLabel("Total Payment");
    private JTextField jtfTotal = new JTextField(10);
    private JButton jbtCompute = new JButton("Compute Payment");

    public p4q1() {
        JPanel p1 = new JPanel(new GridLayout(5, 2));
        p1.setBorder(new TitledBorder("Enter loan amount, interest rate, and year"));
        p1.add(jlblAnnual);
        p1.add(jtfAnnual);
        p1.add(jlblNumOfYears);
        p1.add(jtfNumOfYears);
        p1.add(jlblLoan);
        p1.add(jtfLoan);
        p1.add(jlblMonthly);
        p1.add(jtfMonthly);
        p1.add(jlblTotal);
        p1.add(jtfTotal);
        jtfMonthly.setEditable(false);
        jtfTotal.setEditable(false);

        JPanel p2 = new JPanel();
        p2.setLayout(new FlowLayout(FlowLayout.RIGHT));
        p2.add(jbtCompute);

        add(p1, BorderLayout.CENTER);
        add(p2, BorderLayout.SOUTH);
        jbtCompute.addActionListener(new ButtonListener());

        setTitle("LoanCalculator");
        setSize(400, 300);
        setVisible(true);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocationRelativeTo(null);
    }

    private void clearFields() {
        jtfAnnual.setText("");
        jtfNumOfYears.setText("");
        jtfLoan.setText("");

    }

    private class ButtonListener implements ActionListener {

        @Override
        public void actionPerformed(ActionEvent e) {

            try {
                double rate = Double.parseDouble(jtfAnnual.getText());
                int years = Integer.parseInt(jtfNumOfYears.getText());
                double amount = Double.parseDouble(jtfLoan.getText());

                Loan loan = new Loan(rate, years, amount);
                double monthlyPayment = loan.getMonthlyPayment();
                double totalPayment = loan.getTotalPayment();

                jtfMonthly.setText(String.format("%.2f", monthlyPayment));
                jtfTotal.setText(String.format("%.2f", totalPayment));
            } catch (NumberFormatException ex) {
                JOptionPane.showMessageDialog(null, "non-numberic input.", "invalid input", JOptionPane.ERROR_MESSAGE);
                clearFields();
                jtfAnnual.requestFocusInWindow();

            }
        }
    }

    public static void main(String[] args) {
        new p4q1();
    }

}
