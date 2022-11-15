package Model;

import Controlador.Main;

public class Joc {

    private final String m_joc;

    //Amb aquesta funció gestionem si el codi introduït per teclat és semblant amb el codi secret
    //posem una T quan en la posició i el color són correctes, una F quan el color existeix en el codi
    //però no està a la posició correcta i posem conjunt buit quan el color no existeix el
    // codi secret
    public Joc(CodiSecret codiSecret, Codi codiUsuari) {
        StringBuilder combinacioPista = new StringBuilder();
        for(int i = 0; i< Main.numFil; i++){
            if(codiUsuari.getCodi().split("")[i].equals(codiSecret.getSecretCode().split("")[i])){
            combinacioPista.append("T");
            }
            else{
                boolean hiApareix = false;
                for(int j = 0; j<Main.numFil; j++){
                    if(codiUsuari.getCodi().split("")[i].equals(codiSecret.getSecretCode().split("")[j])){
                        combinacioPista.append("F");
                        hiApareix = true;
                        break;
                   }
                }
                if (!hiApareix) {
                    combinacioPista.append(" ");
                }
        }
    }
        this.m_joc = combinacioPista.toString();
}


  // Contructor pel Mock
    public Joc(SecretCode_Interficie codiSecret, Codi codiUsuari) {
        StringBuilder combinacioPista = new StringBuilder();
        for(int i = 0; i< Main.numFil; i++){
            if(codiUsuari.getCodi().split("")[i].equals(codiSecret.getSecretCode().split("")[i])){
                combinacioPista.append("T");
            }
            else{
                boolean hiApareix = false;
                for(int j = 0; j<Main.numFil; j++){
                    if(codiUsuari.getCodi().split("")[i].equals(codiSecret.getSecretCode().split("")[j])){
                        combinacioPista.append("F");
                        hiApareix = true;
                        break;
                    }
                }
                if (!hiApareix) {
                    combinacioPista.append(" ");
                }
            }
        }
        this.m_joc = combinacioPista.toString();
    }

    public String getJoc() { return this.m_joc; }
}
