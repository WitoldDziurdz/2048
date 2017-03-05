import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

/**
 * Created by vitia on 05.03.2017.
 */
public class Listener implements KeyListener {
    private FielOfPlay fielOfPlay;
    Listener(FielOfPlay fielOfPlay){
        this.fielOfPlay = fielOfPlay;
    }
    @Override
    public void keyTyped(KeyEvent e) {

    }

    @Override
    public void keyPressed(KeyEvent e) {
        if(e.getKeyCode() == KeyEvent.VK_D) fielOfPlay.rightMoveField();
        else if(e.getKeyCode() == KeyEvent.VK_A) fielOfPlay.leftMoveField();
        else if(e.getKeyCode() == KeyEvent.VK_S) fielOfPlay.downMoveField();
        else if(e.getKeyCode() == KeyEvent.VK_W) fielOfPlay.upMoveField();
    }

    @Override
    public void keyReleased(KeyEvent e) {

    }
}
