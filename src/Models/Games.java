package Models;

import java.util.ArrayList;
import java.util.Scanner;

public class Games implements IsValidatable,IsExtractable{
    String p1;
    String p2;
    String tournament;
    double sets;
    int gamePlay1 = 0;
    int gamePlay2 = 0;
    int setPlay1 = 0;
    int setPlay2 = 0;
    ArrayList<Integer> playerOneSetMarker = new ArrayList();
    ArrayList<Integer> playerTwoSetMarker = new ArrayList();
    public Games(int sets, String j1, String j2, String tournament){
        this.sets=sets;
        this.p1 =j1;
        this.p2 =j2;
        this.tournament=tournament;
    }
    public void playSet() {
        boolean isEndGame = IsValidatable.validationSet(sets);
        while (!isEndGame) {
            SetMatch setMatch = new SetMatch(p1, p2);
            boolean ResultGame = setMatch.playGame();

            if (ResultGame) {
                gamePlay1 = gamePlay1 + 1;
            }else {
                gamePlay2 = gamePlay2 + 1;
            }

            if (gamePlay1 == 6 && gamePlay2 == 6) {
                System.out.println("Tie Break");
            }
            isEndGame=winnerPlayerOne(isEndGame);
            isEndGame=winnerPlayerTwo(isEndGame);
        }
    }
    public boolean winnerPlayerOne(boolean isEndGame){
        if (gamePlay1 >= 6 && (Math.abs(gamePlay1 - gamePlay2) > 1) || gamePlay1== 7 && gamePlay2 == 6) {
            setPlay1 = setPlay1 + 1;
            playerOneSetMarker.add(gamePlay1);
            playerTwoSetMarker.add(gamePlay2);
            System.out.println(p1 + " gana el set por " + gamePlay1 + " a " + gamePlay2);
            System.out.println();
            gamePlay1 = 0;
            gamePlay2 = 0;
            if (setPlay1 == sets && (setPlay1 > setPlay2)) {
                System.out.println("Competicion "+tournament);
                System.out.println("ganador jugador "+ p1);
                System.out.println(p1 + " "+playerOneSetMarker);
                System.out.println(p2 + " " +playerTwoSetMarker);
                System.out.println();
                setPlay1 =0;
                setPlay1 =0;
                playerOneSetMarker.clear();
                playerTwoSetMarker.clear();
                System.out.println("Quiere la revancha del partido? 1:Si 0:No");
                int response = Integer.parseInt(new Scanner(System.in).nextLine());
                if(response == 1){
                    response = 0;
                    return isEndGame=false;
                }
                return isEndGame=true;

            }
        }
        return isEndGame;
    }

    public boolean winnerPlayerTwo(boolean isEndGame){
        if (gamePlay2 >= 6 && (Math.abs(gamePlay2-gamePlay1) > 1) || gamePlay2== 7 && gamePlay2 == 6) {
            gamePlay2 = gamePlay2 + 1;
            playerOneSetMarker.add(gamePlay1);
            playerTwoSetMarker.add(gamePlay2);
            System.out.println(p2 + " gana el set por " + gamePlay2 + " a " + gamePlay1);
            System.out.println();
            gamePlay1 = 0;
            gamePlay2 = 0;
            if (setPlay2 == sets && (setPlay2 > setPlay1)) {
                System.out.println("Competicion "+tournament);
                System.out.println("ganador jugador "+ p1);
                System.out.println(p1 + " "+playerOneSetMarker);
                System.out.println(p2 + " " +playerTwoSetMarker);
                System.out.println();
                setPlay1 =0;
                setPlay1 =0;
                playerOneSetMarker.clear();
                playerTwoSetMarker.clear();
                System.out.println("Quiere la revancha del partido? 1:Si 0:No");
                int response = Integer.parseInt(new Scanner(System.in).nextLine());
                if(response == 1){
                    response = 0;
                    return isEndGame=false;
                }
                return isEndGame=true;

            }
        }
        return isEndGame;
    }
}
