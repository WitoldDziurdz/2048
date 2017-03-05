import java.util.Random;

/**
 * Created by vitia on 05.03.2017.
 */
public class Point {
    private int x;
    private int y;
    private int num;
    Point(int x, int y){
        this.x = x;
        this.y = y;
        Random random = new Random();
        int rand = random.nextInt()%2;
        switch (rand){
            case 0:
                this.num = 2;
                break;
            case 1:
                this.num = 4;
                break;
        }
    }

    public int getX() {
        return x;
    }

    public int getY() {
        return y;
    }

    public int getNum() {
        return num;
    }
}
