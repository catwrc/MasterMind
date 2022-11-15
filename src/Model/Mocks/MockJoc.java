package Model.Mocks;

import Model.Interficies.Joc_Interficie;

public class MockJoc implements Joc_Interficie {
    String pista = " FT ";
    public String getHint() {
        return this.pista;
    }

}
