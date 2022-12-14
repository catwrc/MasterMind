package Vista;

import Controlador.Main;
import Model.Codi;
import Model.CodiSecret;
import Model.Joc;

import java.util.ArrayList;

public class Tauler {
    private Model.CodiSecret CodiSecret;
    String tauler;
    private ArrayList<Codi> llistaCodis;//llistat de tots els codis
    private ArrayList<Joc> llistaEncerts;
    public Tauler() {
        llistaEncerts = new ArrayList<Joc>();
        llistaCodis = new ArrayList<Codi>();
    }
    public void setTauler(String tauler1) {
        this.tauler = tauler1;
    }

    public void AfegirCodiTaulell(Codi codigo) {
        this.llistaCodis.add(codigo);
    }
    public void AfegirPistaTaulell(Joc pista) {
        this.llistaEncerts.add(pista);
    }
    public void guardarCodis(Codi codi) {
        this.llistaCodis.add(codi);
    }
    public ArrayList<Joc> getPistasTauler() {
        return this.llistaEncerts;
    }
    public void MostraTauler(CodiSecret CodiSecret) {
        String tauler = " ";


            //Comentem aquest tros de codi ja que ens dona la combinaci√≥ del codi secret
           /* tauler += "| ";
            for (String cod : CodiSecret.getSecretCode().split("")) {
                tauler +=  cod + "      ";
            }
            tauler += "|\n";
            */
        tauler+="----------------------------------------------------\n";
        for(int i = 0; i< Main.Oportunitats; i++){
            if (this.llistaCodis.size() > i) {
                tauler += "| ";
                for (String cod : llistaCodis.get(i).getCodi().split("")) {
                    tauler += cod + "      ";
                }
                tauler += "| ";
                for (String pista : llistaEncerts.get(i).getJoc().split("")) {
                    tauler += pista + "    ";
                }
                tauler += "|\n";
            } else {
                tauler += "| -      -      -      -      | -    -    -    -    |\n";
            }
            tauler+="|---------------------------------------------------|\n";
            //Haurem de mostrar files per posar les peces de colors i per les comprovacions
        }
        setTauler(tauler);
        System.out.println(tauler);
}

    //Funci√≥ pel test del tauler
    public String Mostra() {
        String tauler = " ";
        tauler="|---------------------------------------------------|\n";
        for(int i = 0; i< Main.Oportunitats; i++){
            tauler += "| -      -      -      -      | -    -    -    -    |\n";
            tauler+="|---------------------------------------------------|\n";
            //Haurem de mostrar files per posar les peces de colors i per les comprovacions
        }
        return tauler;
    }
}