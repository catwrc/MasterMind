import java.util.ArrayList;

public class Tauler {
    private SecretCode CodiSecret;
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

    public void añadirCodigosTablero(Codi codigo) {
        this.llistaCodis.add(codigo);
    }
    public void añadirPistasTablero(Joc pista) {
        this.llistaEncerts.add(pista);
    }
    public void guardarCodis(Codi codi) {
        this.llistaCodis.add(codi);
    }
    public void MostraTauler(SecretCode CodiSecret) {
        String tauler = " ";
        //tauler+="----------------------------------------------------\n";
        //tauler+="                    MASTERMIND                       \n";
        //tauler+="-----------------------------------------------------\n";

        //if (CodigoSecreto.is_secret){
            tauler += "| ";
            for (String cod : CodiSecret.getSecretCode().split("")) {
                tauler +=  cod + "      ";
            }
            tauler += "|\n";
        //}

        tauler+="----------------------------------------------------\n";
        for(int i = 0; i< Main.Oportunitats; i++){
            if (this.llistaCodis.size() > i) {
                tauler += "| ";
                for (String cod : llistaCodis.get(i).getCodigo().split("")) {
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
}