package swing;

/*
5a. Develop a Swing program in Java to add the countries USA, India, Vietnam, Canada, Denmark, France, 
Great Britain, Japan, Africa, Greenland, Singapore into a JList and display them on console whenever 
the countries are selected on the list.
*/

import javax.swing.*;
import javax.swing.event.*;
import java.awt.*;

public class fivea {

    public static void main(String[] args) {

        JFrame frame = new JFrame("Country List");

        // Country list
        String[] countries = {
            "USA", "India", "Vietnam", "Canada", "Denmark",
            "France", "Great Britain", "Japan", "Africa",
            "Greenland", "Singapore"
        };

        // Create JList
        JList<String> list = new JList<>(countries);

        // Allow multiple selection
        list.setSelectionMode(ListSelectionModel.MULTIPLE_INTERVAL_SELECTION);

        // Event listener
        list.addListSelectionListener(new ListSelectionListener() {
            public void valueChanged(ListSelectionEvent e) {
                if (!e.getValueIsAdjusting()) {
                    System.out.println("Selected: " + list.getSelectedValuesList());
                }
            }
        });

        frame.add(new JScrollPane(list));
        frame.setSize(300, 250);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);
    }
}