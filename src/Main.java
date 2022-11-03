
import java.util.Arrays;
import java.util.List;


public class Main {

    public static int Oportunitats = 8;
    public static int numFil = 4;
    public static List<String> Colors = Arrays.asList("R", "Y", "G", "B", "O", "P");



    public static void main(String[] args) {
        String codiDemanat = IntroduirColors.EscollirColor(); //Demanem codi a l'usuari
        Tauler tauler = new Tauler();
        SecretCode codi = new SecretCode("A");

        //Mostra el tauler
        tauler.guardarCodis(new Codi(codiDemanat));
        tauler.MostraTauler(codi);

    }

    public static void rolJoc(String codi){
        Codi codiJoc = new Codi(codi);
    }
}