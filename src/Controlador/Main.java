package Controlador;

import Model.Codi;
import Model.CodiSecret;
import Model.IntroduirColors;
import Model.Joc;
import Vista.Tauler;

import java.util.Arrays;
import java.util.List;


public class Main {

    private static CodiSecret secretCode;

    public static int Oportunitats = 8;
    private static Joc pista;
    public static int numFil = 4;
    public static List<String> Colors = Arrays.asList("R", "Y", "G", "B", "O", "P");
    private static Tauler tauler;
    private static Codi codii;
    private static boolean acabat;
    private static boolean perdut;
    private static boolean guanyat;
    private static int intents;

    public Main(){
        tauler = new Tauler();
        secretCode = new CodiSecret();
        acabat = false;
        perdut= false;
        guanyat= false;
        intents= 0;
        codii = new Codi();

    }

    public static void main(String[] args) {
        new Main();
        CodiSecret secret_code =  new CodiSecret();
        missatge_inicial();
        while(!acabat){
            if(intents<2){
                String codiDemanat = IntroduirColors.EscollirColor();
                if(codiDemanat==null){
                break;
                }
            Codi user_code =  new Codi(codiDemanat);

            tauler.añadirCodigosTablero(new Codi(codiDemanat));
            pista = new Joc(secret_code, user_code);
            tauler.añadirPistasTablero(pista);
            tauler.MostraTauler(secret_code);
            if(codiDemanat.equals(secret_code.getSecretCode())){
                acabat = true;
                win();
            }
            intents++;
            }

            else{
                acabat =true;
                lose(secret_code.getSecretCode());
            }
        }
    }

    public static void win(){
        guanyat= true;
        System.out.println("11111111111111111111111111111111111111111111111111111");
        System.out.println("1111                  YOU WIN!!!                 1111");
        System.out.println("11111111111111111111111111111111111111111111111111111");
    }

    public static void lose(String codi){
        perdut = true;
        System.out.println("11111111111111111111111111111111111111111111111111111");
        System.out.println("1111             El joc s'ha acabat              1111");
        System.out.println("1111       La combinació guanyadora era:         1111");
        System.out.println(String.format("1111                   %s                      1111",codi));
        System.out.println("11111111111111111111111111111111111111111111111111111");
    }

    public static void missatge_inicial(){
        CodiSecret secret_code =  new CodiSecret();
        System.out.println("Les combinacions de colors disponibles son:");
        for(int i = 0; i < Main.Colors.size(); i++){
            System.out.print(Main.Colors.get(i)+ " ");
        }
        System.out.print("\nPer exemple: " + secret_code.getSecretCode()+"");
    }

    public boolean getGuanyat(){return this.guanyat;}
    public boolean getPerdut(){return this.perdut;}
    public int getIntents(){return this.intents;}
    public int DecConCoverage3(int input1, int input2){
        int contador = 0;
        if (input1 >4 || input1<2 ) {//no -inf a 2
            if (input2 <0)
                contador = -2;
            else
                contador = 100;
        }
        else
        if (input2 >0)
            contador = 10;
        else
            contador = 80;
        return contador;
    }

    //LOOP TESTING:  Funciones para hacer loop testing
    public int TestSimpleLoop1(int input){
        int contador = 0;
        for(; input < 10; input++){
            contador ++;
        }
        return  contador;

    }

}