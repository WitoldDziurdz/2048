import java.awt.*;

/**
 * Created by vitia on 05.03.2017.
 */
public class DrawingField {
    private FielOfPlay fielOfPlay;
    private Color colorString = Color.BLACK;
    DrawingField(FielOfPlay fielOfPlay){
        this.fielOfPlay = fielOfPlay;
    }

    public void draw(Graphics2D graphics2D){
        int[][] tab = fielOfPlay.getTab(); //
        for(int i = 0; i<4; i++){
            for(int j =0; j<4; j++){
                if(tab[i][j]!=0){
                    drawElement(i,j,tab[i][j],graphics2D);
                }
            }
        }
    }

    public void drawElement(int i, int j, int num, Graphics2D graphics2D){
        int sizeX = GameSize.HEIGHT/4;
        int sizeY = GameSize.WIDTH/4;
        int x = j*sizeX;
        int y = i *sizeY;
        Color color = getColor(num);
        graphics2D.setColor(color);
        graphics2D.fillRect(x,y,sizeX,sizeY);
        graphics2D.setColor(colorString);
        graphics2D.drawString(String.valueOf(num),x+sizeX/2,y+sizeY/2);
    }


    public Color getColor(int num){
        int lg = (int)(Math.log(num) / Math.log(2));
        return new Color(100+lg*10,100+lg*10,100+lg*10);
    }
}

