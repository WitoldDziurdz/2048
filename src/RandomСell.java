import java.util.LinkedList;
import java.util.Random;

/**
 * Created by vitia on 05.03.2017.
 */
public class RandomСell {
    LinkedList<Point> freeCell = new LinkedList<Point>();

    public Point getRandomCell(FielOfPlay fielOfPlay){
        freeCell.clear();
        int[][] tab = fielOfPlay.getTab();
        for(int i =0; i<4;i++){
            for(int j =0; j<4; j++){
                if(tab[i][j] == 0) freeCell.add(new Point(j,i));
            }
        }
        int random = (int)Math.random()*10;
        int rand = random%freeCell.size();
        return freeCell.get(rand);
    }
}
