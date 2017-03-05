import java.io.FileReader;

/**
 * Created by vitia on 04.03.2017.
 */
public class FielOfPlay {
    private  int[][] tab = new int[4][4];


    FielOfPlay(){
        for(int i =0 ;i<4; i++)
            for(int j =0; j<4; j++)
                tab[i][j] = 0;
        tab[0][0] =2;
        tab[0][1] =2;
        tab[0][2] =4;
        tab[1][0] =2;
        tab[1][2] =2;
    }



    public int[][] getTab() {
        return this.tab;
    }


    public void rightMoveField(){
        rightMoveRow();
        rightActionRow();
        rightMoveRow();
    }

    public void leftMoveField() {
        leftMoveRow();
        leftActionRow();
        leftMoveRow();
    }

    public void downMoveField(){
        downMoveColumn();
        downActionColumn();
        downMoveColumn();
    }

    public void upMoveField(){
        upMoveColumn();
        upActionColumn();
        upMoveColumn();
    }

    private void rightMoveRow(){
        for(int i = 0; i <4; i++){
            for(int j =2; j>=0; j--){
                for(int k = j; k<3; k++){
                    if(tab[i][k+1] == 0){
                        tab[i][k+1] = tab[i][k];
                        tab[i][k] = 0;
                    }
                }
            }
        }
    }

    private void leftMoveRow(){
        for(int i = 0; i <4; i++){
            for(int j =1; j<4; j++){
                for(int k = j; k>=1; k--){
                    if(tab[i][k-1] == 0){
                        tab[i][k-1] = tab[i][k];
                        tab[i][k] = 0;
                    }
                }
            }
        }
    }

    private void downMoveColumn(){
        for(int i = 0; i <4; i++){
            for(int j =2; j>=0; j--){
                for(int k = j; k<3; k++){
                    if(tab[k+1][i] == 0){
                        tab[k+1][i] = tab[k][i];
                        tab[k][i] = 0;
                    }
                }
            }
        }
    }

    private void upMoveColumn(){
        for(int i = 0; i <4; i++){
            for(int j =1; j<4; j++){
                for(int k = j; k>=1; k--){
                    if(tab[k-1][i] == 0){
                        tab[k-1][i] = tab[k][i];
                        tab[k][i] = 0;
                    }
                }
            }
        }
    }

    private void rightActionRow(){
        for(int i = 0; i <4; i++){
            for(int j =2; j>=0; j--) {
                if(tab[i][j+1] == tab[i][j]){
                    tab[i][j+1] += tab[i][j];
                    tab[i][j] = 0;
                }
            }
        }
    }

    private void leftActionRow(){
        for(int i = 0; i <4; i++){
            for(int j =1; j<=3; j++) {
                if(tab[i][j-1] == tab[i][j]){
                    tab[i][j-1] += tab[i][j];
                    tab[i][j] = 0;
                }
            }
        }
    }

    private void downActionColumn(){
        for(int i = 0; i <4; i++){
            for(int j =2; j>=0; j--) {
                if(tab[j+1][i] == tab[j][i]){
                    tab[j+1][i] += tab[j][i];
                    tab[j][i] = 0;
                }
            }
        }
    }

    private void upActionColumn(){
        for(int i = 0; i <4; i++){
            for(int j =1; j<=3; j++) {
                if(tab[j-1][i] == tab[j][i]){
                    tab[j-1][i] += tab[j][i];
                    tab[j][i] = 0;
                }
            }
        }
    }
}
