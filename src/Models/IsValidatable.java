package Models;

public interface IsValidatable{
    static boolean validationSet(double sets){
        if(sets!=3 && sets!=5){
            System.out.println("Debe seleccionar entre 3 o 5 , si no es asi el programa no puede continuar");
            return true;
        }
        return false;
    }


}
