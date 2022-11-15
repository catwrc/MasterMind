package Model;

import Controlador.Main;

import java.util.Scanner;

public class IntroduirColors {

    static int intents = 0;

    //Funció que gestiona el codi que s'introdueix per teclat
    public static String EscollirColor(){
        while(intents<3){ //2 intents permesos d'introduir codis no correctes
            String llista = escriure();
            if(esCorrecte(llista)){
                return llista;
            }
            intents++;
        }
      return null;
    }

    //Controlem la mida del codi<5, que no sigui null i que nomes contingui lletres

    public static Boolean esCorrecte(String codi){
        boolean vari = NomesConteLletres(codi);
        if( codi.length() != Main.numFil || codi == null || !vari){
            System.out.println("El codi no es correcte!!!");
            return false;
        }
        return true;
    }

    //Funció que ens permet escriure per teclat el codi
    public static String escriure(){
        Scanner Teclat = new Scanner(System.in);
        System.out.println("\nEscriu la combinacio de colors que creguis mes convenient (R Y G B O P): ");
        return Teclat.nextLine().toUpperCase();
    }



    //Funció que controla que nomes es puguin lletres correctes(RYGBOP)
    public static boolean NomesConteLletres(String cadena) {

        for (int x = 0; x < cadena.length(); x++) {
            char c = cadena.charAt(x);
            if (!(c=='R'|| c=='Y'|| c=='G'|| c=='B'|| c=='O'|| c=='P')) {
                return false;
            }
        }
        return true;
    }


}