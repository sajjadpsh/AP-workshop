package Session7;


import javax.swing.*;

public class AP_Calculator extends JFrame {

    //main frame
    private JFrame calc_Frame;
    //standard calculator panel
    private JPanel standardCalc;
    //scientific calculator panel
    private JPanel scientificCalc;

    /**
     * Create a Calculator.
     */
    public AP_Calculator() {

        //frame
        calc_Frame = new JFrame();
        calc_Frame.setTitle("AUT Calculator");
        calc_Frame.setSize(400, 600);
        calc_Frame.setLocation(100, 200);
        calc_Frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        //tab
        JTabbedPane calculatorTabs = new JTabbedPane();
        calculatorTabs.addTab("Standard ", standardCalc);
        calculatorTabs.addTab("Scientific ", scientificCalc);
        calc_Frame.add(calculatorTabs);
        calc_Frame.setVisible(true);
    }

    public static void main(String[] args) {
        new AP_Calculator();
    }
}