package Controlador;

import Model.*;
import Model.Interficies.Codi_Interficie;
import Model.Interficies.SecretCode_Interficie;
import Vista.Tauler;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;


public class Main {

    private static CodiSecret secretCode;

    public static int Oportunitats = 8; // nombre intents joc
    private static Joc pista;
    public static int numFil = 4; // numero files
    //R = red, Y =yellow, G =green, B = blue, O = orange, P = purple
    public static List<String> Colors = Arrays.asList("R", "Y", "G", "B", "O", "P"); //colors disponibles
    private static Tauler tauler;
    private static Codi codii;
    private static boolean acabat;
    private static boolean perdut;
    private static boolean guanyat;
    private static int intents;
    private final ArrayList<String> llistaIntents;

    public Main(){
        tauler = new Tauler();
        secretCode = new CodiSecret();
        acabat = false;
        perdut= false;
        guanyat= false;
        intents= 0;
        codii = new Codi();
        llistaIntents = new ArrayList<>();

    }

    //Funció principal del joc s'encarrega de gestionar el codi secret, el codi que
    //introdueix l'usuari i del taulell de joc
    public static void main(String[] args) {
        new Main();
        tauler.Mostra();
        CodiSecret secret_code =  new CodiSecret();
        missatge_inicial();
        while(!acabat){
            if(intents<8){
                String codiDemanat = IntroduirColors.EscollirColor();
                if(codiDemanat==null){
                break;
                }
            Codi user_code =  new Codi(codiDemanat);
            tauler.AfegirCodiTaulell(new Codi(codiDemanat));
            pista = new Joc(secret_code, user_code);
            tauler.AfegirPistaTaulell(pista);
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
        System.out.print("Per exemple: " + secret_code.getSecretCode()+"");
        System.out.print("\nF = Exiteix pero no esta a la posicio correcta, T = posicio i color correcta ");
        System.out.print("\nConjunt buit = no exiteix aquest color");
    }

    public Tauler getTauler(){return tauler;}

    public boolean getGuanyat(){return this.guanyat;}
    public boolean getPerdut(){return this.perdut;}
    public int getIntents(){return this.intents;}



    /* ***********Testing Mock Objects********************* */
    public Codi_Interficie simulacioJoc;
    public void setJugador(Codi_Interficie jugador){this.simulacioJoc = jugador;}
    public String codiMock;
    public boolean codiCorrecte;

    public void Inicia_Mock(){
        codiMock = simulacioJoc.introduirCodi();
        codiCorrecte = simulacioJoc.correct_code(codiMock);
    }

    //funció similar a la del main per al mock object que simula una partida sense jugadors real
    public void mainMock(){
        int intents=0;
        boolean acabat=false;
        int i=1;
        while(!acabat){
            if(intents<Oportunitats){
                String codi = this.simulacioJoc.introduirCodi(); // llista codis simulat Jugador2
                this.llistaIntents.add(codi);
                while ( codi == null){
                    System.out.println("El codi es null");
                }
                introdueixCodi(codi);
                intents++;
            }
            else{
                acabat = true;
            }
            i++;
        }
    }

    public SecretCode_Interficie SecretCodeInterface;
    public void codisecretInterficie(SecretCode_Interficie MockSCode){ this.SecretCodeInterface = MockSCode ;}
    //Mock del codi secret, la crida el mainMock
    public void introdueixCodi(String code){
        Codi codi = new Codi(code);
        CodiSecret a = new CodiSecret();
        a.setCodiSecret("YYPO");  //aquest es el codi secret pel moock object
        tauler.AfegirCodiTaulell(new Codi(code));
        pista = new Joc(this.SecretCodeInterface, codi);
        tauler.AfegirPistaTaulell(pista);
        tauler.MostraTauler(a);
        if(code.equals(a.getSecretCode())){
            acabat = true;
            win();
        }
        else{
            acabat =true;
            //lose(a.getSecretCode());
        }
    }

    //Fem path coverage per testejar la funció Main del joc
    public int pathCoverage(boolean isOver, int intents, String code_user, String code_user_null){
        int i = 1;
        i++;
        while(!isOver){
            i++;
            if(intents < Oportunitats){
                i++;
                String var = code_user; i++;
                this.llistaIntents.add(var); i++;
                while (var == null){
                    i++;
                    var = code_user_null; i++;
                }
                if(var != null)i++;
                introdueixCodi(var); i++;
                intents++; i++; isOver = true;
            }
            else{
                i++;
                isOver = true; i++;
                i++;
            }
        }
        i++;
        return i;
    }

    // Cas extra de decision y conditional coverage
    public int Coverage(int val1, int val2){
        int sumatori = 0;
        if (val1 >4 || val2<1 ) {
            if (val2 <0)
                sumatori = -2;
            else
                sumatori = 100;
        }
        else
            if (val2 >1)
                sumatori = 10;
            else
                sumatori = 80;
            return sumatori;
    }
}