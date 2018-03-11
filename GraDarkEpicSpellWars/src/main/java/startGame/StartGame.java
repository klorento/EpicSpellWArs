package startGame;

import home.Home;
import java.awt.EventQueue;

public class StartGame {
    public static void main(String[] args) {
        EventQueue.invokeLater(new Runnable() {
            @Override
            public void run() {
                new Home();
            }
        });
    }
}
