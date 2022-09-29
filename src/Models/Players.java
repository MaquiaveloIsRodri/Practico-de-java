package Models;

import java.util.Random;

public class Players {
    private String player1;
    private String player2;
   public Players(String player1, String player2){
        this.player1=player1;
        this.player2=player2;
    }
    public void PossibilityPlayer(){
        int possibilityRange = new Random().nextInt(80);
        int possibilityPlayerOne = 100-possibilityRange;
        int possibilityPlayerTwo= 100-possibilityPlayerOne;
        System.out.println("Segun la estadistica tiene "+possibilityPlayerOne+"% vs su rival que tiene "+possibilityPlayerTwo+"%" );
        System.out.println("\n\n");

    }
    public String getPlayer1() {
       return player1;
    }
    public void setPlayer1(String player1) {
       this.player1 = player1;
    }
    public String getPlayer2() {
       return player2;
    }
    public void setPlayer2(String player2) {
       this.player2 = player2;
    }


}
