import Model.Codi;
import org.testng.annotations.Test;

;import static org.testng.AssertJUnit.*;

public class TestCodi {

    //Test del constructor del codi intriduit per l'usuari
    Codi varTest;
    @Test
    void ConstructorCodiTest1(){
        varTest = new Codi("RYGO");
        assertEquals("RYGO", varTest.getCodi());
    }


    //Test particions equivalents
    @Test
    void CodiTest2(){
        varTest = new Codi("RYGO");
        assertFalse(varTest.TestCodi("RYGP"));
    }
    //Test particions equivalents
    @Test
    void toUppercase(){
        Codi codi = new Codi("rygo");
        assertEquals("RYGO", codi.getCodi());
    }
}
