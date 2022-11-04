
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
            if(intents<2){
                intents++;
        String codiDemanat = IntroduirColors.EscollirColor(); //Demanem codi a l'usuari
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
                lose(secret_code.getSecretCode());
            }
        }
    }


    public static void win(){
        System.out.println("11111111111111111111111111111111111111111111111111111");
        System.out.println("1111                  YOU WIN!!!                 1111");
        System.out.println("11111111111111111111111111111111111111111111111111111");
    }

    public static void lose(String codi){
        System.out.println("11111111111111111111111111111111111111111111111111111");
        System.out.println("1111             El joc s'ha acabat              1111");
        System.out.println("1111       La combinació gunyadora era:          1111");
        System.out.println(String.format("1111                   %s                      1111",codi));
        System.out.println("11111111111111111111111111111111111111111111111111111");
    }

    public static void rolJoc(String codi){
        Codi codiJoc = new Codi(codi);
    }
}