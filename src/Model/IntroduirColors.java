package Model;

import Controlador.Main;

import java.util.Scanner;

public class IntroduirColors {

    static int intents = 0;
    public static String EscollirColor(){
        int y;
        while(intents<2){
            String llista = escriure();
            if(esCorrecte(llista)){
                return llista;
            }
            intents++;
        }

      return null;
    }

    public static Boolean esCorrecte(String codi){
        if(codi==null){return false;}
        boolean vari = contieneSoloLetras(codi);
        if( codi.length() != Main.numFil || codi == null || !vari){
            System.out.println("El codi no es correcte!!!");
            return false;
        }
        return true;
    }

    //Funció que ens permet escriure per teclat
    public static String escriure(){
        Scanner Teclat = new Scanner(System.in);
        System.out.println("\nEscriu la combinacio de colors que creguis mes convenient: ");
        String llista = Teclat.nextLine().toUpperCase();
        return llista;
    }



    //Funció que controla que nomes es puguin lletres correctes(RYGBOP)
    public static boolean contieneSoloLetras(String cadena) {
        for (int x = 0; x < cadena.length(); x++) {
            char c = cadena.charAt(x);
            if (!(c=='R'|| c=='Y'|| c=='G'|| c=='B'|| c=='O'|| c=='P')) {
                return false;
            }
        }
        return true;
    }


}