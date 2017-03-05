import java.awt.*;

/**
 * Created by vitia on 04.03.2017.
 */
/*
* Класс ответственный за отрисовку статических частей приложения.
* The class is responsible for rendering the static parts of the application.
* */
public class BackGround {
    Color color = new Color(43,209,98);
    Color colorLine = Color.BLACK;
    public void draw(Graphics2D graphics2D)
    {
        graphics2D.setColor(color);
        graphics2D.fillRect(0, 0, GameSize.WIDTH, GameSize.HEIGHT);
        int x1 = 0;
        int x2 = GameSize.WIDTH;
        int y1 = 0;
        int y2 = y1;
        int delta = GameSize.HEIGHT/4;
        int numLines = 4;
        for(int i = 0; i <numLines; i++) {
            y1 += delta;
            y2 += delta;
            graphics2D.setColor(colorLine);
            graphics2D.drawLine(x1,y1,x2,y2);
        }
        y1 = 0;
        y2 = GameSize.HEIGHT;
        x1 = 0;
        x2 = x1;
        for(int i = 0; i <numLines; i++) {
            x1 += delta;
            x2 += delta;
            graphics2D.setColor(colorLine);
            graphics2D.drawLine(x1,y1,x2,y2);

        }
    }
}
