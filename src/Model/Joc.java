package Model;

import Controlador.Main;

public class Joc {

    private String m_joc;

    //Amb aquesta funció gestionem si el codi introduït per teclat és semblant amb el codi secret
    //posem una T quan en la posició i el color són correctes, una F quan el color existeix en el codi
    //però no està a la posició correcta i posem conjunt buit quan el color no existeix el
    //el codi secret
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


  // Contructor pel Mock
    public Joc(SecretCode_Interficie codiSecret, Codi codiUsuari) {
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
