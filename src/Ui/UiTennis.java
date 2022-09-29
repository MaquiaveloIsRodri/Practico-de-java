package Ui;
import Models.Games;
import Models.IsExtractable;
import Models.Players;

public class UiTennis implements IsExtractable {
    static public void UiMenu(){
        String player1 =IsExtractable.TextExtract("Colocar el nombre del primer tenista");
        String player2 =IsExtractable.TextExtract("Colocar el nombre del segundo tenista");
        String tournament =IsExtractable.TextExtract("Colocar el nombre del torneo");
        int sets = Integer.parseInt(IsExtractable.TextExtract("Seleccionar la cantidad de sets , al mejor de 3 o 5"));
        Players player = new Players(player1 , player2);
        player.PossibilityPlayer();
        Games PlayGame = new Games(sets,player1,player2,tournament);
        PlayGame.playSet();
    }
}
