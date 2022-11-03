
import java.util.Arrays;
public class Joc {

    public Joc(SecretCode codiSecret, Codi codiUsuari) {
        String combinacioPista = "";
        for(int i = 0; i<Main.numFil; i++){
            if(codiUsuari.getCodigo().equals(codiSecret.getSecretCode())){
            //El codi secret[i] i la combinacio de colors[i] del jugador son iguals
            combinacioPista += "x";
            }
            else{
                for(int j = 0; i<Main.numFil; j++){
                    if(codiUsuari.getCodigo().equals(codiSecret.getSecretCode())){
                        //El codi secret[i] i la combinacio de colors[i] del jugador son iguals
                        combinacioPista += "o";
                    }
                }

        }
    }
}
}
