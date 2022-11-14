import Model.Codi;
import org.testng.annotations.Test;

;import static org.testng.AssertJUnit.assertEquals;
import static org.testng.AssertJUnit.assertFalse;

public class TestCodi {

    //Test del constructor del codi intriduit per l'usuari
    Codi varTest;
    @Test
    void ConstructorCodiTest1(){
        varTest = new Codi("RYGO");
        assertEquals("RYGO", varTest.getCodi());
    }

    @Test
    void CodiTest2(){
        varTest = new Codi("RYGO");
        assertFalse(varTest.TestCodi("RYGP"));
    }
}
