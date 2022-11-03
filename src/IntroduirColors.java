import java.util.Scanner;

public class IntroduirColors {

    public static String EscollirColor(){
        int y;

        System.out.println("Colors disponible:");
        for(int i = 0; i < Main.Colors.size(); i++){
            System.out.print(Main.Colors.get(i)+ " ");
        }

        Scanner Teclat = new Scanner(System.in);
        System.out.println("\nEscriu la combinacio de colors que creguis mes convenient: ");

        String llista = Teclat.nextLine().toUpperCase();

        if(codiCorrecte(llista)){
            return llista;
        }

      return null;
    }
    public static Boolean codiCorrecte(String codi){
        if( codi.length() != Main.numFil ){
            System.out.println("Codi massa llarg!");
            return false;
        }
        return true;
    }

}