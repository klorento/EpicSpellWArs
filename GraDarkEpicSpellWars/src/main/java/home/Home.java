package home;

import javax.swing.*;
import javax.swing.JButton;
import java.awt.*;

public class Home extends JFrame {
    public Home() {
        super("Epic Spell Wars");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setSize(700, 700);
        setLocation(600,150);
        setLayout(new FlowLayout());
        add(new JButton("Choose the number of opponents")).createImage(100,100);
        add(new JButton("Enter nickname")).createImage(100,100);
        add(new JButton("Start Game")).createImage(100,100);
        add(new JButton("Quit game")).createImage(100,100);
        setVisible(true);
    }
}
