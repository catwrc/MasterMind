
import java.util.Arrays;
import java.util.List;


public class Main {

    private static SecretCode secretCode;

    public static int Oportunitats = 8;
    private static Joc pista;
    public static int numFil = 4;
    public static List<String> Colors = Arrays.asList("R", "Y", "G", "B", "O", "P");
    private static Tauler tauler;

    public Main(){
        tauler = new Tauler();
        secretCode = new SecretCode();

    }



    public static void main(String[] args) {
        //secretCode = new SecretCode();
        tauler = new Tauler();
        secretCode = new SecretCode();
        String codiDemanat = IntroduirColors.EscollirColor(); //Demanem codi a l'usuari
        introduceCode(codiDemanat);
        Codi user_code =  new Codi(codiDemanat);
        SecretCode secret_code =  new SecretCode();

        tauler.añadirCodigosTablero(new Codi(codiDemanat));
        pista = new Joc(secret_code, user_code);
        tauler.añadirPistasTablero(pista);
        tauler.MostraTauler(secret_code);
    }

    public static void introduceCode(String code){

        //--Codi user_code =  new Codi(code);
        //--Tauler tauler = new Tauler();
        //SecretCode codi = new SecretCode("Aaaa");
        //---tauler.añadirCodigosTablero(new Codi(code));
        //--pista = new Joc(secretCode, user_code);
       // System.out.println(codi);
        //--tauler.añadirPistasTablero(pista);
        //Mostra el tauler
        //tauler.guardarCodis(new Codi(codiDemanat));
        //--tauler.MostraTauler(secretCode);

    }

    public static void rolJoc(String codi){
        Codi codiJoc = new Codi(codi);
    }
}