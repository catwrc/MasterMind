package Model.Mocks;

import Model.Interficies.Codi_Interficie;

import java.util.Locale;

public class MockJugador implements Codi_Interficie {

    public String code = "POGY".toUpperCase(Locale.ROOT);

    public String introduirCodi(){return code ;}
    public Boolean correct_code(String st ){
        return true;}

    public void setCode(String code) {
        this.code = code;
    }
}
