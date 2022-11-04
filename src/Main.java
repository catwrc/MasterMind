
import java.util.Arrays;
import java.util.List;


public class Main {

    private static SecretCode secretCode;

    public static int Oportunitats = 8;
    private static Joc pista;
    public static int numFil = 4;
    public static List<String> Colors = Arrays.asList("R", "Y", "G", "B", "O", "P");
    private static Tauler tauler;
    private static Codi codii;
    private static boolean acabat;
    private static int intents;

    public Main(){
        tauler = new Tauler();
        secretCode = new SecretCode();
        acabat = false;
        intents= 0;
        codii = new Codi();

    }



    public static void main(String[] args) {
        //secretCode = new SecretCode();
        intents= 0;
        codii = new Codi();
        tauler = new Tauler();
        secretCode = new SecretCode();
        acabat = false;
        SecretCode secret_code =  new SecretCode();
        while(!acabat){
            if(intents<Oportunitats){
                intents++;
        String codiDemanat = IntroduirColors.EscollirColor(); //Demanem codi a l'usuari
        introduceCode(codiDemanat);
        Codi user_code =  new Codi(codiDemanat);

        tauler.añadirCodigosTablero(new Codi(codiDemanat));
        pista = new Joc(secret_code, user_code);
        tauler.añadirPistasTablero(pista);
        tauler.MostraTauler(secret_code);
        System.out.println(codiDemanat);
        System.out.println(secret_code.getSecretCode());
        if(codiDemanat.equals(secret_code.getSecretCode())){
            acabat =true;
            win();
            }
            }

            else{
                acabat =true;
                System.out.println("El joc s'ha acabat");
            }
        }
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

    public static void win(){
        System.out.println("11111111111111111111111111111111111111111111111111111");
        System.out.println("1111                  YOU WIN!!!                 1111");
        System.out.println("11111111111111111111111111111111111111111111111111111");
    }

    public static void rolJoc(String codi){
        Codi codiJoc = new Codi(codi);
    }
}