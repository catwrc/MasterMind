package Model.Mocks;

import Model.Joc_Interficie;

public class MockJoc implements Joc_Interficie {
    String pista = " FT ";
    public String getHint() {
        return this.pista;
    }

}
