import javax.swing.*;
import java.awt.*;
import java.awt.image.BufferedImage;

/**
 * Created by vitia on 04.03.2017.
 */

/*
* Класс в котором осуществляется отрисовка и обновление игры.
* The class in which the rendering and game update.
* */
public class GamePanel extends JPanel implements Runnable{
    Thread thread = new Thread(this);
    private BufferedImage image = new BufferedImage(GameSize.WIDTH, GameSize.HEIGHT, BufferedImage.TYPE_INT_RGB);
    private Graphics2D graphics = (Graphics2D) image.getGraphics();
    private BackGround backGround = new BackGround();
    private FielOfPlay fielOfPlay = new FielOfPlay();
    DrawingField drawingField = new DrawingField(fielOfPlay);

    /*
    * Инициализация главного окна игры.
    * Initialize the main window of the game.
    * */
    GamePanel() {
        super();
        setPreferredSize(new Dimension(GameSize.WIDTH, GameSize.HEIGHT));
        setFocusable(true);
        requestFocus();
        addKeyListener(new Listener(fielOfPlay));
    }


    /**
     * Главный метод в котором будет производиться отрисовка и обновление игры.
     * The main method in which made the rendering and game update.
     */
    @Override
    public void run() {
        while (true) {
            drawElementGame();
            drawGame();
        }
    }


    /*
    * Запуск нити.
    * The start of the thread.
    * */
    public void start(){
        thread.start();
    }

    /*
    * Отрисовка элементов игры.
    * Drawing the elements of the game.
    * */
    public void drawElementGame(){
        backGround.draw(graphics);
        drawingField.draw(graphics);
    }

    /*
    * Отрисовка сцены.
    * Rendering of the scene.
    * */
    private void drawGame(){
        Graphics graphicsGame = getGraphics();
        graphicsGame.drawImage(image, 0, 0, null);
        graphicsGame.dispose();
    }
}
