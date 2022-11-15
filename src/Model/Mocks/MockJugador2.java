package Model.Mocks;

import Model.Interficies.Codi_Interficie;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;

public class MockJugador2 implements Codi_Interficie {

    public String codi = "POGY".toUpperCase(Locale.ROOT);

    //Seqüència de jugades que introduirà per teclat el jugador
    public static final List<String> codiJugador = new ArrayList<String>(List.of("FFFF","BGYR", "BOYR", "YOGR", "YRGO", "YOGO", "YOPY","YYPO"));
    public int contadorArray = 0;
    public String introduirCodi(){
        if (contadorArray == this.codiJugador.size())
            this.contadorArray =0;
        int cont_actual = this.contadorArray;
        this.contadorArray++;
        return this.codiJugador.get(cont_actual) ;
    }
    public Boolean correct_code(String codi ){
        return true;
    }

    public void setCode(String code) {
        this.codi = code;
    }
}
