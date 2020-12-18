package Session9.gui;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class CFrame extends JFrame implements ActionListener {

    private CMainPanel mainPanel;

    private JMenuItem newItem;
    private JMenuItem saveItem;
    private JMenuItem saveObject;
    private JMenuItem exitItem;

    /**
     * Create a CFrame.
     *
     * @param title title of frame.
     */
    public CFrame(String title) {
        super(title);

        initMenuBar(); //create menuBar

        initMainPanel(); //create main panel
    }

    /**
     * make MenuBar.
     * The method makes MenuBar for iNote.
     */
    private void initMenuBar() {
        JMenuBar menuBar = new JMenuBar();
        JMenu jmenu = new JMenu("File");

        newItem = new JMenuItem("New");
        saveItem = new JMenuItem("Save Text");
        saveObject = new JMenuItem("Save Object");
        exitItem = new JMenuItem("Exit");

        newItem.addActionListener(this);
        saveItem.addActionListener(this);
        saveObject.addActionListener(this);
        exitItem.addActionListener(this);

        jmenu.add(newItem);
        jmenu.add(saveItem);
        jmenu.add(saveObject);
        jmenu.add(exitItem);

        menuBar.add(jmenu);
        setJMenuBar(menuBar);
    }

    /**
     * make main panel.
     * The method makes mainPanel for iNote.
     */
    private void initMainPanel() {
        mainPanel = new CMainPanel();
        add(mainPanel);
    }

    /**
     * an Override method
     * Handel action performed for MenuBar.
     * @param e action event.
     */
    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == newItem) {
            mainPanel.addNewTab();
        } else if (e.getSource() == saveItem) {
            mainPanel.saveNote();
        } else if (e.getSource() == saveObject) {
            mainPanel.saveObject();
        } else if (e.getSource() == exitItem) {
            //TODO: Phase1: check all tabs saved ...
            mainPanel.saveAllNotes();
            System.exit(0);
        } else {
            System.out.println("Nothing detected...");
        }
    }
}
