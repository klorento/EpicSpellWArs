package home;



import javax.swing.*;

import javax.swing.JButton;

import java.awt.*;



public class Home extends JFrame {



    JTextField poleTekst; /* referencja do tekstu */

    JPanel panel; /* referencja do panelu */

    JPanel panel2;

    JPanel panel3;

    JPanel panel4;

    JPanel panel5;

    JPanel panel6;

    JLabel etykieta; /* referencja do etykiety */





    public Home() {

        super("Epic Spell Wars");

        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        setSize(1000, 700);

        setLocation(600, 150);

        setLayout(null);









        /*setLayout(new FlowLayout());

        setLayout(new GridLayout(1, 1));

        add(new JLabel("Choose the number of opponents"));

        setLayout(new GridLayout(1, 3));

        add(new JButton("1"));

        add(new JButton("2"));

        add(new JButton("3"));

        setLayout(new GridLayout(1, 1));

        add(new JButton("Enter nickname"));

        setLayout(new GridLayout(5, 0));

        add(new JButton("Start Game"));

        add(new JButton("Quit game"));

        setVisible(true);*/



        Container powZawartosci = getContentPane();



        panel = new JPanel(); /* utworzenie panelu */

        panel2 = new JPanel();

        panel3 = new JPanel();

        panel4 = new JPanel();

        panel5 = new JPanel();

        panel6 = new JPanel();



        powZawartosci.add(panel); /* dodanie panelu do powierzchni zawartości */

        powZawartosci.add(panel2);

        powZawartosci.add(panel3);

        powZawartosci.add(panel4);

        powZawartosci.add(panel5);

        powZawartosci.add(panel6);



        panel.setBounds(10, 10, 400, 50);

        panel2.setBounds(10, 60, 400, 50);

        panel3.setBounds(10, 140, 400, 80);

        panel4.setBounds(10, 230, 400, 50);

        panel5.setBounds(10, 290, 800, 200);

        panel6.setBounds(10, 500, 800, 200);









        etykieta = new JLabel("Choose number of opponents!!!"); /* utworzenie etykiety */

        panel.add(etykieta); /* dodanie etykiety do panelu */

        etykieta.setAlignmentX(Component.CENTER_ALIGNMENT);



//        JButton przycisk = new JButton("Przycisk"); /* utworzenie przycisku */

//        panel.add(przycisk); /* dodanie przycisku do panelu */

        JRadioButton rb1 = new JRadioButton("One Opponent");

        JRadioButton rb2 = new JRadioButton("Two Opponents");

        JRadioButton rb3 = new JRadioButton("Three Opponents");

        panel2.add(rb1); panel2.add(rb2); panel2.add(rb3);

        ButtonGroup bg = new ButtonGroup();

        bg.add(rb1); bg.add(rb2); bg.add(rb3);

        boolean rb1_selected = rb1.isSelected();

        boolean rb2_selected = rb2.isSelected();

        boolean rb3_selected = rb3.isSelected();



        etykieta = new JLabel("Enter your nickname!!!"); /* utworzenie etykiety */

        panel3.add(etykieta); /* dodanie etykiety do panelu */

//

        poleTekst = new JTextField("PLAYER 1", 20); /* utworzenie pola tekstowego */

        panel3.add(poleTekst); /* dodanie pola tekstowego do panelu */



        etykieta = new JLabel("Pick Your Wizard!!!"); /* utworzenie etykiety */

        panel4.add(etykieta); /* dodanie etykiety do panelu */

        ImageIcon ikona = new ImageIcon("src\\main\\resources\\mini1.jpg");

        ImageIcon ikona2 = new ImageIcon("src\\main\\resources\\mini2.jpg");


        JButton w1 = new JButton(ikona);



        JButton w2 = new JButton(ikona2);

        JButton w3 = new JButton(ikona);

        JButton w4 = new JButton(ikona2);

        JButton w5 = new JButton(ikona);

        panel5.add(w1); panel5.add(w2); panel5.add(w3); panel5.add(w4); panel5.add(w5);





        JButton b1 = new JButton("START GAME");

        JButton b2 = new JButton("QUIT");

        panel6.add(b1); panel6.add(b2);

//        ImageIcon ikona = new ImageIcon("C:\\Users\\User\\Desktop\\epic\\Nowy folder\\mini1.jpg");

//        przycisk = new JButton(ikona);

//        przycisk.setBackground(Color.white);

//        przycisk.setBounds(50, 50, 100, 100);

        setVisible(true);

    }



}

