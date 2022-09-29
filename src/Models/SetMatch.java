package Models;
public class SetMatch implements IsExtractable {
    String j1;
    String j2;
    int markerPlayed1 = 0;
    int markerPlayed2 = 0;
    String playerPoints1 = "0";
    String playerPoints2 = "0";
    boolean ganador = true;
    boolean finJuego = false;

    SetMatch(String j1, String j2 ){
        this.j1=j1;
        this.j2=j2;
    }
    boolean playGame() {
        int randomPlayer =IsExtractable.RandomNumber(2);

        if (randomPlayer==0){
            System.out.println("El golpe de la pelota es de "+ j1);
        }else{
            System.out.println("El golpe de la pelota es de "+ j2);
        }

        while (!finJuego) {

            int randomBlow =IsExtractable.RandomNumber(2);
            String marcadorPuntos = "";

            //golpear a la pelota
            if (randomBlow == 0) {
                System.out.println("Punto para " + j1);
                markerPlayed1 = markerPlayed1 + 1;
                if ((markerPlayed1 > 3) && (Math.abs(markerPlayed1 - markerPlayed2) > 1)) {
                    System.out.println(j1 + " gana el juego");
                    System.out.println();
                    markerPlayed1 = 0;
                    markerPlayed2 = 0;
                    playerPoints1 = "0";
                    playerPoints2 = "0";
                    ganador = true;
                    finJuego = true;
                }
            }
            if (randomBlow == 1) {
                System.out.println("Punto para " + j2);
                markerPlayed2 = markerPlayed2 + 1;
                if ((markerPlayed2 > 3) && (Math.abs(markerPlayed2 - markerPlayed1) > 1)) {
                    System.out.println(j2 + " gana el juego");
                    markerPlayed1 = 0;
                    markerPlayed2 = 0;
                    ganador = false;
                    finJuego = true;
                }
            }


            //condicionales de puntos
            switch (markerPlayed1){
                case 1:
                    playerPoints1 = "15";
                    marcadorPuntos = playerPoints1 + " - " + playerPoints2;
                    break;
                case 2:
                    playerPoints1 = "30";
                    marcadorPuntos = playerPoints1 + " - " + playerPoints2;
                    break;
                case 3:
                    playerPoints1 = "40";
                    marcadorPuntos = playerPoints1 + " - " + playerPoints2;
                    break;
            }
            switch (markerPlayed2){
                case 1:
                    playerPoints2 = "15";
                    marcadorPuntos = playerPoints1 + " - " + playerPoints2;
                    break;
                case 2:
                    playerPoints2 = "30";
                    marcadorPuntos = playerPoints1 + " - " + playerPoints2;
                    break;
                case 3:
                    playerPoints2 = "40";
                    marcadorPuntos = playerPoints1 + " - " + playerPoints2;
                    break;
            }

            //Condicionales de empate
            if (markerPlayed1 > 3 && markerPlayed2 > 3 && markerPlayed1 == markerPlayed2) {
                playerPoints1 ="deuce";
               marcadorPuntos = "deuce";
            }
            if (markerPlayed2 > 3 && markerPlayed1 > 3 && markerPlayed2 == markerPlayed1) {
                playerPoints2 ="deuce";
                marcadorPuntos = "deuce";
            }

            //condicionales de  ventaja
            if (markerPlayed1 > 3 && markerPlayed1 > markerPlayed2) {
                playerPoints1 = "";
                playerPoints2 = "";
                marcadorPuntos = "ventaja " + j1;
            }
            if (markerPlayed2 > 3 && markerPlayed2 > markerPlayed1) {
                playerPoints1 = "";
                playerPoints2 = "";
                marcadorPuntos = "ventaja " + j2;
            }


            System.out.println(marcadorPuntos);
        }
        return ganador;


    }


}
