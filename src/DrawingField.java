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
        Font font   = new Font("MS Serif", Font.BOLD, 25);
        graphics2D.setFont(font);
        graphics2D.setColor(colorString);
        graphics2D.drawString(String.valueOf(num),x+sizeX/2,y+sizeY/2);
    }


    public Color getColor(int num){
        int lg = (int)(Math.log(num) / Math.log(2));
       lg = lg%12;
       Color color = null;
       switch (lg){
           case 0:
               color = new Color(201,79,103);
               break;
           case 1:
               color = new Color(180,68,208);
               break;
           case 2:
               color = new Color(79,81,144);
               break;
           case 3:
               color = new Color(110,188,162);
               break;
           case 4:
               color = new Color(102,195,111);
               break;
           case 5:
               color = new Color(204,212,86);
               break;
           case 6:
               color = new Color(204,212,86);
               break;
           case 7:
               color = new Color(213,162,19);
               break;
           case 8:
               color = new Color(213,162,19);
               break;
           case 9:
               color = new Color(196,9,184);
               break;
           case 10:
               color = new Color(50,105,69);
               break;
           case 11:
               color = new Color(80,44,35);
               break;
       }
       return color;
    }
}

