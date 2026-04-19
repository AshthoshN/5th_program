package swing;

/*
5d. Develop a Swing program in Java to create a Tabbed Pane of Cyan, Magenta and Yellow and display 
the concerned color whenever the specific tab is selected in the Pane.
*/

import javax.swing.*;
import java.awt.*;

public class fived {

    public static void main(String[] args) {

        JFrame frame = new JFrame("CMY Colors");

        JTabbedPane tabbedPane = new JTabbedPane();

        JPanel cyan = new JPanel();
        cyan.setBackground(Color.CYAN);

        JPanel magenta = new JPanel();
        magenta.setBackground(Color.MAGENTA);

        JPanel yellow = new JPanel();
        yellow.setBackground(Color.YELLOW);

        tabbedPane.addTab("Cyan", cyan);
        tabbedPane.addTab("Magenta", magenta);
        tabbedPane.addTab("Yellow", yellow);

        frame.add(tabbedPane);
        frame.setSize(400, 300);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);
    }
}
