package Models;
import java.util.Random;
import java.util.Scanner;

public interface IsExtractable{
    static int RandomNumber(int amount){
        Random rnd = new Random();
        int numberRandom=rnd.nextInt(amount);
        return numberRandom;
    }
    static String TextExtract(String text){
        System.out.println(text);
        String extraction = new Scanner(System.in).nextLine();
        return extraction;
    }
}
