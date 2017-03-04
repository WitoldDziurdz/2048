import javax.swing.*;
import java.awt.*;

/**
 * Created by vitia on 04.03.2017.
 */

/*
* Инициализация окна приложения.
* Initialization of the application window.
* */
public class MainGame {
    public static void main(String[] args) {
        JFrame startJFrame = new JFrame("2048");
        startJFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        startJFrame.getContentPane().setLayout(new BorderLayout(0, 0));
        GamePanel gamePanel = new GamePanel();
        startJFrame.getContentPane().add(gamePanel);
        startJFrame.pack();
        startJFrame.setLocationRelativeTo(null);
        startJFrame.setVisible(true);
        gamePanel.start();
    }
}
