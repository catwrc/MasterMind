package Model;

import Controlador.Main;
import Model.Codi;
import Model.CodiSecret;

public class Joc {

    private String m_joc;

    public Joc(CodiSecret codiSecret, Codi codiUsuari) {
        String combinacioPista = "";
        for(int i = 0; i< Main.numFil; i++){
            if(codiUsuari.getCodi().split("")[i].equals(codiSecret.getSecretCode().split("")[i])){
            combinacioPista += "T";
            }
            else{
                boolean hiApareix = false;
                for(int j = 0; j<Main.numFil; j++){
                    if(codiUsuari.getCodi().split("")[i].equals(codiSecret.getSecretCode().split("")[j])){
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
        this.m_joc = combinacioPista;
}

    public String getJoc() { return this.m_joc; }
}
