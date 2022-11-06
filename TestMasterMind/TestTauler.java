import Controlador.Main;
import Model.CodiSecret;
import Vista.Tauler;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.testng.AssertJUnit.assertEquals;

public class TestTauler {
    Tauler tauler;
    @BeforeEach
    void Test1(){
        tauler = new Tauler();
    }
    @Test
    public void Mostra() {
        String a= tauler.Mostra();
        String taulerTest = " ";
        taulerTest="|---------------------------------------------------|\n";
        taulerTest += "| -      -      -      -      | -    -    -    -    |\n";
        taulerTest+="|---------------------------------------------------|\n";
        taulerTest += "| -      -      -      -      | -    -    -    -    |\n";
        taulerTest+="|---------------------------------------------------|\n";
        taulerTest += "| -      -      -      -      | -    -    -    -    |\n";
        taulerTest+="|---------------------------------------------------|\n";
        taulerTest += "| -      -      -      -      | -    -    -    -    |\n";
        taulerTest+="|---------------------------------------------------|\n";
        taulerTest += "| -      -      -      -      | -    -    -    -    |\n";
        taulerTest+="|---------------------------------------------------|\n";
        taulerTest += "| -      -      -      -      | -    -    -    -    |\n";
        taulerTest+="|---------------------------------------------------|\n";
        taulerTest += "| -      -      -      -      | -    -    -    -    |\n";
        taulerTest+="|---------------------------------------------------|\n";
        taulerTest += "| -      -      -      -      | -    -    -    -    |\n";
        taulerTest+="|---------------------------------------------------|\n";

        assertEquals(taulerTest,a);

    }
}
