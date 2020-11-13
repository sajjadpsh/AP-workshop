package Session7;


import javax.swing.*;
import javax.swing.border.Border;
import java.awt.*;

public class AP_Calculator extends JFrame {


    //standard calculator panel
    private JPanel standardCalc;
    //scientific calculator panel
    private JPanel scientificCalc;

    /**
     * Create a Calculator.
     */
    private AP_Calculator() {
        try {
            for (UIManager.LookAndFeelInfo info : UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (Exception e) {
            // If Nimbus is not available, you can set the GUI to another look and feel.
        }
        //frame
        JFrame calc_Frame = new JFrame();
        calc_Frame.setTitle("AUT Calculator");
        calc_Frame.setSize(400, 600);
        calc_Frame.setLocation(100, 200);
        calc_Frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        standardPanel();
        //tab
        JTabbedPane calculatorTabs = new JTabbedPane();
        calculatorTabs.addTab("Standard ", standardCalc);
        calculatorTabs.addTab("Scientific ", scientificCalc);
        calc_Frame.add(calculatorTabs);
        calc_Frame.setVisible(true);
    }

    /**
     * The method makes standard calculator panel for standard tab.
     */
    private void standardPanel() {
        standardCalc = new JPanel();
        standardCalc.setLayout(new BorderLayout());

        JTextArea display = new JTextArea(2, 5);
        display.setEditable(true);
        display.setFont(new Font("Arial", Font.BOLD, 36));
        Border border = BorderFactory.createLineBorder(Color.gray, 1);
        display.setBorder(border);


        JPanel opPanel = new JPanel();
        opPanel.setLayout(new GridLayout(2, 5));
        opPanel.setBorder(border);

        JPanel keyboardPanel = new JPanel();
        keyboardPanel.setLayout(new GridLayout(4, 3));
        keyboardPanel.setBorder(border);

        JButton[] numberButton = new JButton[10];
        for (int i = 0; i < 10; i++) {
            numberButton[i] = new JButton();
            numberButton[i].setText("" + i);
        }

        JButton[] operatorButton = new JButton[9];
        for (int i = 0; i < 9; i++) {
            operatorButton[i] = new JButton();
        }
        operatorButton[0].setText("+");
        operatorButton[1].setText("-");
        operatorButton[2].setText("*");
        operatorButton[3].setText("/");
        operatorButton[4].setText("=");
        operatorButton[5].setText(".");
        operatorButton[6].setText("+/-");
        operatorButton[7].setText("mod");
        operatorButton[8].setText("%");

        JButton cButton = new JButton();
        cButton.setText("C");
        cButton.setBackground(Color.gray);


        JButton openBracket = new JButton();
        JButton closeBracket = new JButton();
        openBracket.setText("(");
        closeBracket.setText(")");


        opPanel.add(operatorButton[0]);
        opPanel.add(operatorButton[1]);
        opPanel.add(operatorButton[2]);
        opPanel.add(operatorButton[3]);
        opPanel.add(cButton);
        opPanel.add(operatorButton[6]);
        opPanel.add(operatorButton[7]);
        opPanel.add(operatorButton[8]);
        opPanel.add(openBracket);
        opPanel.add(closeBracket);


        for (int i = 1; i <= 9; i++) {
            keyboardPanel.add(numberButton[i]);
        }

        keyboardPanel.add(operatorButton[5]);
        keyboardPanel.add(numberButton[0]);
        keyboardPanel.add(operatorButton[4]);

        JScrollPane scrollPane = new JScrollPane(display);
        scrollPane.setPreferredSize(new Dimension(50, 100));

        JPanel keyPanel = new JPanel();
        keyPanel.setLayout(new BorderLayout());
        keyPanel.add(opPanel, BorderLayout.NORTH);
        keyPanel.add(keyboardPanel);
        standardCalc.add(scrollPane, BorderLayout.NORTH);
        standardCalc.add(keyPanel, BorderLayout.CENTER);
    }

    public static void main(String[] args) {
        new AP_Calculator();
    }
}