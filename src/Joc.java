
import java.util.Arrays;
public class Joc {

    private String m_joc;

    public Joc(SecretCode codiSecret, Codi codiUsuari) {
        String combinacioPista = "";
        for(int i = 0; i<Main.numFil; i++){
            if(codiUsuari.getCodigo().split("")[i].equals(codiSecret.getSecretCode().split("")[i])){
            //El codi secret[i] i la combinacio de colors[i] del jugador son iguals
            combinacioPista += "x";
            }
            else{
                for(int j = 0; j<4; j++){
                    if(codiUsuari.getCodigo().split("")[i].equals(codiSecret.getSecretCode().split("")[j])){
                        //El codi secret[i] i la combinacio de colors[i] del jugador son iguals
                        combinacioPista += "o";
                        break;
                   }
                }

        }
    }
        this.m_joc = ordenarPista(combinacioPista);
}
    public String ordenarPista(String pistaDesordenada) {
        char pistaChars[] = pistaDesordenada.toCharArray();
        Arrays.sort(pistaChars);
        String pistaOrdenada = "";
        for (int i = 1; i < pistaChars.length + 1; i++) {
            pistaOrdenada += pistaChars[pistaChars.length - i];
        }
        return pistaOrdenada;
    }
    public String getJoc() { return this.m_joc; }
}
