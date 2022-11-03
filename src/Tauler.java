import java.util.ArrayList;

public class Tauler {
    private SecretCode CodiSecret;
    private ArrayList<Codi> llistaCodis;//llistat de tots els codis
    public Tauler() {
        llistaCodis = new ArrayList<Codi>();
    }
    public void guardarCodis(Codi codi) {
        this.llistaCodis.add(codi);
    }
    public void MostraTauler(SecretCode CodiSecret) {
        String tauler = " ";
        //tauler+="----------------------------------------------------\n";
        //tauler+="                    MASTERMIND                       \n";
        //tauler+="-----------------------------------------------------\n";
        tauler+="----------------------------------------------------\n";
        for(int i = 0; i< Main.Oportunitats; i++){
            if (this.llistaCodis.size() > i) {
                tauler += "| ";
                for (String cod : llistaCodis.get(i).getCodigo().split("")) {
                    tauler += cod + "      ";
                }
                tauler += "| ";

                tauler += "|\n";
            } else {
                tauler += "| -      -      -      -      | -    -    -    -    |\n";
            }
            tauler+="|---------------------------------------------------|\n";
            //Haurem de mostrar files per posar les peces de colors i per les comprovacions
        }

        System.out.println(tauler);
}
}