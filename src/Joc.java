
import java.util.Arrays;
public class Joc {

    private String m_joc;

    public Joc(SecretCode codiSecret, Codi codiUsuari) {
        String combinacioPista = "";
        for(int i = 0; i<Main.numFil; i++){
            if(codiUsuari.getCodigo().split("")[i].equals(codiSecret.getSecretCode().split("")[i])){

            //El codi secret[i] i la combinacio de colors[i] del jugador son iguals
            combinacioPista += "T";
            }
            else{
                boolean hiApareix = false;
                for(int j = 0; j<Main.numFil; j++){
                    if(codiUsuari.getCodigo().split("")[i].equals(codiSecret.getSecretCode().split("")[j])){
                        //El codi secret[i] i la combinacio de colors[i] del jugador son iguals
                        combinacioPista += "F";
                        hiApareix = true;
                        break;
                   }
                }
                if (!hiApareix) {
                    combinacioPista += " ";
                }
        }
    }
        //this.m_joc = ordenarPista(combinacioPista);
        this.m_joc = combinacioPista;
}
  /*  public String ordenarPista(String pistaDesordenada) {
        System.out.println("pista deodrdenadoa" + pistaDesordenada);
        char pistaChars[] = pistaDesordenada.toCharArray();
        Arrays.sort(pistaChars);
        String pistaOrdenada = "";
        for (int i = 1; i < pistaChars.length + 1; i++) {
            pistaOrdenada += pistaChars[pistaChars.length - i];
        }
        System.out.println("pista odrdenadoa" + pistaOrdenada);
        return pistaOrdenada;
    }*/
    public String getJoc() { return this.m_joc; }
}
